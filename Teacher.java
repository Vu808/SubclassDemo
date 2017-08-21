/*
 * This is a subclass that extends the Person class
 */
public class Teacher extends Person {

	private String department;
	private String room;
	
	public Teacher(String first, String last, String sex, String dept, String rm) {
		super(first, last, sex);
		department = dept;
		room = rm;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getRoom() {
		return room;
	}
	
	public void setDepartment(String dept) {
		department = dept;
	}
	
	public void setRoom(String rm) {
		room = rm;
	}
	
}
