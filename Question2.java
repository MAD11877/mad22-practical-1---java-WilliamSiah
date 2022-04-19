import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    Scanner in = new Scanner(System.in);
    
    // Prompt user for height (cm)
    System.out.print("Enter height (cm):");
    double height = in.nextDouble();
    // Prompt user for weight (kg)
    System.out.print("Enter weight (kg):");
    double weight = in.nextDouble();
    // Calculate BMI
    double bmi = weight / (height * height);
    System.out.println("Your BMI is: " + bmi);

  }
}
