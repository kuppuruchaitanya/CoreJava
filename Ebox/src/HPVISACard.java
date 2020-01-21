public class HPVISACard extends VISACard{

    public HPVISACard() {                            //Calling default constructor from superclass
		super();
	}

	
	public HPVISACard(String holderName, String ccv) {  //Calling parameterized constructor from superclass
		super(holderName, ccv);
	}
	
	public double computeRewardPoints(String purchaseType, double amount)
	{
		double points;
		if(purchaseType.equals("Fuel"))
		{
			points= VISACard.computeRewardPoints(purchaseType, amount)+10;
		}
		else
			points= VISACard.computeRewardPoints(purchaseType, amount);
		return points;
	      
	}

}
