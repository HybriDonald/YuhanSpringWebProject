package yuhan.spring.finalExam.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import yuhan.spring.finalExam.dto.BoardDto;
import yuhan.spring.finalExam.util.ConstantTemplate;

public class BoardDao {

	JdbcTemplate jdbcTemp;
	private static final int MAXPAGE = 10;
	
	public BoardDao() {
		this.jdbcTemp = ConstantTemplate.template;
	}
	
	
	public List<BoardDto> boardList(int page) {
		
		String sql = "select * from ("
				+ "select rownum as rnum, A.* from ("
				+ "select * from turtle_board order by board_no desc"
				+ ") A"
				+ ")where rnum >= ? and rnum <= ?";
		List<BoardDto> dtos;
		int start = (page - 1) * MAXPAGE + 1;
		int end = start + MAXPAGE - 1;
		
		System.out.println(start + " " + end);
		
		dtos = jdbcTemp.query(sql, new RowMapper<BoardDto>() {
			
			@Override
			public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardDto dto = new BoardDto(
						rs.getString("board_no"),
						rs.getString("board_title"),
						rs.getString("board_auth"),
						rs.getString("board_date"),
						rs.getString("board_count"),
						rs.getString("board_content"));
				
				return dto;
			}
		}, start, end);
		
		return dtos;
	}
	
	public int boardCount() {
		String sql = "select count(*) from turtle_board";
		int count;
		
		count = jdbcTemp.queryForObject(sql, Integer.class);
		
		return count;
	}
	
	public void insert(final BoardDto dto) {
		String sql = "insert into turtle_board(board_no, board_title, board_auth, board_date, board_content)"
				+ "values(turtle_board_seq.nextval, ?, ?, ?, ?)";
		
		jdbcTemp.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getBoard_title());
				ps.setString(2, dto.getBoard_auth());
				ps.setString(3, dto.getBoard_date());
				ps.setString(4, dto.getBoard_content());
			}
		});
	}
	
	public BoardDto boardView(String board_no) {
		String sql = "select * from turtle_board "
				+ "where board_no = ?";
		List<BoardDto> dtos = jdbcTemp.query(sql, new RowMapper<BoardDto>() {
			@Override
			public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				BoardDto dto = new BoardDto(
							rs.getString("board_no"),
							rs.getString("board_title"),
							rs.getString("board_auth"),
							rs.getString("board_date"),
							rs.getString("board_count"),
							rs.getString("board_content"));
				return dto;
			}
		}, board_no);
		
		return dtos.get(0);
	}
	
	public void delete(String Board_no) {
		String sql = "delete turtle_board where board_no = ?";
		
		jdbcTemp.update(sql, Board_no);
	}
	
}
