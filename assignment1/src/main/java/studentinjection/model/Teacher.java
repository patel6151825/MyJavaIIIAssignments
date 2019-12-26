package studentinjection.model;

public class Teacher {

//	Inject Student1 and Student2
	Student1 student1;
	Student2 student2;
	String teacherName;

//	constructor
	public Teacher(Student1 student1, Student2 student2) {
		super();
		this.student1 = student1;
		this.student2 = student2;
	}

//	getter for teacher info
	public String getTeacherName() {
		return teacherName;
	}

//	setter for teacher info
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

//	method to print teacher and student info
	public void showInfo() {
		System.out.println("Teacher name is " + getTeacherName());
		System.out.println("\nStudent Information are :");
		System.out.println("Name \tStudent Id");
		System.out.println(student1.stdName + "\t" + student1.stdId);
		System.out.println(student2.stdName + "\t" + student2.stdId);
	}

}
