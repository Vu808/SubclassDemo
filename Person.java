/**
 * This is an example of a superclass
 * @author Michael Ida
 *
 */
public class Person {

	/*
	 * Notice that the class fields are private.
	 * This is best practice to keep all of the
	 * information about the class hidden from the
	 * outside world (encapsulated).
	 */
	private String firstName;
	private String lastName;
	private String gender;   // 0 = M, 1 = F
	
	public Person(String first, String last, String sex) {
		firstName = first;
		lastName = last;
		gender = sex;
	}
	
	/*
	 * These are getter (accessor) methods.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	/*
	 * This method prints out some general information about the person
	 */
	public void getPersonInfo() {
		System.out.println(firstName + " " + lastName + " is a " + gender);
	}
	
}
