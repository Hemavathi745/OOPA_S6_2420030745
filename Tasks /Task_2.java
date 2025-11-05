package tasks;

import java.util.Scanner;

class Course {
  private String courseId;
  private String courseName;

  public Course(String courseId, String courseName) {
      this.courseId = courseId;
      this.courseName = courseName;
  }

  public String getCourseId() {
      return courseId;
  }

  public String getCourseName() {
      return courseName;
  }

  public String toString() {
      return courseId + ": " + courseName;
  }
}

class Students {
  private String name;
  private Course[] enrolledCourses;
  private int courseCount;

  public Students(String name) {
      this.name = name;
      this.enrolledCourses = new Course[5];
      this.courseCount = 0;
  }

  public void enrollCourse(Course course) {
      if (isAlreadyEnrolled(course)) {
          System.out.println(name + " - is already enrolled in " + course.getCourseName());
          return;
      }

      if (courseCount < enrolledCourses.length) {
          enrolledCourses[courseCount++] = course;
          System.out.println(name + " enrolled in " + course.getCourseName());
      } else {
          System.out.println("Course limit reached, you cannot enroll!");
      }
  }

  private boolean isAlreadyEnrolled(Course course) {
      for (int i = 0; i < courseCount; i++) {
          if (enrolledCourses[i].getCourseId().equals(course.getCourseId())) {
              return true;
          }
      }
      return false;
   }

  public void displayEnrolledCourses() {
      System.out.println("Courses enrolled by " + name + ":");
      if (courseCount == 0) {
          System.out.println(" - No courses enrolled.");
          return;
      }
      for (int i = 0; i < courseCount; i++) {
          System.out.println(" - " + enrolledCourses[i]);
      }
  }
}
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	      Course c1 = new Course("CS101", "OOPS");
	      Course c2 = new Course("CS102", "OS");
	      Course c3 = new Course("CS103", "DBMS");
	      Course c4 = new Course("CS104", "Discrete Maths");
	      System.out.print("Enter student name: ");
	      String name = sc.nextLine();

	      Students student = new Students(name);

	      while (true) {
	          System.out.println("\n--- Course Enrollment Menu ---");
	          System.out.println("1. Enroll in OOPS");
	          System.out.println("2. Enroll in OS");
	          System.out.println("3. Enroll in DBMS");
	          System.out.println("4. Enroll in Discrete Maths");
	          System.out.println("5. View Enrolled Courses");
	          System.out.println("6. Exit");
	          System.out.print("Choose an option: ");
	          int option = sc.nextInt();

	          switch (option) {
	              case 1:
	                  student.enrollCourse(c1);
	                  break;
	              case 2:
	                  student.enrollCourse(c2);
	                  break;
	              case 3:
	                  student.enrollCourse(c3);
	                  break;
	              case 4: 
	            	  student.enrollCourse(c4);
	            	  break;
	              case 5:
	                  student.displayEnrolledCourses();
	                  break;
	              case 6:
	                  System.out.println("Thank you for using the course enrollment system!");
	                  sc.close();
	                  return;
	              default:
	                  System.out.println("Invalid option. Try again.");
	          }
	      }
	}

}
