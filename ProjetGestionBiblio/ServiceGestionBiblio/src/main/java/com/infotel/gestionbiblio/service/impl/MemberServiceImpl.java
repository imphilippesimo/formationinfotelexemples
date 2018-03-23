 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.MemberDao;
import com.infotel.gestionbiblio.entity.Member;
import com.infotel.gestionbiblio.exception.ErrorConstante;
import com.infotel.gestionbiblio.exception.ServiceException;
import com.infotel.gestionbiblio.service.inter.MemberService;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	public void insert(final Member monObjet)
	{
		memberDao.insert(monObjet);
	}
	
	
	public void delete(final Member object) {
		memberDao.delete(object);
	}
	
	public void update(final Member object) {
		memberDao.update(object);
	}
	
	public Member getById(int id) {
		return memberDao.getById(id);
	}
	
	public Member getObjectByName(String nom) {
		return memberDao.getObjectByName(nom);
	}
	
	public List<Member> getList(){
		return memberDao.getList();
	}

	@Override
	public Member getMemberByLogin(String memberEmail, String memberPassword) throws ServiceException 
	{		
		if(memberDao.getMemberByLogin(memberEmail, memberPassword) == null)
		{
			throw new ServiceException(ErrorConstante.ACCOUNT_NOT_EXIST);
		}
		else return memberDao.getMemberByLogin(memberEmail, memberPassword);
	}
}
