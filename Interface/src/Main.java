import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BankFactory bf = new BankFactory();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Icici ic;
		Hdfc hd;
		System.out.println("Welcome to Notification Setup\nPlease select your bank:\n1)ICICI\n2)HDFC");
		int select = Integer.parseInt(br.readLine());
		if(select == 1){
			ic  = bf.getIcici();
			System.out.println("Enter the type of Notification you want to enter\n1)SMS\n2)Mail\n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			if(notificationChoice == 1){
				ic.notificationBySms();
			} else if (notificationChoice == 2){
				ic.notificationByEmail();
			}else if(notificationChoice == 3) {
				ic.notificationByCourier();
			} else {
				System.out.println("Invalid Input");
			}
		} else if(select ==2) {
			hd = bf.getHdfc();
			System.out.println("Enter the type of Notification you want to enter\n1)SMS\n2)Mail\n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			if(notificationChoice == 1){
				hd.notificationBySms();
			} else if (notificationChoice == 2){
				hd.notificationByEmail();
			}else if(notificationChoice == 3) {
				hd.notificationByCourier();
			} else {
				System.out.println("Invalid Input");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}
}

