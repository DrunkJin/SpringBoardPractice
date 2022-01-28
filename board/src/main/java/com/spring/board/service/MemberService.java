package com.spring.board.service;

import com.spring.board.dto.MemberDto;

public interface MemberService {
	
	public void register(MemberDto dto) throws Exception;
	
	public MemberDto login(MemberDto dto) throws Exception;
	
	public int idChk(MemberDto dto) throws Exception;
}
