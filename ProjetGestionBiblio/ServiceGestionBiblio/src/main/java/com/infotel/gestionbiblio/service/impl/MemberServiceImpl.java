package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.MemberDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Member;
import com.infotel.gestionbiblio.service.inter.MemberService;

@Service
@Transactional
public class MemberServiceImpl extends CommonServiceImpl<Member> implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
}
