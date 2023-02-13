package com.jsp.company.controller;

import com.jsp.company.dto.Company;
import com.jsp.company.dto.Gst;
import com.jsp.company.service.CompanyService;
import com.jsp.company.service.GstService;

public class SaveComtroller {

	public static void main(String[] args) {
	CompanyService companyService=new CompanyService();
	GstService gstService=new GstService();
	
	Company company=new Company();
	company.setName("wipro");
	company.setLoc("Airoli");
	companyService.createCompany(company);
	
	Gst gst=new Gst();
	gst.setGstno(1245);
	gstService.createGst(gst);

	}

}
