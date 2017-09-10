package br.org.catolicasc.rh.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Job {
	
//	@Id
//	@GeneratedValue
	private long id;


	private String company;
	private String city;
	@XmlTransient
	private Date resignationDate;
	@XmlTransient
	private Date initDate;
	private String performedActivities;
	
	
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Job(long id) {
		this();
		this.id = id;
	}


	public Job(String company, String city, Date resignationDate, Date initDate, String performedActivities) {
		this();
		this.company = company;
		this.city = city;
		this.resignationDate = resignationDate;
		this.initDate = initDate;
		this.performedActivities = performedActivities;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getResignationDate() {
		return resignationDate;
	}
	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}
	public Date getInitDate() {
		return initDate;
	}
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	public String getPerformedActivities() {
		return performedActivities;
	}
	public void setPerformedActivities(String performedActivities) {
		this.performedActivities = performedActivities;
	}

}
