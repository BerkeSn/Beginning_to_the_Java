import java.util.Scanner;

    Scanner scan = new Scanner(System.in);

    System.out.print("Input a base integer: ");
		int a=scan.nextInt();
		
		System.out.print("Input a power integer: ");
		int b=scan.nextInt();
		int result=1;
		
		for(;b>=1;b--) {
			result *=a;
		}
		System.out.println(result);
