package br.org.catolicasc.rh.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import br.org.catolicasc.rh.model.Bean;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Job implements Bean{
	
	@Id
	@GeneratedValue
	private Long id;


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
	
	public Job(Long id) {
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
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((initDate == null) ? 0 : initDate.hashCode());
		result = prime * result + ((performedActivities == null) ? 0 : performedActivities.hashCode());
		result = prime * result + ((resignationDate == null) ? 0 : resignationDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (id != other.id)
			return false;
		if (initDate == null) {
			if (other.initDate != null)
				return false;
		} else if (!initDate.equals(other.initDate))
			return false;
		if (performedActivities == null) {
			if (other.performedActivities != null)
				return false;
		} else if (!performedActivities.equals(other.performedActivities))
			return false;
		if (resignationDate == null) {
			if (other.resignationDate != null)
				return false;
		} else if (!resignationDate.equals(other.resignationDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", company=" + company + ", city=" + city + ", resignationDate=" + resignationDate
				+ ", initDate=" + initDate + ", performedActivities=" + performedActivities + "]";
	}
	
	
	
}
