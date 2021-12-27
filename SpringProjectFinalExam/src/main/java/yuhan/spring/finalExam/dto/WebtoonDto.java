package yuhan.spring.finalExam.dto;

public class WebtoonDto {
	
	public String webtoon_no;
	public String webtoon_title;
	public String webtoon_desc;
	public String webtoon_comp;
	public String webtoon_pic;
	
	public WebtoonDto(String webtoon_title, String webtoon_desc, 
					String webtoon_comp, String webtoon_pic) {
		this.webtoon_title = webtoon_title;
		this.webtoon_desc = webtoon_desc;
		this.webtoon_comp = webtoon_comp;
		this.webtoon_pic = webtoon_pic;
	}
	
	public WebtoonDto(String webtoon_no, String webtoon_title, 
						String webtoon_desc, String webtoon_comp,
						String webtoon_pic) {
		this.webtoon_no = webtoon_no;
		this.webtoon_title = webtoon_title;
		this.webtoon_desc = webtoon_desc;
		this.webtoon_comp = webtoon_comp;
		this.webtoon_pic = webtoon_pic;
	}
	
	public String getWebtoon_no() {
		return webtoon_no;
	}
	public void setWebtoon_no(String webtoon_no) {
		this.webtoon_no = webtoon_no;
	}
	public String getWebtoon_title() {
		return webtoon_title;
	}
	public void setWebtoon_title(String webtoon_title) {
		this.webtoon_title = webtoon_title;
	}
	public String getWebtoon_desc() {
		return webtoon_desc;
	}
	public void setWebtoon_desc(String webtoon_desc) {
		this.webtoon_desc = webtoon_desc;
	}
	public String getWebtoon_comp() {
		return webtoon_comp;
	}
	public void setWebtoon_comp(String webtoon_comp) {
		this.webtoon_comp = webtoon_comp;
	}
	public String getWebtoon_pic() {
		return webtoon_pic;
	}
	public void setWebtoon_pic(String webtoon_pic) {
		this.webtoon_pic = webtoon_pic;
	}
	
	
	
}
