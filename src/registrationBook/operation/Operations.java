package registrationBook.operation;
import java.util.Scanner;
import registrationBook.bean.Details;

public class Operations {
	
	public static void main(String[] args) {
		
	System.out.println("***** Wlecome To Registration Book ******");
	System.out.println(" Please Enter Following Details  ");
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter your id : ");
	int id = sc.nextInt();
	System.out.println(" Enter your UserName : ");
	String username =sc.next(); 
	System.out.println(" Enter your First Name : ");
	String firstname = sc.next();
	System.out.println(" Enter your last Name : ");
	String lastname = sc.next();
	System.out.println(" Enter your Email : ");
	String email = sc.next();
			
	
	Details user = new Details();
	user.setId(id);
	user.setUserName(username);
	user.setFirstName(firstname);
	user.setLastName(lastname);
	user.setEmail(email);
	
	
	System.out.println(" Your data hasbeen Successfully Save : ");
	System.out.println(" Do you wish to show the data inserted : ");
	System.out.println(" please enter 1 to proceesed and 0 to exit : ");
	
	int flag = sc.nextInt();
	
	if( flag == 1) {
		
		System.out.println(" ID : "+user.getId());
		System.out.println(" UserName : "+user.getUserName());
		System.out.println(" FirstName : "+user.getFirstName());
		System.out.println(" Lastname : "+user.getLastName());
		System.out.println(" Email : "+user.getEmail());
		
	}
	else if (flag == 0 ) {
		System.exit(0);
	}
	else {
		System.out.println(" Please enter a valid number : ");
	}
	
	System.out.println(" press 1 to  proceese and 0 to exit : ");
	int exit = sc.nextInt();	
	if (exit == 0) {
		System.exit(0);
	}
	else {
		System.err.println(" please enter a valid response : ");
	}
	
	
	
	
	
	
	
	}
	
	
}
