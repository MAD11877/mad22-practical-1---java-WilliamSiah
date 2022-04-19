import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt user for integer
    // System.out.print("Enter integer: ");
    int num = in.nextInt();
    // Multiply integer by itself
    int num2 = num * num;
    // Print result
    // System.out.println("Result: " + num2);
    System.out.println(num2);
  }
}
