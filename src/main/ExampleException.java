public class ExampleException {
  public static int rectangleArea(int a, int b) throws IllegalArgumentException {
    // TODO put your code here
    int c;
    if (a > 0 && b >0){
     c = a * b;
    } else {
      throw new IllegalArgumentException("input value is below zero!");
    }
    return c;
  }
}


