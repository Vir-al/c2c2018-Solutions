class Pascal {

	public static int fact(int n){		//helper for non recursive method
		int fact = 1;
		while(n >= 1){
			fact *= n--;
		}

		return fact;
	}

	public static void pascalTriangleNonRecursive(int n){
		for(int i = 0 ; i < n ; i++){
			for(int j = i ; j < n ; j++){
				System.out.print(" ");
			}

			for(int k = 0 ; k < i+1 ; k++){
				int num = fact(i) / (fact(k) * fact(i-k));
				System.out.print(num + " ");
			}

			System.out.println();
		}
	}

	public static int combination(int n,int r){ 	//helper for recursive method
		if(r == 0){
			return 1;
		} else if(r == n){
			return 1;
		}
		return combination(n-1,r) + combination(n-1,r-1);
	}

	public static void pascalTriangleRecursive(int n){
		for(int i = 0 ; i < n ; i++){
			for(int j = i ; j < n ; j++){
				System.out.print(" ");
			}

			for(int k = 0 ; k < i+1 ; k++){
				int num = combination(i,k);
				System.out.print(num + " ");
			}

			System.out.println();
		}
	}


	public static void pascalTriangle(int n, String type){
		switch(type){
			case "recursive" :
				System.out.println("Recursiv method :");
				pascalTriangleRecursive(n);
				break;
			case "non-recursive" :
				System.out.println("Non-recursiv method :");
				pascalTriangleNonRecursive(n);
				break;
			default :
				System.out.println("Please choose type among the following..");
				System.out.println("1. recursive\n2. non-recursive");
		}
	}

	public static void main(String[] args) {
		pascalTriangle(5,"non-recursive");
		pascalTriangle(5,"recursive");
	}
}