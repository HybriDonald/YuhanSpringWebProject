package yuhan.spring.finalExam.dto;

public class BoardDto {

	public String board_no;
	public String board_title;
	public String board_auth;
	public String board_date;
	public String board_count;
	public String board_content;
	
	public BoardDto(String board_title, String board_auth, String board_date, String board_content) {
		this.board_title = board_title;
		this.board_auth = board_auth;
		this.board_date = board_date;
		this.board_content = board_content;
	}
	
	public BoardDto(String board_title, String board_auth, String board_date, String board_count,
			String board_content) {
		super();
		this.board_title = board_title;
		this.board_auth = board_auth;
		this.board_date = board_date;
		this.board_count = board_count;
		this.board_content = board_content;
	}

	public BoardDto(String board_no, String board_title, String board_auth, String board_date, String board_count,
			String board_content) {
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_auth = board_auth;
		this.board_date = board_date;
		this.board_count = board_count;
		this.board_content = board_content;
	}
	
	public String getBoard_no() {
		return board_no;
	}
	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_auth() {
		return board_auth;
	}
	public void setBoard_auth(String board_auth) {
		this.board_auth = board_auth;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getBoard_count() {
		return board_count;
	}
	public void setBoard_count(String board_count) {
		this.board_count = board_count;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	
	
}
