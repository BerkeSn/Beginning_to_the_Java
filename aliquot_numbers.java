		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a pozitive integer: ");
		int a = scan.nextInt();
		int n=1;
		
		for(;n<=a;n++){
			if(a%n==0) {
				System.out.println(n + " can divide " + a);
			}
		}
