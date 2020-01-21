public class WeakPasswordException extends Exception {
    
	String message;           

	public WeakPasswordException(String message) {            
		super();
		this.message = message;
	}	

}