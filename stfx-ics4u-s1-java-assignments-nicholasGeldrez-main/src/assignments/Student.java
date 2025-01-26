package assignments;

public class Student {

	public String student;
	public String grade;

	// Default Constructor
	public Student() {

		this.student = "";
		this.grade = "";

	}

	// Parameterized Constructor
	public Student(String t, String g) {

		this.student = t;
		this.grade = g;

	}

	public String getStudent() {

		return this.student;

	}

	public String getGrade() {

		return this.grade;

	}

	public void setStudent(String t) {

		this.student = t;

	}

	public void setGrade(String g) {

		this.grade = g;

	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.student + "." + this.grade;
				
	}

}
