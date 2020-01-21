public class Customer {
    
	private String name;
	private String email;
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
