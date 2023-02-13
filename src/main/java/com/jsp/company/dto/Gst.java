package com.jsp.company.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long gstno;
	@OneToOne(mappedBy = "gst")

	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getGstno() {
		return gstno;
	}

	public void setGstno(long gstno) {
		this.gstno = gstno;
	}
}
