		int total=0;
		
		for(int a=1; a<=10;a++){
			total += a;
			System.out.println("Total of from 1 to " + a + " equal to: " + total) ;
		}
		
		System.out.println("Total: " + total);

		// At the below you can sum of two integer of your entered

		Scanner scan=new Scanner(System.in);
		
		char choice;
		int x,y;
		int sum=0;
		do {
			
			System.out.print("Enter an integer: ");
			x = scan.nextInt();
			
			System.out.print("Enter an integer: ");
			y= scan.nextInt();
			
			sum= x+y;
			
			System.out.println("Sum of " + x + " + " + y + " == " + sum);
			
			System.out.print("Do you want to continue(y/N): ");
			choice = scan.next().charAt(0);
		}while(choice=='y'|| choice=='Y');
