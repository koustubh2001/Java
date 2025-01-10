package Basic;

public class NPrime {
    public class PrimeNumbers {
        public static void printPrimes(int N) {
            for (int num = 2; num <= N; num++) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num);
                }
            }
        }
    
        public static void main(String[] args) {
            int N = 50; // Example input
            printPrimes(N); // Prints all primes from 1 to N
        }
    }
    
    
}
