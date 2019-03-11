package Helpers;
import java.util.Scanner;
import java.util.Arrays;
import MatrixUtils.Matrix;;

public class Base {
  static String foo = "Foo Bar";

  public static void echo (String txt) { System.out.println(txt); }
  
  public static void echoMatrix (Matrix mtx) {
    int[] dim = mtx.getDim();
    int rowCount = dim[0];
    for(int i=0 ; i<rowCount; i++){
      echo(Arrays.toString(mtx.val[i]));
    }
  }

  public static int[] inputInitDimensions (Scanner scanner) {
    echo("No. of rows?");
    int rowCount = scanner.nextInt();
    echo("No. of columns?");
    int colCount = scanner.nextInt();

    int[] dimCount = { rowCount, colCount };
    return dimCount;
  } 

  public static int[][] inputMatrixValue (Scanner scanner, int[] dim) {
    int rowCount = dim[0];
    int colCount = dim[1];
    int val[][] = new int[rowCount][colCount];

    for(int r=0 ; r<val.length ;  r++){
      for(int c=0 ; c<val[r].length ; c++){
        echo("Value [" + r + "," + c + "]:");
        val[r][c] = scanner.nextInt();
      }
    }
    return val;
  }
}