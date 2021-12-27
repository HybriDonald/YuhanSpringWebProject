package yuhan.spring.finalExam.dto;

import java.sql.Date;



public class UserDto {
	String user_id;
	String user_pw;
	String user_mail;
	String user_name;
	String user_address;
	String user_phone;
	String user_birthday;
	
	public UserDto() {}
	
	public UserDto(String user_id, String user_pw, String user_mail, 
					String user_name, String user_address, String user_phone,
					String user_birthday) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_mail = user_mail;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_phone = user_phone;
		this.user_birthday = user_birthday;
	}
	
	public void Print() {
		System.out.println("user_id = " + user_id);
		System.out.println("user_pw = " + user_pw);
		System.out.println("user_mail = " + user_mail);
		System.out.println("user_name = " + user_name);
		System.out.println("user_address = " + user_address);
		System.out.println("user_phone = " + user_phone);
		System.out.println("user_birthday = " + user_birthday);
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	
	
}
