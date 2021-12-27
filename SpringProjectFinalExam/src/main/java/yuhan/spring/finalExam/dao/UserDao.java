package yuhan.spring.finalExam.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.directory.InitialDirContext;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import yuhan.spring.finalExam.dto.UserDto;
import yuhan.spring.finalExam.util.ConstantTemplate;

public class UserDao {
	
	JdbcTemplate jdbcTemp;
	
	public UserDao() {
		jdbcTemp = ConstantTemplate.template;
	}
	
	public void register(final UserDto dto) {
		String sql = "insert into turtle_user"
				+  " values(?, ?, ?, ?, ?, ?, ?)";
		
		this.jdbcTemp.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, dto.getUser_id());
				ps.setString(2, dto.getUser_pw());
				ps.setString(3, dto.getUser_mail());
				ps.setString(4, dto.getUser_name());
				ps.setString(5, dto.getUser_address());
				ps.setString(6, dto.getUser_phone());
				ps.setString(7, dto.getUser_birthday());
				
			}
		});
	}
	
	public int login(final String id, final String pw) {
		String sql = "select user_id, user_pw "
				+ "from turtle_user where user_id = ?";
		List<UserDto> result = 
					this.jdbcTemp.query(sql, new RowMapper<UserDto>() {
			@Override
			public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDto dto = new UserDto();
				dto.setUser_id(rs.getString("user_id"));
				dto.setUser_pw(rs.getString("user_pw"));
				dto.Print();
				return dto;
			}
		}, id);

		if (result.size() == 0)
			return 0;
		if (!result.get(0).getUser_pw().equals(pw))
			return 1;
		return 2;
		
	}
	
}
