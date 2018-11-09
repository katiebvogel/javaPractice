public class ExampleArrays {
  public static void main(String[] args) {
    // see below for different ways to declare variables
    // int a = 2;
    // int b = 9;
    // int c, d, e;
    // c = 10; d = 12; e = 37;

    int a[] = {2, 9, 10, 12, 37};
    for(int i = 0; i < a.length; i++) {
      System.out.println(" a [" + i + "] : " + a[i]);
    }
  }
}
