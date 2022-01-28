package com.spring.board.service;

import com.spring.board.dto.MemberDto;
import javax.inject.Inject;
import com.spring.board.dao.MemberDao;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDao dao;
	
	@Override
	public void register(MemberDto dto) throws Exception {
		dao.register(dto);
	}
	
	@Override
	public MemberDto login(MemberDto dto) throws Exception {
		return dao.login(dto);
	}
	
	@Override
	public int idChk(MemberDto dto) throws Exception {
		int result = dao.idChk(dto);
		return result;
	}
}
