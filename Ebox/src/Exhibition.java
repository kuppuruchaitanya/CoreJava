public class Exhibition extends Event {
    
	private int noOfStalls;

	public Exhibition() {
		super();
	}

	public Exhibition(String name, String details, String ownerName,int noOfStalls) {
		super(name, details, ownerName);
		this.noOfStalls= noOfStalls;
	}
	
	public double projectedRevenue(int noOfStalls)
	{
		return noOfStalls*10000;
		
	}
}