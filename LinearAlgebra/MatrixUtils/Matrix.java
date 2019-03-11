package MatrixUtils;

import java.util.Scanner;
import Helpers.Base;

public class Matrix extends Base {
  public String type = "Matrix";
  public int rowCount;
  public int colCount;
  public int val[][];

  // Constructor
  public Matrix(int rowC, int colC){
    rowCount = rowC;
    colCount = colC;
    
    val =  new int[rowCount][colCount];
    echo("I'm a [" + rowCount + " x " + colCount + "] matrix");
  }
  public int[] getDim () {
    int[] dim = { rowCount, colCount };
    return dim;
  }

  public void setValue (int[][] userInput) {
    val = userInput;
  }
}