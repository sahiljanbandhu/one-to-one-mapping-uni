package com.jsp.person.pan.service;

import com.jsp.person.pan.dao.PanDao;

import com.jsp.person.pan.dto.Pan;


public class PanService {
	PanDao panDao = new PanDao();

	public Pan createPan(Pan pan) {
		return panDao.createPan(pan);
	}

	public Pan getPanById(int id) {
		return panDao.getPanById(id);
	}

	public Pan deletePanById(int id) {
		return panDao.deletePanById(id);
	}

	public Pan updatePanById(int id, String name, long pan_no) {

		return panDao.updatePanById(id, name, pan_no);
	}
}
