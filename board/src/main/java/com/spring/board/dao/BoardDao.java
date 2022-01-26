package com.spring.board.dao;
 
import java.util.List;
import com.spring.board.dto.BoardDto;

public interface BoardDao {
	 
	/** 글작성 dao */
    public void write(BoardDto boarddto) throws Exception;
    
    /** 게시물목록조회 boardMapper랑 연결 */
    public List<BoardDto> list() throws Exception;
    
    /** 게시글 상세 조회 */
    public BoardDto read(int bno) throws Exception;
    
    /** 게시글 수정 다오 */
    public void update(BoardDto boarddto) throws Exception;
    
    /** 게시글 삭제 다오 */
    public void delete(int bno) throws Exception;
    
    /** 게시글 수정페이지이동 다오 */
    public BoardDto update(int bno) throws Exception;
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
