import java.util.Scanner;

public class Term2 {

    public static void main(String[] args) {

        /* Read the input provided by user */
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        /* Close Scanner after the use */
        scan.close();
        
        // Calculating product of two numbers
        int product = num1*num2;
        System.out.println("Output: "+product);
    }
}
