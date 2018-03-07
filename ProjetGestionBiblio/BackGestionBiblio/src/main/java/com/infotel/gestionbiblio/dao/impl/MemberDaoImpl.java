package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.MemberDao;
import com.infotel.gestionbiblio.entity.Member;

@Repository
@Transactional
public class MemberDaoImpl extends CommonDaoImpl<Member> implements MemberDao {

	Member member;
	List<Member> memberList;
	
	@Autowired
	private SessionFactory sessionFactory;


	
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
 