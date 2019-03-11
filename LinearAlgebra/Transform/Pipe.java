package Transform;
import MatrixUtils.Matrix;

public class Pipe {
  Matrix subjects[];
  public Pipe (Matrix[] args) {
    subjects = args;
  } 

  public void addition () {
    Matrix sub1 = subjects[0];
    Matrix sub2 = subjects[1];
    if (sub1.rowCount == sub2.rowCount && sub1.colCount == sub2.colCount) {
      return;
    }
    System.out.println("uhoh");
  }
}