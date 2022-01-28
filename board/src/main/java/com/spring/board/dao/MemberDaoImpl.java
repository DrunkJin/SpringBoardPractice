package com.spring.board.dao;

import com.spring.board.dto.MemberDto;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import javax.inject.Inject;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Inject SqlSession sql;
	
	// 회원가입
	
	@Override
	public void register(MemberDto dto) throws Exception {
		sql.insert("com.spring.board.memberMapper.register", dto);
	}
	
	//로그인
	@Override
	public MemberDto login(MemberDto dto) throws Exception {
		return sql.selectOne("com.spring.board.memberMapper.login",dto);
	}
	
	// 아이디 중복체크
	@Override
	public int idChk(MemberDto dto) throws Exception {
		int result = sql.selectOne("com.spring.board.memberMapper.idChk", dto);
		return result;
	}
	
}
