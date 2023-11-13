		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number ");
		int a=scan.nextInt();
		int k=a;
		while(k>=1) {
			a=k%10;
			System.out.print(a);
			k = k/10;
		}
