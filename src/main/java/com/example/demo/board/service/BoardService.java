package com.example.demo.board.service;

import java.util.List;
import java.util.Map;

import com.example.demo.board.vo.ArticleVO;


public interface BoardService {
	public List<ArticleVO> listArticles() throws Exception;
	public int addNewArticle(Map articleMap) throws Exception;
	public ArticleVO viewArticle(int articleNO) throws Exception;
	//public Map viewArticle(int articleNO) throws Exception;
	public void modArticle(Map articleMap) throws Exception;
	public void removeArticle(int articleNO) throws Exception;
	
	public int replyNewArticle(Map articleMap) throws Exception;
}
