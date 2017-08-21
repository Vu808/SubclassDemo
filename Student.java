/**
 * This is an example of a subclass that extends the Person class
 * @author Michael Ida
 *
 */
public class Student extends Person {
	
	/*
	 * The Student class inherits all of the fields of the Person
	 * class with the additional ones defined below.
	 */
	private int gradeLevel;
	private int studentID;
	
	public Student(String first, String last, String sex, int grade, int ID) {
		/*
		 * the super() method calls the constructor of the parent class,
		 * in this case, Person.
		 */
		super(first, last, sex);
		/*
		 * After setting up the student as a Person, the new instance
		 * variables are set.
		 */
		gradeLevel = grade;
		studentID = ID;
	}
	
	/*
	 * getter methods for the new instance variables
	 */
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	/*
	 * setters for the new instance variables
	 */
	public void setGradeLevel(int grade) {
		gradeLevel = grade;
	}
	
	public void setStudentID(int ID) {
		studentID = ID;
	}

}
