 package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Member;
import com.infotel.gestionbiblio.exception.ServiceException;

public interface MemberService {
	public void insert(final Member monObjet);
	public void delete(final Member object);
	public void update(final Member object);
	public Member getById(int id);
	public Member getObjectByName(String nom) ;
	public List<Member> getList();
	public Member getMemberByLogin(String memberEmail, String memberPassword) throws ServiceException;
}
