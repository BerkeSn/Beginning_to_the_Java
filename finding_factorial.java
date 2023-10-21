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
	}
}
