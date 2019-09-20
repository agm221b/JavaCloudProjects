/**
 * 
 */
package Lab2;

/**
 * @author User
 *
 */
public abstract class Item {
	
	private int id, noOfCopies;
	private String title;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Item(int id, int noOfCopies, String title) {
		super();
		this.id = id;
		this.noOfCopies = noOfCopies;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", noOfCopies=" + noOfCopies + ", title="
				+ title + "]";
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + noOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public abstract void checkIn();
	
	public abstract void checkOut();
	
	public abstract void print();
	
	public abstract void addItem();
	
	

}
