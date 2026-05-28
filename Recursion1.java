import java.util .Scanner;

// user input

 public class Recursion1 {
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }

    
    static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        } else {
            // Recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Recursion1 rec = new Recursion1();
        rec.factorial(5); }
    }