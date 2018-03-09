package com.infotel.gestionbiblio.dao.inter;

import com.infotel.gestionbiblio.dao.CommonDAO;
import com.infotel.gestionbiblio.entity.Member;

public interface MemberDao extends CommonDAO<Member>{

	public Member getMemberByLogin(String memberEmail, String memberPassword);
}
 