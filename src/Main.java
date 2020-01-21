import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
		
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(input);
		
		System.out.println("Enter the name of the event:");     
		String name= br.readLine();
		
		System.out.println("Enter the detail of the event:");
		String detail=br.readLine();
		
		System.out.println("Enter the owner name of the event:");
		String owner=br.readLine();
		
		System.out.println("Enter the type of the event:\r\n" + "1.Exhibition\r\n" + 
				"2.StageEvent");
		int n= Integer.parseInt(br.readLine());
		
		int x,y,z;
		
		switch(n)
		{
		case 1: System.out.println("Enter the number of stalls:");
		        x=Integer.parseInt(br.readLine());
		        Exhibition ob= new Exhibition(name,detail,owner,x);
		        System.out.println("The projected revenue of the event is "+ob.projectedRevenue(x));
		        break;
		case 2: System.out.println("Enter the number of shows:");
		        x=Integer.parseInt(br.readLine());
		        System.out.println("Enter the number of seats per show:");
		        y= Integer.parseInt(br.readLine());
		        StageEvent obj= new StageEvent(name,detail,owner,x,y);
		        System.out.println("The projected revenue of the event is "+obj.projectedRevenue(x,y));
		        break;
		default:System.out.println("Invalid case");
		        break;
		}
		
		

	}

}
