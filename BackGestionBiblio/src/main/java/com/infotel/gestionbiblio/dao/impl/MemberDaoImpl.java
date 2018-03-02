package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.MemberDao;
import com.infotel.gestionbiblio.entity.Member;

public class MemberDaoImpl extends CommonDaoImpl<Member> implements MemberDao {

	Member member;
	List<Member> memberList;

	@Override
	public Member getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where memberName=:name");
		query.setParameter("name", nom);
		member = (Member) query.uniqueResult();
		
		return member;
	}
	
	@Override
	public List<Member> getList()
	{
		memberList = super.getList();
		return memberList;
	}

}
 