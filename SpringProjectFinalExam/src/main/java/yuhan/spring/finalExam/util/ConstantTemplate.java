package yuhan.spring.finalExam.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

public class ConstantTemplate {

	public static JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		ConstantTemplate.template = template;
	}
	

	
}
