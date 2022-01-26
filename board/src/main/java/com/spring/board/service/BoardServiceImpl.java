package com.spring.board.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDao;
import com.spring.board.dto.BoardDto;
import com.spring.board.dto.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao;
	
	// 게시글 작성
	@Override
	public void write(BoardDto boarddto) throws Exception {
		dao.write(boarddto);
	}
	
	/**게시물 목록 조회 서비스 임플*/
	/*
	public List<BoardDto> list() throws Exception {
		// dao에 있는list함수를 호출해서 반환
		return dao.list();
	} */
	@Override
	public List<BoardDto> list(Criteria cri) throws Exception{
		
		return dao.list(cri);
	}
	
	public int listCount() throws Exception {
		return dao.listCount();
	}
	
	
	/** 게시글 상세 조회 서비스 임플*/
	public BoardDto read(int bno) throws Exception {
		return dao.read(bno);
	}
	
	/** 게시글 수정 서비스 임플 */
	public void update(BoardDto boarddto) throws Exception {
		dao.update(boarddto);
	}
	/** 게시글 삭제 서비스 임플*/
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

}