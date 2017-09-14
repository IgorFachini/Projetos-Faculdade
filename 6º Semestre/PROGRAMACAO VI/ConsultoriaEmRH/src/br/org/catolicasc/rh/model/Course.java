package br.org.catolicasc.rh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import br.org.catolicasc.rh.model.Bean;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Course implements Bean{
	
	@Id
	@GeneratedValue
	private Long id;
    private String name;
    private String workload;
    private CourseType course;
    private String institution;
    private String courseCity;
    
    public Course(){
    	super();
    }
    
    public Course(long id) {
		this();
		this.id = id;
	}
    
	public Course(String name, String workload, CourseType course, String institution,
			String courseCity) {
		this();
		this.name = name;
		this.workload = workload;
		this.course = course;
		this.institution = institution;
		this.courseCity = courseCity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkload() {
		return workload;
	}
	public void setWorkload(String workload) {
		this.workload = workload;
	}
	public CourseType getCourse() {
		return course;
	}
	public void setCourse(CourseType course) {
		this.course = course;
	}

	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getCourseCity() {
		return courseCity;
	}
	public void setCourseCity(String courseCity) {
		this.courseCity = courseCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((courseCity == null) ? 0 : courseCity.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((institution == null) ? 0 : institution.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((workload == null) ? 0 : workload.hashCode());
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
		Course other = (Course) obj;
		if (course != other.course)
			return false;
		if (courseCity == null) {
			if (other.courseCity != null)
				return false;
		} else if (!courseCity.equals(other.courseCity))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (institution == null) {
			if (other.institution != null)
				return false;
		} else if (!institution.equals(other.institution))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (workload == null) {
			if (other.workload != null)
				return false;
		} else if (!workload.equals(other.workload))
			return false;
		return true;
	}
	
	
    
    

}
