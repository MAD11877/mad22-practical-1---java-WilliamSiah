import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt user for base length
    // System.out.print("Enter base length of triangle (int): ");
    int base = in.nextInt();
    // Printing triangle
    for (int i = base; i > 0; --i){
      for (int k = 0; k < i; ++k){
        System.out.print("*");
      }
      // New line
      System.out.println();
    }
  }
}
