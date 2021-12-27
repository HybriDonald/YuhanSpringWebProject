package yuhan.spring.finalExam.userService;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import yuhan.spring.finalExam.dao.UserDao;
import yuhan.spring.finalExam.dto.UserDto;

public class UserLoginService implements IUserService {

	private int loginResult = 0;
	private String user_id;
	private String user_pw;
	
	@Override
	public void excute(Model model) {
			
			Map<String, Object> map = model.asMap();

			HttpServletRequest request = (HttpServletRequest)map.get("request");
			HttpServletResponse response = (HttpServletResponse)map.get("response");
			
			this.user_id = request.getParameter("user_id");
			this.user_pw = request.getParameter("user_pw");
			
			UserDao dao = new UserDao();
			this.loginResult = dao.login(this.user_id, this.user_pw);
			
			try {
				loginCheck(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	private void loginCheck(HttpServletRequest request, HttpServletResponse response) throws Exception{
			PrintWriter out;
			response.setContentType("text/html;charset=utf-8");
			out = response.getWriter();
				
			HttpSession session = request.getSession();	
			
			switch(this.loginResult) {	
				case 0:
					System.out.println("아이디 오류");
					out.println("<script>");
					out.println("alert('아이디가 존재하지 않거나 틀렸습니다.'); location.href='login';");
					out.println("</script>");
					break;
				case 1:
					System.out.println("비밀번호 오류");
					out.println("<script>");
					out.println("alert('비밀번호가 틀렸습니다.'); location.href='login';");
					out.println("</script>");
					break;
				case 2:
					System.out.println("로그인 성공");
					session.setAttribute("user_id", this.user_id);
					session.setMaxInactiveInterval(0);
					response.sendRedirect("home");
					break;
			}
			
			System.out.println("out객체 닫힘");
			System.out.println(session.getAttribute("user_id"));
			out.close();
	}

}
