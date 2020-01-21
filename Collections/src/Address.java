public class Address implements Comparable<Address>
{
    private String username;//Declaring class variables
	private String addressLine1;
	private String addressLine2;
	private int pincode;
	
	public Address() {//Default constructor
		super();
	}

	public Address(String username, String addressLine1, String addressLine2, int pincode) {
		super();//Parameterized constructor
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
	}

	public String getUsername() {//Create getters and setters for variables
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public int compareTo(Address o) {
		if(this.pincode==o.pincode)//If both pincodes are equal
		{
			return (this.addressLine1.compareTo(o.addressLine1));//then compare with address lines
				
		}
		else if(this.pincode>o.pincode)//Else compare pincodes
		return 1;
		else
		return -1;
	}

	@Override
	public String toString() {//To string to print data in csv format
		return username + "," + addressLine1 + "," + addressLine2+ "," + pincode;
	}
}