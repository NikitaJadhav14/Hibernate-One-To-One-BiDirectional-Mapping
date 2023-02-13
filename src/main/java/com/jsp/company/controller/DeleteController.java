package com.jsp.company.controller;


import com.jsp.company.service.CompanyService;
import com.jsp.company.service.GstService;

public class DeleteController {

	public static void main(String[] args) {
		CompanyService companyService=new CompanyService();
          companyService.deleteCompanyById(1);
          
          GstService gstService=new GstService();
          gstService.deleteGstById(1);
	}

}
