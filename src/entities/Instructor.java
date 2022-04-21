package entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	private String name;
	
	private List<Course> courses = new ArrayList<>();
	
	public Instructor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNAme(String name) {
		this.name = name;
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
}
