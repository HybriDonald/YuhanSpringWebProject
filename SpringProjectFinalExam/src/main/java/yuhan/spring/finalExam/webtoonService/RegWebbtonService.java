package yuhan.spring.finalExam.webtoonService;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import yuhan.spring.finalExam.dao.WebToonDao;
import yuhan.spring.finalExam.dto.WebtoonDto;

public class RegWebbtonService implements IWebtoonService {

	@Override
	public void excute(Model model) {

		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String webtoon_title = request.getParameter("title");
		String webtoon_desc = request.getParameter("desc");
		String webtoon_comp = request.getParameter("comp");
		String webtoon_pic = request.getParameter("pic");
		
		WebtoonDto dto = new WebtoonDto(webtoon_title, webtoon_desc, 
										webtoon_comp, webtoon_pic);
		WebToonDao dao = new WebToonDao();
		dao.regWebtoon(dto);
	}

}
