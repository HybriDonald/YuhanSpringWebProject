package yuhan.spring.finalExam;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.spring.finalExam.dao.WebToonDao;
import yuhan.spring.finalExam.util.ConstantTemplate;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		ConstantTemplate.template = this.template;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"home", "/"})
	public String home(HttpServletRequest request, Model model) {

		WebToonDao dao = new WebToonDao();

		model.addAttribute("dtos", dao.homeWebtoonList());
		return "home";
	}
	
	@RequestMapping(value="info")
	public String info() {
		return "info2";
	}
	
	
	
}
