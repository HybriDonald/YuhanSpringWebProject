package yuhan.spring.finalExam.util;

public class Paging {
	
	private static final int MAXLIST = 10;
	
	public int[] paging(int page, int totalContent) throws Exception{
			
		int totalArticle = 0;
		int totalPage = 0;
		
		totalArticle = totalContent;
		
		totalPage = totalArticle / MAXLIST;
		if(totalArticle % MAXLIST > 0) {
			totalPage++;
		}
		
		int startPage, endPage;
		startPage = ((page - 1) / MAXLIST) * MAXLIST + 1;
		
		endPage = startPage + MAXLIST - 1;
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		int[] paging = new int[2];
		paging[0] = startPage;
		paging[1] = endPage;
		
		return paging;
	}
}
