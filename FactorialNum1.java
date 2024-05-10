package Recursion;

public class FactorialNum1 {
  public static void main(String[] args) {
    int n = 5;
    int result = factorial(n);
    System.out.println("factorial of " + n + " is " + result);
  }
      
      // Method to compute factorial of n recursively
      public static int factorial(int n)
    {
      if (n == 0 || n == 1) {
        return 1; // Base case: factorial of 0 or 1 is 1
      } else {
        return n * factorial(n - 1);
      }
    }
  }
