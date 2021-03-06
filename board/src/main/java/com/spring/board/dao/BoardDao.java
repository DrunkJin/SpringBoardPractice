package com.spring.board.dao;
 
import java.util.List;
import java.util.Map;

import com.spring.board.dto.BoardDto;
import com.spring.board.dto.Criteria;

public interface BoardDao {
	 
	/** 글작성 dao */
    public int write(BoardDto boarddto) throws Exception;
    
    /** 게시물목록조회 boardMapper랑 연결 */
    public List<BoardDto> list(Criteria cri) throws Exception;
    
    /*
    public List<BoardDto> list() throws Exception;
    */
    //게시물 총 갯수
    public int listCount() throws Exception;
    
    /** 게시글 상세 조회 */
    public BoardDto read(int bno) throws Exception;
    
    /** 게시글 수정 다오 */
    public void update(BoardDto boarddto) throws Exception;
    
    /** 게시글 삭제 다오 */
    public void delete(int bno) throws Exception;
    
    /** 게시글 수정페이지이동 다오 */
    public BoardDto update(int bno) throws Exception;
    
    /** 첨부파일 업로드 */
    public void insertFile(Map<String, Object> map) throws Exception;
    
    // 첨부파일 조회
 	public List<Map<String, Object>> selectFileList(int bno) throws Exception;
 	
 	// 첨부파일 다운로드
 	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception;
 	
}
    
    
    
    
    
    
    
    
    
    
    // ================================================================================================ //
    
    /*
    private static final String NAMESPACE = "com.spring.board.boardMapper";
   
    
    public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
 
        return sqlSession.selectList(NAMESPACE + ".getBoardList", boardForm);
    }
    
    public int updateBoardHits(BoardForm boardForm) throws Exception {
    	return sqlSession.update(NAMESPACE + ".updateBoardHits", boardForm);
    }
    
    public BoardDto getBoardDetail(BoardForm boardForm) throws Exception {
    	return sqlSession.selectOne(NAMESPACE + ".getBoardDetail", boardForm);
    }
    
    public int insertBoard(BoardForm boardForm) throws Exception {
    	return sqlSession.insert(NAMESPACE + ".insertBoard", boardForm);
    }
    
    public int deleteBoard(BoardForm boardForm) throws Exception {
    	return sqlSession.delete(NAMESPACE + ".deleteBoard", boardForm);
    }
    
    public int updateBoard(BoardForm boardForm) throws Exception {
    	return sqlSession.update(NAMESPACE + ".updateBoard", boardForm);
    } */
