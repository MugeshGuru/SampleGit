package org.cts;

public class CourseDetails {
	
	
	// Method creation
	private void javaCourse() {
	
		System.out.println("Java class");
	}
	

	private void pythonCourse() {
		
		System.out.println("Python Class");
	}
	
	public static void main(String[] args) {
		
		
		//Classname objname = new Classname();-----> Object creation
		
		CourseDetails c = new CourseDetails();
		
		// Method calling
		c.pythonCourse();
		c.pythonCourse();
		
	}
	
	
}
