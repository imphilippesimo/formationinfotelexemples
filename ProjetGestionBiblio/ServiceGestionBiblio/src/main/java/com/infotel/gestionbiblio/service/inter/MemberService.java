 package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Member;

public interface MemberService {
	public void insert(final Member monObjet);
	public void delete(final Member object);
	public void update(final Member object);
	public Member getById(int id);
	public Member getObjectByName(String nom) ;
	public List<Member> getList();
	public Member getMemberByLogin(String memberEmail, String memberPassword);
}
