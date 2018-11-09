public class ExampleAndOr {
  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = -10;

    if(x > 0 && y > 0 ) {
      System.out.println(" X and Y both positive");
    } else if(x > 0 || y > 0) {
      System.out.println("One of the numbers is positive");
    } else {
      System.out.println("both are negative");
    }
    
  }
}
