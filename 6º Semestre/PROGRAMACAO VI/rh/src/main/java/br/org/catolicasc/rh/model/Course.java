package br.org.catolicasc.rh.model;

public class Course {
	
	
	private Long id;
    private String name;
    private String workload;
    private CourseType course;
    private boolean yesNo;
    private String institution;
    private String courseCity;
    
    public Course(){
    	super();
    }
    
    public Course(long id) {
		this();
		this.id = id;
	}
    
	public Course(String name, String workload, CourseType course, boolean yesNo, String institution,
			String courseCity) {
		this();
		this.name = name;
		this.workload = workload;
		this.course = course;
		this.yesNo = yesNo;
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
	public boolean isYesNo() {
		return yesNo;
	}
	public void setYesNo(boolean yesNo) {
		this.yesNo = yesNo;
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
    
    

}
