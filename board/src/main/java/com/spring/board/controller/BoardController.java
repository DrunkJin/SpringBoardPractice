package com.spring.board.controller;
 
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.dto.BoardDto;
import com.spring.board.service.BoardService;
import com.spring.board.dto.Criteria;
import com.spring.board.dto.PageMaker;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
	public String write(BoardDto boarddto,  MultipartHttpServletRequest mpRequest) throws Exception{
		logger.info("write");
		service.write(boarddto, mpRequest);
		return "redirect:/board/list";
	}
	
	// 게시판 목록 조회
	/*
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("list");
		
		model.addAttribute("list",service.list());
		
		
	return "board/list";
			
		} */
	// 게시판 목록 페이지 테스트조회
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public String list(Model model, Criteria cri) throws Exception{
			logger.info("list");
			
			model.addAttribute("list",service.list(cri));
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			pageMaker.setTotalCount(service.listCount());
			
			model.addAttribute("pageMaker", pageMaker);
			
		return "board/list";
			}
	
	// 게시글 조회
	@RequestMapping(value="/readView", method = RequestMethod.GET)
	public String read(BoardDto boarddto, Model model) throws Exception {
		logger.info("read");
		model.addAttribute("read", service.read(boarddto.getBno()));
		
		List<Map<String, Object>> fileList = service.selectFileList(boarddto.getBno());
		model.addAttribute("file", fileList);
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
	
	
	@RequestMapping("/fileDown")
	public void fileDown(@RequestParam Map<String, Object> map, HttpServletResponse response) throws Exception {
		Map<String, Object> resultMap = service.selectFileInfo(map);
		String storedFileName = (String) resultMap.get("STORED_FILE_NAME");
		String originalFileName = (String) resultMap.get("ORG_FILE_NAME");
		
		// 파일을 저장했던 위치에서 첨부파일을 읽어 byte[]형식으로 변환한다.
		byte fileByte[] = org.apache.commons.io.FileUtils.readFileToByteArray(new File("D:/git/board/src/main/webapp/uploadData/"+storedFileName));
		
		response.setContentType("application/octet-stream");
		response.setContentLength(fileByte.length);
		// HTTP ResponsHeader에 들어가는 Content-Disposition은 Response Body에 오는 컨텐츠의 기질/성향을 알려주는 속성으로 default는 inline으로 web에 전달되는 data. 
		// 특수하게 attachment를 주는 경우 filename과 함께 주게 되면 Body에 오는 값을 다운로드 받으라는 뜻이 된다.
		response.setHeader("Content-Disposition", "attachment; fileName=\""+URLEncoder.encode(originalFileName, "UTF-8") + "\";");
		response.getOutputStream().write(fileByte);
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}
	
	
	
}