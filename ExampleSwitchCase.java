public class ExampleSwitchCase {
  public static void main(String[] args) {
    int x = 2;
  // you can also use String instead of int
    switch(x){
      case 0:
        System.out.println("value is 0");
        break;
      case 1:
        System.out.println("value is 1");
        break;
      case 2:
        System.out.println("value is 2");
        break;
        // if you have no break, it would continue and also print "value is 3"
      case 3:
        System.out.println("value is 3");
        break;
      default:
        System.out.println("No Value");
        break;
    }
  }
}
