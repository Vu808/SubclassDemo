
public class Movie extends Entertainment {

	
	private String genre;
	private String movieRating;
	
	
	public Movie(String name, String whatKind, String maturity, String theme) {
		
		super(name, whatKind);
		
		movieRating = maturity;
		genre = theme;
	}
	
	public String getMovieRating() {
		return movieRating;
	}
	
	public int getGenre() {
		return genre;
	}
	
	public void setMovieRating(string maturity) {
	movieRating = maturity;
	}
	
	public void setGenre(String theme) {
		genre = theme;
	}
}
