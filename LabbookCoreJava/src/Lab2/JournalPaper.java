package Lab2;

public class JournalPaper extends WrittenItem {

	public JournalPaper(int id, int noOfCopies, String title, String author, int yearPublished) {
		super(id, noOfCopies, title, author);
		this.yearPublished = yearPublished;
		// TODO Auto-generated constructor stub
	}
	
	private int yearPublished;

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

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

}
