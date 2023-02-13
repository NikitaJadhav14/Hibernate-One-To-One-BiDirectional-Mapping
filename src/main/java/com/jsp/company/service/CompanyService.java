package com.jsp.company.service;

import com.jsp.company.dao.CompanyDao;
import com.jsp.company.dto.Company;


public class CompanyService {
	CompanyDao CompanyDao = new CompanyDao();

	public Company createCompany(Company company) {
		return CompanyDao.createCompany(company);
	}

	public Company geCompanyById(int id) {
		return CompanyDao.getCompanyByID(id);
	}

	public Company deleteCompanyById(int id) {
		return CompanyDao.deletCompany(id);
	}

	public Company updateCompanyById(int id, String loc, String name) {

		return CompanyDao.updateCompany(id, loc, name);
	}
}
