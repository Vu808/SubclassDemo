
public class EntertainmentTester {

	
	public static void main(String[] args) {
		
		Entertainment work1 = new Entertainment("Transformers", "Movie", 7 );
		Entertainment work2 = new Entertainment("The Last Of Us", "Video Game", 10);
		Movie movie1 = new Movie("Moana", "Movie", "PG", "Adventure", 8);
		Movie movie2 = new Movie("Fate Of The Furious", "Movie", "PG13", "Thriller", 7);
		VideoGame game1 = new VideoGame("Kingdom Hearts 2", "Video Game", "E10", "JRPG", 9);
		VideoGame game2 = new VideoGame("Counter-Strike:Global Offensive", "Video Game", "M", "FPS", 9);
		
		work1.getEntertainmentInfo();
		System.out.println();
		work2.getEntertainmentInfo();
		System.out.println();
		movie1.getEntertainmentInfo();
		System.out.println("Maturity Rating: " + movie1.getMovieRating());
		System.out.println("Genre: " + movie1.getGenre());
		System.out.println();
		movie2.getEntertainmentInfo();
		System.out.println("Maturity Rating: " + movie2.getMovieRating());
		System.out.println("Genre: " + movie2.getGenre());
		System.out.println();
		game1.getEntertainmentInfo();
		System.out.println("Maturity Rating: " + game1.getGameRating());
		System.out.println("Genre: " + game1.getGenre());
		System.out.println();
		game2.getEntertainmentInfo();
		System.out.println("Maturity Rating: " + game2.getGameRating());
		System.out.println("Genre: " + game2.getGenre());
		System.out.println();
		
		
		movie1.setMovieRating("R");
		System.out.println(movie1.getTitle() + " is now rated " + movie1.getMovieRating());
		System.out.println();
		game2.setGameRating("E");
		System.out.println(game2.getTitle() + " is now rated " + game2.getGameRating());
		System.out.println();
	}
}
