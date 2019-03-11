public class CalculateAverage {
  public static void main (String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    System.out.println("The average is " + mean(summation(arr), arr.length));
  }

  public static double mean (double total, int length) {
    return total / length;
  }

  public static int summation (int[] arrayInt) {
    int sum = 0;
    for (int i = 0 ; i<arrayInt.length ; i++) {
      sum = sum + arrayInt[i];
    }
    return sum;
  }
}