import java.util.*;

class SieveOfEratosthenes {
    public static ArrayList getPrimes(int n) {
        boolean[] b = new boolean[n];
        Arrays.fill(b, true);

        for(int i = 2; i < (Math.sqrt(n) + 1); i++) {
            if(b[i]) {
                for(int j = (int)Math.pow(i, 2); j < n; j += i) {
                    b[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < n; i++) {
            if(b[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Primes: " + getPrimes(n).toString());
        
        sc.close();
    }
}