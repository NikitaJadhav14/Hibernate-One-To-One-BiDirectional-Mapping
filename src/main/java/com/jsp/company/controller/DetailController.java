package com.jsp.company.controller;

import com.jsp.company.service.CompanyService;
import com.jsp.company.service.GstService;

public class DetailController {

	public static void main(String[] args) {
		CompanyService companyService=new CompanyService();
          companyService.geCompanyById(1);
          
          GstService gstService=new GstService();
          gstService.geGstById(1);
	}

}
