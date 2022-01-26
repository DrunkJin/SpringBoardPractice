package com.spring.board.controller;
 
import java.util.List;
 
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.spring.board.dto.BoardDto;
import com.spring.board.service.BoardService;
 
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
		
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardDto boarddto) throws Exception{
		logger.info("write");
		
		service.write(boarddto);
		
		return "redirect:/board/list";
	}
	
	// 게시판 목록 조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("list");
		
		model.addAttribute("list",service.list());
		
		
	return "board/list";
			
		}
	
	// 게시글 조회
	@RequestMapping(value="/readView", method = RequestMethod.GET)
	public String read(BoardDto boarddto, Model model) throws Exception {
		logger.info("read");
		model.addAttribute("read", service.read(boarddto.getBno()));
		return "board/readView";
	}
	
	//게시슬 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BoardDto boarddto) throws Exception {
		logger.info("update");
		service.update(boarddto);
		return "redirect:/board/list";
	}
	
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String update(BoardDto boarddto, Model model) throws Exception {
		logger.info("update");
		model.addAttribute("update", service.read(boarddto.getBno()));
		return "board/updateView";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String delete(BoardDto boarddto) throws Exception {
		logger.info("delete");
		service.delete(boarddto.getBno());
		return "redirect:/board/list";
	}
	@RequestMapping(value = "/deleteView", method = RequestMethod.GET)
	public String delete(BoardDto boarddto, Model model) throws Exception {
		logger.info("update");
		model.addAttribute("delete", service.read(boarddto.getBno()));
		return "board/deleteView";
	}
	
}