package br.org.catolicasc.rh.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import br.org.catolicasc.rh.model.Bean;


@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Candidate implements Bean{
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Job> jobs;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> courses;
	private String name;
	private int age;
	private double intentedSalary;
	private String schooling;
	private Employee status;
	
	public Candidate(){
		super();
	}
	
	public Candidate(long id) {
		this();
		this.id = id;
	}
	
	
	public Candidate(List<Job> jobs, List<Course> courses, String name, int age, double intentedSalary,
			String schooling, Employee status) {
		this();
		this.jobs = jobs;
		this.courses = courses;
		this.name = name;
		this.age = age;
		this.intentedSalary = intentedSalary;
		this.schooling = schooling;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Job> getJobs() {
		return jobs;
	}


	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getIntentedSalary() {
		return intentedSalary;
	}


	public void setIntentedSalary(double intentedSalary) {
		this.intentedSalary = intentedSalary;
	}


	public String getSchooling() {
		return schooling;
	}


	public void setSchooling(String schooling) {
		this.schooling = schooling;
	}


	public Employee getStatus() {
		return status;
	}


	public void setStatus(Employee status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(intentedSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jobs == null) ? 0 : jobs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schooling == null) ? 0 : schooling.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Candidate other = (Candidate) obj;
		if (age != other.age)
			return false;
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(intentedSalary) != Double.doubleToLongBits(other.intentedSalary))
			return false;
		if (jobs == null) {
			if (other.jobs != null)
				return false;
		} else if (!jobs.equals(other.jobs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schooling == null) {
			if (other.schooling != null)
				return false;
		} else if (!schooling.equals(other.schooling))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", jobs=" + jobs + ", courses=" + courses + ", name=" + name + ", age=" + age
				+ ", intentedSalary=" + intentedSalary + ", schooling=" + schooling + ", status=" + status + "]";
	}
	
	
	
	
	
}
