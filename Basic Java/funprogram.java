import java.util.Scanner;

public class funprogram {

    // Correct factorial function
    public static int factN(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) { // Loop to calculate factorial
            fact *= i;
        }
        return fact;
    }

    // Binomial coefficient function
    public static int Binomial(int n, int r) {
        int fact_N = factN(n);
        int fact_R = factN(r);
        int fact_N_R = factN(n - r);
        return fact_N / (fact_R * fact_N_R); // Formula: n! / (r! * (n-r)!)
    }

    // Method overloading
    public static int sumcal(int a, int b) {
        return a + b;
    }

    public static float sumcal(float a, float b) {
        return a + b;
    }

    // Prime number 
    public static boolean isprime(int n){
        if (n==2){
            return true;

        }
        // for (int i=2;i<=n-1 ;i++ ) {
        //     if(n%i==0){
        //         return false;
        //     }
        // }for (int i=2;i<=n-1 ;i++ ) {
        //     if(n%i==0){
        //         return false;
        //     }
        // }

        // optomiz operoch 

        for (int i=2;i<=Math.sqrt(n) ;i++ ) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Range Prime number -----------------------
    public  static void rangePrime(int n){
        if (n==1 || n==2){
            System.out.println(n + " ");
        }
        for (int i=2 ; i<=n ; i++) {
            if (isprime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for n and r
        System.out.println("Enter the Value of N:");
        int n = sc.nextInt();
        System.out.println("Enter the Value of R:");
        int r = sc.nextInt();

        // Binomial coefficient
        System.out.println("Binomial Coefficient: " + Binomial(n, r));

        // Sum calculations
        System.out.println("Sum of Integer Type: " + sumcal(n, r));
        System.out.println("Sum of Float Type: " + sumcal(12.4f, 33.5f));

        // Check prime number 
        System.out.println("Check number is prime "+isprime(n));

        rangePrime(n);
    }
}
