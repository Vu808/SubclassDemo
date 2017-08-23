
public class Entertainment {

	
	private String title;
	private String type;
	private int rating;
	
	public Entertainment(String name, String whatKind, int score) {
		title = name;
		type = whatKind;
		rating = score;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getType() {
		return type;
	}
	public int getRating() {
		return rating;
	}
	
	public void getEntertainmentInfo() {
		System.out.println(title + " is a " + type + " and is rated " + rating);
	}
}
