import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);//Initialize scanner
		List<Address> li= new ArrayList<Address>();//Initialize arraylist to store data
		System.out.println("Enter the number of users:");//Get number of users
		int n= Integer.parseInt(sc.nextLine());
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");//Get user details
		for(int i=0;i<n;i++)
		{
			String add= sc.nextLine();
			String a[]= add.split(",");//Split user details
			Address ad= new Address(a[0],a[1],a[2],Integer.parseInt(a[3]));//Create object for address class and load details into sonstructor
			li.add(ad);//add them to arryalist
		}
		li.sort(null);//Sort the arryalist
		System.out.println("User Details:");//Print user details using toString method
		for (Address address : li) {
			System.out.println(address);
		}
		
	}
}