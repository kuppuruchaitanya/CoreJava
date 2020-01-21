public class Stall {

    protected String name;
	protected String detail;
	protected String ownerName;
	
	public Stall() {
		super();
	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double computeCost(String stallType, int squareFeet)
	{
		int a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return a*squareFeet;
	}
	
	public double computeCost(String stallType,int squareFeet,int numberOfTV)
	{
		double a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return ((a*squareFeet)+(numberOfTV*10000));
	}
	
}
