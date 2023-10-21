import java.util.Scanner;

public class d10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int number = scan.nextInt();
		int total = 0;
		
		do {
			total += number % 10;
			number = number /10;
			
			System.out.println("Total= " + total + " number= "+ number);
			
		}
		
		while(sayi>0);
		System.out.println("Total= " + total);
	}
}
