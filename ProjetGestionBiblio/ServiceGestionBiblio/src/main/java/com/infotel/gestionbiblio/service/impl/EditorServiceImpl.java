package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.EditorDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Editor;
import com.infotel.gestionbiblio.service.inter.EditorService;

@Service
@Transactional
public class EditorServiceImpl extends CommonServiceImpl<Editor> implements EditorService{

	@Autowired
	private EditorDao editorDao;
}
