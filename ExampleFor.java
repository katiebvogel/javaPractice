public class ExampleFor {
  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++) {
      System.out.println(" i = " + i);
    }
    int x = 3;
    while(x <= 8) {
      System.out.println("X = " + x);
      x++;
      // only prints up to x = 8
    }
    System.out.println("this is the last value of x: " + x);
    // prints x = 9 because we still incremented x when x=8 inside the while loop
  }
}
