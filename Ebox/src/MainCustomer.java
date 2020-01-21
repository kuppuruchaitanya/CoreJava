import java.util.Scanner;
public class MainCustomer {
	 public static void main(String[] args) {
			
			Scanner Sc= new Scanner(System.in);
			
			System.out.println("Enter First Customer Details :");
			
			System.out.println("Enter Customer Name :");
			String cname1= Sc.next();
			
			System.out.println("Enter Customer Email :");
			String cemail1= Sc.next();
			
	        System.out.println("Enter Second Customer Details :");
			
			System.out.println("Enter Customer Name :");
			String cname2= Sc.next();
			
			System.out.println("Enter Customer Email :");
			String cemail2= Sc.next();
			
			Customer c1= new Customer(cname1,cemail1);
			Customer c2= new Customer(cname2,cemail2);
			
			if(cemail1==cemail2)
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are equal");
			}
			else
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are not equal");
			}
			
			System.out.println("After duplicating First customer :");
			
			if(cemail1.equals(cemail2))
			{
				System.out.println("The reference of first and new customer Email ids are Equal");
			}
			else
			{
				System.out.println("The reference of first and new customer Email ids are not Equal");
			}

		}

	}