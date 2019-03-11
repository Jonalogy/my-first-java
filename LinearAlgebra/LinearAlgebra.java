import java.util.Scanner;

import Helpers.Base;
import MatrixUtils.Matrix;

public class LinearAlgebra extends Base {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Matrix[] matrices = new Matrix[2];

    echo("--- Matrix ---");
    for(int i=0 ; i<matrices.length ; i++){
      echo("Creating Matrix-"+ (i+1));
      matrices[i] = initMatrix(scanner);
    }
  }

  public static Matrix initMatrix (Scanner scanner) {
    int dimCount [] = dimensionInit(scanner);
    return new Matrix(dimCount[0], dimCount[1]);
  }
}