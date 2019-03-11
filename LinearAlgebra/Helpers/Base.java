package Helpers;
import java.util.Scanner;

public class Base {
  static String foo = "Foo Bar";

  public static void echo (String txt) { System.out.println(txt); }
  
  public static int[] dimensionInit (Scanner scanner) {
    echo("No. of rows?");
    int rowCount = scanner.nextInt();
    echo("No. of columns?");
    int colCount = scanner.nextInt();

    int[] dimCount = { rowCount, colCount };
    return dimCount;
  } 
}