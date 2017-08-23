
public class VideoGame extends Entertainment {
	
	private String gameRating;
	private String genre;
	
	public VideoGame(String name, String whatKind, String maturity, String theme) {
		super(name, whatKind);
		gameRating = maturity;
		genre = theme;
	}

	public String getGameRating() {
		return gameRating;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGameRating(String maturity) {
		gameRating = maturity;
	}
	
	public void setGenre(String theme) {
		genre = theme;
	}
}
