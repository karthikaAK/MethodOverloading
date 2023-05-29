package SumAverage;
import java.util.Scanner;

public class Sum {
    
    // Sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    // Sum of three integers
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    // Average of two numbers
    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }
    
    // Average of three numbers
    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // user input
        System.out.println("Enter two integers ");
        int a = input.nextInt();
        int b = input.nextInt();
       
        
        // calling sum of two integers
        int Sum1 = sum(a, b);
        System.out.println("Sum of two integer is " + Sum1);
        System.out.println();
        
        // user input
        System.out.println("Enter three integers");
        
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        
        // calling sum of three integers
        int Sum2 = sum(x, y, z);
        System.out.println("Sum of three integer is " + Sum2);
        System.out.println();
        
        // User input for average
        System.out.println("Enter two Numbers to find the average:");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        
        // Calling average of two numbers
        double Avg1 = average(d1, d2);
        System.out.println("Average of two double is " + Avg1);
        System.out.println();
        
        // User input 
        System.out.println("Enter three double to find the average:");
        double d3 = input.nextDouble();
        double d4 = input.nextDouble();
        double d5 = input.nextDouble();
        
        // calling average of three numbers
        double Avg2 = average(d3, d4, d5);
        System.out.println("Average of three  is "  + Avg2);
        
        input.close();
        
        
    }
}