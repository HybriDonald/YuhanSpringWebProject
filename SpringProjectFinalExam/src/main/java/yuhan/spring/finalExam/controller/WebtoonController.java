package yuhan.spring.finalExam.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.spring.finalExam.dao.WebToonDao;
import yuhan.spring.finalExam.util.Paging;
import yuhan.spring.finalExam.webtoonService.IWebtoonService;
import yuhan.spring.finalExam.webtoonService.RegWebbtonService;

@Controller
public class WebtoonController {
	
	IWebtoonService service;
	
	@RequestMapping(value="regwebtoon")
	public String regWebtoon() {
		
		return "webtoon/regwebtoon";
	}
	
	@RequestMapping(value="regweb.do")
	public String regWeb(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		service = new RegWebbtonService();
		service.excute(model);
		return "redirect:regwebtoon";
	}
	
	@RequestMapping(value="webtoonList")
	public String webtoonList(HttpServletRequest request, Model model) throws Exception{
		
		WebToonDao dao = new WebToonDao();
		Paging paging = new Paging();
		
		int currentPage;
		if (request.getParameter("currentPage") == null)
			currentPage = 1;
		else
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		model.addAttribute("dtos", dao.webtoonList(currentPage));
		model.addAttribute("startpage", paging.paging(currentPage, dao.webtoonCount())[0]);
		model.addAttribute("endpage", paging.paging(currentPage, dao.webtoonCount())[1]);
		model.addAttribute("currentPage", currentPage);
		
		return "webtoon/webtoonList";
	}
	
	@RequestMapping(value="webtoonView")
	public String webtoonView(HttpServletRequest request, Model model) {
		WebToonDao dao = new WebToonDao();
		String webtoon_no = request.getParameter("webtoon_no");
		
		model.addAttribute("dto", dao.webtoonView(webtoon_no));
		return "webtoon/webtoonView";
	}
	
}
