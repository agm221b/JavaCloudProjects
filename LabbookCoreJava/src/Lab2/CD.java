package Lab2;

public class CD extends MediaItem {

	public CD(int id, int noOfCopies, String title, int runtime,  String artist, String genre) {
		super(id, noOfCopies, title, runtime);
		this.artist = artist;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}
	
	private String artist, genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
