package yuhan.spring.finalExam.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import yuhan.spring.finalExam.dto.WebtoonDto;
import yuhan.spring.finalExam.util.ConstantTemplate;

public class WebToonDao {

	JdbcTemplate jdbcTemp;
	private static final int MAXPAGE = 9;
	
	public WebToonDao() {
		this.jdbcTemp = ConstantTemplate.template;
	}
	
	public void regWebtoon(final WebtoonDto dto) {
		String sql = "insert into turtle_webtoon "
					+ "values(turtle_webtoon_seq.nextval, ?, ?, ?, ?)";
		
		jdbcTemp.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getWebtoon_title());
				ps.setString(2, dto.getWebtoon_desc());
				ps.setString(3, dto.getWebtoon_comp());
				ps.setString(4, dto.getWebtoon_pic());
			}
		});
	}
	
	public List<WebtoonDto> webtoonList(int page) {
		String sql = "select * from ("
				+ "select rownum as rnum, A.* from ("
				+ "select * from turtle_webtoon order by webtoon_no desc"
				+ ") A"
				+ ")where rnum >= ? and rnum <= ?";
		List<WebtoonDto> dtos;
		int start = (page - 1) * MAXPAGE + 1;
		int end = start + MAXPAGE - 1;
		
		dtos = jdbcTemp.query(sql, new RowMapper<WebtoonDto>() {
			
			@Override
			public WebtoonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				WebtoonDto dto = new WebtoonDto(
						rs.getString("webtoon_no"),
						rs.getString("webtoon_title"),
						rs.getString("webtoon_desc"),
						rs.getString("webtoon_comp"),
						rs.getString("webtoon_pic"));
				return dto;
			}
		}, start, end);
		
		return dtos;
	}
	
	public List<WebtoonDto> homeWebtoonList() {
		String sql = "select * from("
			    + "select * from turtle_webtoon "
			    + "order by DBMS_RANDOM.RANDOM"
			    + ") where rownum <= 10";
		List<WebtoonDto> dtos;
		
		dtos = jdbcTemp.query(sql, new RowMapper<WebtoonDto>() {
			
			@Override
			public WebtoonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				WebtoonDto dto = new WebtoonDto(
						rs.getString("webtoon_no"),
						rs.getString("webtoon_title"),
						rs.getString("webtoon_desc"),
						rs.getString("webtoon_comp"),
						rs.getString("webtoon_pic"));
				return dto;
			}
		});
		
		return dtos;
	}
	
	public int webtoonCount() {
		String sql = "select count(*) from turtle_webtoon";
		int count;
		
		count = jdbcTemp.queryForObject(sql, Integer.class);
		
		return count;
	}
	
	public WebtoonDto webtoonView(String webtoon_no) {
		String sql = "select * from turtle_webtoon "
				+ "where webtoon_no = ?";
		List<WebtoonDto> dtos = jdbcTemp.query(sql, new RowMapper<WebtoonDto>() {
			
			@Override
			public WebtoonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				WebtoonDto dto = new WebtoonDto(
						rs.getString("webtoon_no"),
						rs.getString("webtoon_title"),
						rs.getString("webtoon_desc"),
						rs.getString("webtoon_comp"),
						rs.getString("webtoon_pic"));
				return dto;
			}
		}, webtoon_no);
		
		return dtos.get(0);
	}
}
