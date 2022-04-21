package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Instructor login: ");
		String name = sc.nextLine();
		
		Instructor instructor = new Instructor(name);
		instructor.addCourse(new Course("A"));
		instructor.addCourse(new Course("B"));
		instructor.addCourse(new Course("C"));
		
		Set<Student> set = new HashSet<>();
		for (Course course : instructor.getCourses()) {
			System.out.print("How many students for course "+ course.getName()+"?");
			int n = sc.nextInt();
			System.out.print("Enter with the code of the students for this course: ");
			for (int i = 1; i <= n ; i++) {
				course.addRegistration(new Student(sc.nextInt()));
			}
			set.addAll(course.getRegistration());
		}
		System.out.println();
		for (Course course : instructor.getCourses()) {
			System.out.println(course);
		}
		System.out.println();
		System.out.println("You have "+set.size()+" students.");

		sc.close();
	}

}
