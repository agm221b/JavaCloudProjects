package Lab2;

public class Video extends MediaItem {

	public Video(int id, int noOfCopies, String title, int runtime,String director , String genre, int yearReleased) {
		super(id, noOfCopies, title, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
		// TODO Auto-generated constructor stub
	}
	
	private String director, genre;
	private int yearReleased;
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}

	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}
	

}
