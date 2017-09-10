package br.org.catolicasc.rh.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.org.catolicasc.rh.adapter.JobAdapter;

public class Candidate {
	private Long id;

//	@XmlElementWrapper(name = "jobs2")
//	@XmlElement(name = "job2")
//	@XmlJavaTypeAdapter(value = JobAdapter.class)
	private List<Job> jobs;

//	@XmlElementWrapper(name = "courses")
//	@XmlElement(name = "course")
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
	
	
	
	
}
