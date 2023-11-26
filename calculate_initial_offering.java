import java.util.Scanner;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Price of one Lot==> ");
		double x = scan.nextDouble();
		
		System.out.print("Number of Lot==> ");
		int a = scan.nextInt();
		
		double balance=a*x;
		double y=balance;
		
		System.out.println("Your investing==> " + balance);
		
		System.out.print("Number of ceiling==> ");
		int tavan = scan.nextInt();
		
		while(tavan>=1) {
			
			balance = (balance*0.1)+balance;
			tavan--;
			
		}
		System.out.println("Total profit==> " + (balance-y));
		System.out.println("Total==> " +balance);
		
	}
