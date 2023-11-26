import java.util.Scanner;

    Scanner scan = new Scanner(System.in);

    int n,a;
		
		String st = "";
		
		System.out.println("Enter decimal number");
		n = scan.nextInt();
		
		while(n>0) {
			a = n%2;
			st = a + "" + st;
			n = n/2;
		}
		System.out.print(st);
