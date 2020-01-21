import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);          
		
		try                                          
		{
			System.out.println("Enter the user details");        
			String det= sc.nextLine();
			
			String a[]= det.split(",");                     
			
			User ob= new User(a[0],a[1],a[2],a[3]);            
			 
			UserBO ob2= new UserBO();                          
			
			ob2.validate(ob);                                  
			
			System.out.println(ob);                           
		}
		
		catch(WeakPasswordException e)                
		{ 
			System.out.println("WeakPasswordException: "+e.message);      
		}

	}

}