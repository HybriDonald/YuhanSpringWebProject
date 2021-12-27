package yuhan.spring.finalExam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.spring.finalExam.dao.BoardDao;
import yuhan.spring.finalExam.dto.BoardDto;
import yuhan.spring.finalExam.util.Paging;
import yuhan.spring.finalExam.boardService.BoardDeleteService;
import yuhan.spring.finalExam.boardService.BoardViewService;
import yuhan.spring.finalExam.boardService.BoardWriteService;
import yuhan.spring.finalExam.boardService.IBoardSerivce;

@Controller
public class BoardController {

	IBoardSerivce service;
	
	@RequestMapping(value="board")
	public String board(HttpServletRequest request, Model model) throws Exception{
		
		BoardDao dao = new BoardDao();
		Paging paging = new Paging();
		
		int currentPage;
		if (request.getParameter("currentPage") == null)
			currentPage = 1;
		else
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		model.addAttribute("dtos", dao.boardList(currentPage));
		model.addAttribute("startpage", paging.paging(currentPage, dao.boardCount())[0]);
		model.addAttribute("endpage", paging.paging(currentPage, dao.boardCount())[1]);
		model.addAttribute("currentPage", currentPage);
		
		return "board/board";
	}
	
	@RequestMapping(value="boardView")
	public String boardView(HttpServletRequest request, Model model) {
		service = new BoardViewService();
		model.addAttribute("request", request);
		
		service.excute(model);
		
		return "board/boardView";
	}
	
	@RequestMapping(value="boardWrite")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping(value="boardWrite.do")
	public String boardWriteDo(HttpServletRequest request, Model model) {
		service = new BoardWriteService();
		model.addAttribute("request", request);
		
		service.excute(model);
		return "redirect:board";
	}
	
	@RequestMapping(value="boardDel.do")
	public String boardDeleteDo(HttpServletRequest request, Model model) {
		service = new BoardDeleteService();
		model.addAttribute("request", request);
		
		service.excute(model);
		return "redirect:board";
	}
}
