package com.spring.board.service;


import java.util.List;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDao;
import com.spring.board.dto.BoardDto;
import com.spring.board.dto.Criteria;
import com.spring.board.form.BoardForm;
 
public interface BoardService {
	
	// 게시물 작성
	public void write(BoardDto boardDto) throws Exception;
	
	// 게시물 목록 조회
	/*
	public List<BoardDto> list() throws Exception;
	*/
	public List<BoardDto> list(Criteria cri) throws Exception;
	
	public int listCount() throws Exception;
	
	// 게시글 상세 조회
	public BoardDto read(int bno) throws Exception;
	
	/** 게시글 수정 서비스  */
	public void update(BoardDto boarddto) throws Exception;
	
	/** 게시글 삭제 서비스 */
	public void delete(int bno) throws Exception;
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// =================================================================================== //
	
	/*
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
		
		return boardDao.getBoardList(boardForm);
	}
	public BoardDto getBoardDetail(BoardForm boardForm) throws Exception {
		
		BoardDto boardDto = new BoardDto();
		String searchType = boardForm.getSearch_type();
		
		if("S".equals(searchType)) {
			int updateCnt = boardDao.updateBoardHits(boardForm);
			
			if (updateCnt > 0) {
				boardDto = boardDao.getBoardDetail(boardForm);
			}
		} else {
			boardDto = boardDao.getBoardDetail(boardForm);
		}
		return boardDto;
	} 
	
	public BoardDto insertBoard(BoardForm boardForm) throws Exception {
		
		BoardDto boardDto = new BoardDto();
		int insertCnt = boardDao.insertBoard(boardForm);
		
		if(insertCnt > 0) {
			boardDto.setResult("SUCCESS");
		} else {
			boardDto.setResult("FAIL");
		}
		return boardDto;
	}
	
	public BoardDto deleteBoard(BoardForm boardForm) throws Exception {
		
		BoardDto boardDto = new BoardDto();
		int deleteCnt = boardDao.deleteBoard(boardForm);
		
		if(deleteCnt > 0 ) {
			boardDto.setResult("SUCCESS");
		} else {
			boardDto.setResult("FAIL");
		}
		return boardDto;
	}
	
	public BoardDto updateBoard(BoardForm boardForm) throws Exception {
		
		BoardDto boardDto = new BoardDto();
		int updateCnt = boardDao.updateBoard(boardForm);
		
		if (updateCnt > 0) {
			boardDto.setResult("SUCCESS");
		} 	else {
			boardDto.setResult("FAIL");
		}
		return boardDto;
	}
} */