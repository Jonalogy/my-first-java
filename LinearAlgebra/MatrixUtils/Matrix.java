package MatrixUtils;
import java.util.Scanner;

public class Matrix {
  public String type = "Matrix";
  public int rowCount;
  public int colCount;
  public int val[][];

  // Constructor
  // public CreateMatrix(int r, int c){
  public Matrix(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("No. of rows?");
    rowCount = scanner.nextInt();
    System.out.println("No. of columns?");
    colCount = scanner.nextInt();
    
    val =  new int[rowCount][colCount];

    for(int r=0 ; r<val.length ;  r++){
      for(int c=0 ; c<val[r].length ; c++){
        echo("[" + r + "," + c + "]");
        val[r][c] = scanner.nextInt();
      }
    }

    // scanner.close(); // Enabling this will crash the program. See this -> https://stackoverflow.com/a/15398862/7387669
  }
    
  public static void echo (String txt) {
    System.out.println(txt);
  }
}