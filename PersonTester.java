/**
 * This program demonstrates subclasses and basic class
 * inheritance, as well as some best practices when it comes to classes
 * in general.
 * @author Michael Ida
 *
 */
public class PersonTester {
	
	public static void main(String[] args) {
		/*
		 * Create a few new Students, Teachers, and People
		 */
		Person bystander1 = new Person("John", "Smith", "Male");
		Person bystander2 = new Person("Mary", "Johnson", "Female");
		Student student1 = new Student("Jane", "Doe", "Female", 10, 1);
		Student student2 = new Student("Alice", "Adams", "Female", 11, 2);
		Teacher teacher1 = new Teacher("Michael", "Ida", "Male", "Math", "E15");
		Teacher teacher2 = new Teacher("Kristen", "Sakamaki", "Female", "Math", "E16");
		/*
		 * Let's verify the information
		 */
		bystander1.getPersonInfo();
		System.out.println();
		bystander2.getPersonInfo();
		System.out.println();
		student1.getPersonInfo();
		System.out.println("Grade Level: " + student1.getGradeLevel());
		System.out.println("Student ID: " + student1.getStudentID());
		System.out.println();
		student2.getPersonInfo();
		System.out.println("Grade Level: " + student2.getGradeLevel());
		System.out.println("Student ID: " + student2.getStudentID());
		System.out.println();
		teacher1.getPersonInfo();
		System.out.println("Department: " + teacher1.getDepartment());
		System.out.println("Room: " + teacher1.getRoom());
		System.out.println();
		teacher2.getPersonInfo();
		System.out.println("Department: " + teacher2.getDepartment());
		System.out.println("Room: " + teacher2.getRoom());
		System.out.println();
		/*
		 * Now let's change some information and verify
		 */
		student1.setGradeLevel(12);
		System.out.println(student1.getFirstName() + " " + student1.getLastName() +
				" is now in grade " + student1.getGradeLevel());
		System.out.println();
		teacher1.setDepartment("CS");
		System.out.println(teacher1.getFirstName() + " " + teacher1.getLastName() +
				" is now in the " + teacher1.getDepartment() + " department");
		System.out.println();
	}
}
