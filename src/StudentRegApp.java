import java.util.Scanner;

	public class StudentRegApp   {

	public static void main(String[] args) {
		// TODO Enter Welcome Msg
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		// TODO Read a String
		System.out.print("Enter First Name: ");	
		String firstName = sc.next();
		
		System.out.print("Enter Last Name: ");	
		String lastName = sc.next();
		
		// Read and int value
		System.out.print("Enter Year of Birth: ");	
		int yearofBirth = sc.nextInt();
		System.out.println();
		
		// TODO Enter Password
		System.out.println();
		System.out.println("Welcome" + firstName + "" + lastName + "!");
		
				
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is  :" + firstName +"*" + yearofBirth);
		//TODO Enter Goodbye
	
		System.out.println("Goodbye!!");
		sc.close();
		}
	}


