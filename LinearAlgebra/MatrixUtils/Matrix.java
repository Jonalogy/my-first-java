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


    // for(int r=0 ; r<val.length ;  r++){
    //   for(int c=0 ; c<val[r].length ; c++){
    //     echo("[" + r + "," + c + "]");
    //     val[r][c] = scanner.nextInt();
    //   }
    // }

    // scanner.close(); // Enabling this will crash the program. See this -> https://stackoverflow.com/a/15398862/7387669
  }
    
  public void setValue (int[][] userInput) {
    val = userInput;
  }
}