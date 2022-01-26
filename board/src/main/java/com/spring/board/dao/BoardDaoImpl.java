package com.spring.board.dao;

import java.util.List;
import javax.inject.Inject;

import javax.annotation.Resource;
import com.spring.board.dto.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.spring.board.dto.Criteria;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Inject
	private SqlSession sqlSession;
	
	/** 게시글 작성 */
	@Override
	public void write(BoardDto boarddto) throws Exception {
		sqlSession.insert("com.spring.board.boardMapper.insert", boarddto);
	}
	
	/** 게시물목록 조회 기능구현 */
	@Override
	public List<BoardDto> list(Criteria cri) throws Exception {
		// To-Do Auto-generated method stub
		return sqlSession.selectList("com.spring.board.boardMapper.listPage",cri);
	}
	/*
	@Override
	public List<BoardDto> list() throws Exception {
		// To-Do Auto-generated method stub
		return sqlSession.selectList("com.spring.board.boardMapper.list");
	} */
	
	// 게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		// To-Do Auto-generated method stub
		return sqlSession.selectOne("com.spring.board.boardMapper.listCount");
	}
	
	/**  게시글 상세 조회 기능 구현 */
	@Override
	public BoardDto read(int bno) throws Exception {
		return sqlSession.selectOne("com.spring.board.boardMapper.read", bno);
	}
	
	
	
	/** 게시글 수정 다오임플 */
	@Override
	public void update(BoardDto boarddto) throws Exception {
		sqlSession.update("com.spring.board.boardMapper.update", boarddto);
	}
	/**  게시글 수정페이지 이동 */
	@Override
	public BoardDto update(int bno) throws Exception {
		return sqlSession.selectOne("com.spring.board.boardMapper.update", bno);
	}
	
	/** 게시글 삭제 다오 임플 */
	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("com.spring.board.boardMapper.delete",bno);
	}
	
}
