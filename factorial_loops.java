import java.util.Scanner;

public class d9 {

	public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int a = scan.nextInt();
		int factorial = 1;
		
		while (a>=1) {
			factorial = factorial*(a);
			a = a-1;
			System.out.println(factorial);
		}
	

	// Rest of the codes are doing the same thing with for loop

		System.out.print("Input a integer: ");
		int a = scan.nextInt();
		int faktoriel = 1;
		for(;a>=1;a--) {
			faktoriel *=a;
		}
		System.out.println(faktoriel);
	
	}	
}
