package yuhan.spring.finalExam.boardService;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import yuhan.spring.finalExam.dao.BoardDao;

public class BoardViewService implements IBoardSerivce {
	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String Board_no = request.getParameter("board_no");
		
		BoardDao dao = new BoardDao();
		
		model.addAttribute("dto", dao.boardView(Board_no));
	}
}
