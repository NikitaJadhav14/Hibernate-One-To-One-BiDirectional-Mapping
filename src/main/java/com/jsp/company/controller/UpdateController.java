package com.jsp.company.controller;

import com.jsp.company.service.CompanyService;
import com.jsp.company.service.GstService;

public class UpdateController {

	public static void main(String[] args) {
		CompanyService companyService=new CompanyService();
		companyService.updateCompanyById(1, "airoli", "ATOS");

		
		GstService gstService=new GstService();
		gstService.updateGstById(1, 337);
	}

}
