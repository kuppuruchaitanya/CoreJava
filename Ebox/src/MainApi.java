import java.util.Scanner;

	public class MainApi {

	    public static void main(String[] args) {
			
			Scanner Sc= new Scanner(System.in);
			
			System.out.println("Enter the string");
			String a= Sc.nextLine();
			
			System.out.println("Enter the string to be searched");
			String b= Sc.next();
			
			System.out.println("The index of last occurence of \""+b+"\" is "+a.lastIndexOf(b));
			System.out.println("Enter the index limit");
			int n= Sc.nextInt();
			
			String s=a.substring(0,n);
			
			System.out.println("First occurence of \""+b+"\" from "+n+"th index backwards is "+(s.lastIndexOf(b)));
			}
			

		}

