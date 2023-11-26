		Scanner scan=new Scanner(System.in);

		int odd = 0;
		int even=0;
		char q;
		
		do {
			System.out.print("Enter an integer==> ");
			int number = scan.nextInt();
			if(number%2==0) {
				odd = odd + number;
			}
			else {
				even = even + number;
			}
			System.out.print("Do you want to continue y/n ");
			q = scan.next().charAt(0);
		}while(q == 'y' || q=='Y');
		
		
		System.out.println("Sum of even numbers: " + even);
		System.out.println("Sum of odd numbers: " + odd);
