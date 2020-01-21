import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);       
		System.out.println("Enter the source city:");       
		String source= sc.next();
		System.out.println("Enter the destination city:");
		String destination= sc.next();
		System.out.println("Enter the flight\r\n1.Air India\r\n2.Indigo"); 
		int sel= Integer.parseInt(sc.next());
		double price;
		if(sel==1) 
		{
			AirIndia ai= new AirIndia();
			price=ai.showFare(source, destination);
			System.out.println("The fare is "+price);
		}
		else if(sel==2)
		{
			Indigo in= new Indigo();
			price=in.showFare(source, destination);
			System.out.println("The fare is "+price);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}