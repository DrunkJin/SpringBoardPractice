package com.spring.board.dao;

import com.spring.board.dto.MemberDto;

public interface MemberDao {
	
	// 회원가입
	public void register(MemberDto dto) throws Exception ;
	
	// 로그인
	public MemberDto login(MemberDto dto) throws Exception ;
	
	// 아이디 중복체크
	public int idChk(MemberDto dto) throws Exception ;
}
