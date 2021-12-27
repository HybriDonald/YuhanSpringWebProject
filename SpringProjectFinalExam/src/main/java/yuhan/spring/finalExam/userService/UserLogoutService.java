package yuhan.spring.finalExam.userService;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class UserLogoutService implements IUserService {

	@Override
	public void excute(Model model) {
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		request.getSession().invalidate();
		
	}

}
