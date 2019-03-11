import java.util.Scanner;
import Helpers.Base;
import MatrixUtils.Matrix;
import Transform.Pipe;

public class LinearAlgebra extends Base {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Matrix[] matrices = new Matrix[2];
    // Matrix result;

    echo("--- Matrix Transformation---");

    // Set Dimensions
    for(int i=0 ; i<matrices.length ; i++){
      echo("Creating Matrix-"+ (i+1));
      matrices[i] = initMatrix(scanner);
    }

    // Set values
    for(int i=0 ; i<matrices.length ; i++){
      echo("Creating Matrix-"+ (i+1));
      matrices[i].setValue(inputMatrixValue(scanner, matrices[i].getDim()));
      echoMatrix(matrices[i]);
    }
    
    Pipe pipe = new Pipe(matrices);
    pipe.addition();
  }

  public static Matrix initMatrix (Scanner scanner) {
    int dimCount [] = inputInitDimensions(scanner);
    return new Matrix(dimCount[0], dimCount[1]);
  }
}