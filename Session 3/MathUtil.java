public class MathUtil{

	public static long gcd(long a, long b){
		if(b == 0){
			return a;
		}

		if(a < b){
			a = a+b;
			b = a-b;
			a = a-b;
		}

		return (b , a % b);
	}

	public static long lcm(long a, long b){
		return 0;
	}

	public static long min(long[] arr){
		long min = 999999999999999999L;
		for(int i = 0 ; i < arr.length ; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}

	public static int min(int[] arr){
		int min = 999999999;
		for(int i = 0 ; i < arr.length ; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}

	public static long max(long[] arr){
		long max = -999999999999999999L;
		for(int i = 0 ; i < arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}

	public static int max(int[] arr){
		int max = -999999999;
		for(int i = 0 ; i < arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}

	public static double average(long[] arr){
		long sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			sum += arr[i];
		}
		return ((double)sum)/arr.length;
	}


}