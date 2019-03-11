import MatrixUtils.Matrix;
import java.util.Scanner;

public class LinearAlgebra {
  public static void main (String[] args) {
    Matrix[] matrices = new Matrix[2];

    System.out.println("--- Matrix ---");
    System.out.println("Creating 1st Matrix");

    matrices[0] = new Matrix();
    echo("> " + matrices[0].val[1][1]);

    System.out.println("Creating 2nd Matrix");
    matrices[1] = new Matrix();
    echo("> " + matrices[1].val[1][1]);

  }

  public static void echo (String txt) {
    System.out.println(txt);
  }
}