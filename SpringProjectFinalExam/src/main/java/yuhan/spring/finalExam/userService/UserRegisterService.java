package yuhan.spring.finalExam.userService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import yuhan.spring.finalExam.dao.UserDao;
import yuhan.spring.finalExam.dto.UserDto;


public class UserRegisterService implements IUserService {
	
	@Override
	public void excute(Model model) {
			
			Map<String, Object> map = model.asMap();
			
			HttpServletRequest request = (HttpServletRequest)map.get("request");
			
			String user_id = request.getParameter("id");
			String user_pw = request.getParameter("passwd");
			String user_mail = request.getParameter("email");
			String user_name = request.getParameter("name");
			String user_address = request.getParameter("address");
			String user_phone = request.getParameter("tel");
			String user_birthday = request.getParameter("birth");
			
			UserDto dto = new UserDto(user_id, user_pw, user_mail, user_name,
									user_address, user_phone, user_birthday);
			
			UserDao dao = new UserDao();
			dao.register(dto);
		
	}
}
