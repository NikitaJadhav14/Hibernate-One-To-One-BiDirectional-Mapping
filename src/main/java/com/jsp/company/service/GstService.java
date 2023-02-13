package com.jsp.company.service;


import com.jsp.company.dto.Gst;
import com.jsp.company.dao.*;
public class GstService {
	GstDao GstDao = new GstDao();

	public Gst createGst(Gst gst) {
		return GstDao.createGst(gst);
	}

	public Gst geGstById(int id) {
		return GstDao.getGstByID(id);
	}

	public Gst deleteGstById(int id) {
		return GstDao.deleteGstByID(id);
	}

	public Gst updateGstById(int id, long gstno) {

		return GstDao.updateGst(id, gstno);
	}
}
