package yuhan.spring.finalExam.boardService;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import yuhan.spring.finalExam.dao.BoardDao;
import yuhan.spring.finalExam.dto.BoardDto;


public class BoardWriteService implements IBoardSerivce{
	
	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		HttpSession session = request.getSession();
		
		String board_title = request.getParameter("board_title");
		String board_auth = (String)session.getAttribute("user_id");
		String board_date = LocalDate.now().toString();
		String board_content = request.getParameter("board_content");
		
		BoardDto dto = new BoardDto(board_title, board_auth, board_date, board_content);
		BoardDao dao = new BoardDao();
		
		dao.insert(dto);
	}
}
