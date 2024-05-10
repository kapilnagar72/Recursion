package Recursion;

import java.util.*;

public class FindFact {
    public static int FactorialFind(int n)
    {
        //int result = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            // Recursion function calling
            //int result = n * FactorialFind(n - 1);
            return n * FactorialFind(n - 1);
        }
        //return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int result = FactorialFind(n);
        System.out.println("factorial of gives number: " + result);
        sc.close();
    }
}
