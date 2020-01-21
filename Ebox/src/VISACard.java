public class VISACard {
    
	private String holderName;
	private String ccv;
	
	public VISACard() {            //Default Constructor
		super();
	}

	/**
	 * @param holderName
	 * @param ccv
	 */
	public VISACard(String holderName, String ccv) {       //Parameterized Constructor
		super();
		this.holderName = holderName;
		this.ccv = ccv;
	}
	
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCcv() {
		return this.ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public static double computeRewardPoints(String purchaseType, Double amount)
	{
		//System.out.println(amount);
		return amount*0.01;
	}

}