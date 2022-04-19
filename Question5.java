import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt user for Initial integer
    // System.out.print("Enter a number: ");
    int initialNum = in.nextInt();

    // Initalise list
    ArrayList<Integer> numList = new ArrayList<>();
    // Get list of numbers
    for (int i = 0; i < initialNum; ++i){
      // System.out.print("Enter a random integer: ");
      int ranInt =  in.nextInt();
      // Add int to list
      numList.add(ranInt);
    }

    // Finding Mode
    int mode = 0;
    int mostCount = 0;
    for (int k : numList){
      int count = 0;
      // Counting number of times the number appears
      for (int j : numList){
        if(k == j){
          ++count;
        }
      }
      // Checking if new count if more than old count.
      // If it is, make current number in interation the new mode
      // If not, mode stays the same
      if (count > mostCount){
        mostCount = count;
        mode = k;
      }
    }

    // Print Mode
    // System.out.println("The Mode is: " + mode);
    System.out.println(mode);
  }
}
