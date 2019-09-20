/**
 * 
 */
package Lab2;

/**
 * @author User
 *
 */
public abstract class WrittenItem extends Item {

	public WrittenItem(int id, int noOfCopies, String title, String author) {
		super(id, noOfCopies, title);
		this.author = author;
		// TODO Auto-generated constructor stub
	}
	
	private String author;

	
	@Override
	public abstract void checkIn();
	
	@Override
	public abstract void checkOut();

	
	@Override
	public abstract void print();

	
	@Override
	public abstract void addItem();
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
