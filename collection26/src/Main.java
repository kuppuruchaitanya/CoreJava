import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main{    
    public static void main(String[] args) { 
		
		ArrayList<Employee> li= new ArrayList<>();  
		Scanner sc= new Scanner(System.in);    
		
		System.out.println("Enter The Number of Employees");  
		int n= Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee "+(i+1)+" Details:");    
			System.out.println("Enter the Firstname");
			String first_name= sc.nextLine();
			System.out.println("Enter the Lastname");
			String last_name= sc.nextLine();
			System.out.println("Enter the Mobile");
			long mobile_number= Long.parseLong(sc.nextLine());
			System.out.println("Enter the Email");
			String email_id= sc.nextLine();
			System.out.println("Enter the Address");
			String address= sc.nextLine();
			
			Employee ep= new Employee(first_name, last_name, mobile_number, email_id, address);  //Loading into constructor
			li.add(ep);       
		}
		Collections.sort(li,new Employee());                      
		Employee ep= new Employee();  
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		for (Employee employee : li) {//Printing data
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",employee.getFirst_name(),employee.getLast_name(),employee.getMobile_number(),employee.getEmail_id(),employee.getAddress());
		}
	}

}