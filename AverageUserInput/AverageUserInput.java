import java.util.Scanner;

public class AverageUserInput {
  public static void main (String[] args) {
    double[] userInputs = getUserInput();

    System.out.println(
      mean(summation(userInputs),
      userInputs.length)
    );
  }

  public static double[] getUserInput () {
    System.out.println("How many numbers you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    double[] userInputs = new double[n];
    
    System.out.println("Setting up for a " + userInputs.length + "-size array");

    for(int i=0 ; i<userInputs.length ; i ++) {
      System.out.print("Enter Element No."+(i+1)+": ");
      userInputs[i] = scanner.nextDouble();
    }

    scanner.close();

    return userInputs;
  }

  public static double mean (double total, int length) {
    return total / length;
  }

  public static double summation (double[] arrayInt) {
    double sum = 0;
    for (int i = 0 ; i<arrayInt.length ; i++) {
      sum = sum + arrayInt[i];
    }
    return sum;
  }
}