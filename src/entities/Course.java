package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	
	private List<Student> registration = new ArrayList<>();
	
	public Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getRegistration(){
		return registration;
	}
	
	public void addRegistration(Student student) {
		registration.add(student);
	}
	
	public void removeRegistration(Student student) {
		registration.remove(student);
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", registration=" + registration + "]";
	}
}
