public class CalculateArrayAverage {
  public static void main (String[] args) {
    double[] arr = { 19, 12.89, 16.5, 200, 13.7 };
    System.out.format("The average is: %.3f", mean(summation(arr), arr.length));
    // System.out.println("The average is " + mean(summation(arr), arr.length));
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