public class ExampleDoWhile {
  public static void main(String[] args) {
    int x = 10;
    // Do While loop checks for the condition AFTER the first run of the statement
    do {
      System.out.println("x =  " + x);
      x--;
      // last value will be x = 1
    } while(x >0);
    System.out.println(" value of x outside of do while loop: " + x);
    // final value will be x = 0
  }
}
