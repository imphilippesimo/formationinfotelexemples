package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.EditorDao;
import com.infotel.gestionbiblio.entity.Editor;

public class EditorDaoImpl extends CommonDaoImpl<Editor> implements EditorDao {

	Editor editor;
	List<Editor> editorList;

	@Override
	public Editor getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where editorName=:name");
		query.setParameter("name", nom);
		editor = (Editor) query.uniqueResult();
		
		return editor;
	}
	
	@Override
	public List<Editor> getList()
	{
		editorList = super.getList();
		return editorList;
	}

}
 