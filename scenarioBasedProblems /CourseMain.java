package scenarioBasedProblems;

abstract class Course {
    String courseName;
    int duration;

    public Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }

    public abstract void startCourse();
    public abstract void endCourse();

    public void getCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hrs");
    }

    public void giveCertificate() {
        System.out.println("Certificate awarded for " + courseName);
    }
}

class ProgrammingCourse extends Course {
    public ProgrammingCourse(String name, int duration) {
        super(name, duration);
    }

    @Override
    public void startCourse() {
        System.out.println("Starting programming course with coding environment...");
    }

    @Override
    public void endCourse() {
        System.out.println("Ending programming course.");
    }
}

class LanguageCourse extends Course {
    public LanguageCourse(String name, int duration) {
        super(name, duration);
    }

    @Override
    public void startCourse() {
        System.out.println("Starting language course with video lessons...");
    }

    @Override
    public void endCourse() {
        System.out.println("Ending language course.");
    }
}

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new ProgrammingCourse("Java Basics", 40);
        c1.getCourseDetails();
        c1.startCourse();
        c1.endCourse();
        c1.giveCertificate();

        System.out.println();

        Course c2 = new LanguageCourse("French", 30);
        c2.getCourseDetails();
        c2.startCourse();
        c2.endCourse();
        c2.giveCertificate();
	}

}
