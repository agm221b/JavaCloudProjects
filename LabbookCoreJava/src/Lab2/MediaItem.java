package Lab2;

public abstract class MediaItem extends Item {
	
	private int runtime;

	public MediaItem(int id, int noOfCopies, String title, int runtime) {
		super(id, noOfCopies, title);
		this.runtime = runtime;
		// TODO Auto-generated constructor stub
	}
	
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public abstract void checkIn();
	
	@Override
	public abstract void checkOut();

	
	@Override
	public abstract void print();

	
	@Override
	public abstract void addItem();
	

}
