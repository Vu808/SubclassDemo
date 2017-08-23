
public class Movie extends Entertainment {

	
	private String genre;
	private String movieRating;
	
	
	public Movie(String name, String whatKind, String maturity, String theme, int score) {
		
		super(name, whatKind, score);
		
		movieRating = maturity;
		genre = theme;
	}
	
	public String getMovieRating() {
		return movieRating;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setMovieRating(String maturity) {
	movieRating = maturity;
	}
	
	public void setGenre(String theme) {
		genre = theme;
	}
}
