package com.spring.board.controller;
 
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.spring.board.dto.BoardDto;
import com.spring.board.form.BoardForm;
import com.spring.board.service.BoardService;
 
@Controller
@RequestMapping(value = "/board")
public class BoardController {
 
    @Autowired
    private BoardService boardService;
    
    /* 게시판 목록 페이지 */
    @RequestMapping( value = "/boardList")
    public String BoardList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        
        return "board/boardList";
    }
    
    /* 게시판 목록 조회 */
    @RequestMapping(value = "/getBoardList")
    @ResponseBody
    public List<BoardDto> getBoardList(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm) throws Exception {
 
        List<BoardDto> boardDtoList = boardService.getBoardList(boardForm);
 
        return boardDtoList;
    }
    
    /* 게시판 상세 페이지 이동 */
    @RequestMapping("/boardDetail")
    public String boardDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return "board/boardList";
    }
    
    /* 게시판 상세 조회 */
    @RequestMapping("/getBoardDetail")
    @ResponseBody
    public BoardDto getBoardDetail(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm ) throws Exception {
    	BoardDto boardDto = boardService.getBoardDetail(boardForm);
    	return boardDto;
    }
    
    /* 게시판 작성 페이지로 이동 */
    @RequestMapping("/boardWrite")
    @ResponseBody
    public String BoardWrite(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return "board/boardWrite";
    }
    
    /* 게시글 등록 */
    @RequestMapping("/insertBoard")
    @ResponseBody
    public BoardDto insertBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm) throws Exception {
    	BoardDto boardDto = boardService.insertBoard(boardForm);
    	return boardDto;
    }
    
    /* 게시글 삭제 */
    @RequestMapping("/deleteBoard")
    @ResponseBody
    public BoardDto deleteBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm) throws Exception {
    	BoardDto boardDto = boardService.deleteBoard(boardForm);
    	return boardDto;
    }
    
    /* 게시글 수정 페이지로 이동 */
    @RequestMapping("/boardUpdate")
    @ResponseBody
    public String boardUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return "board/boardUpdate";
    }
    
    /* 게시글 수정 */
    @RequestMapping("/updataBoard")
    @ResponseBody
    public BoardDto updateBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm) throws Exception {
    	BoardDto boardDto = boardService.updateBoard(boardForm);
    	return boardDto;
    }
}