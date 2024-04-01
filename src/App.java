/**
 * This is a simple java program to print "Hello, World!" to the console.
 */
class Test {

  int a;
  int b;

  public Test() {
    a = 10;
    b = 20;
  }

  public void print() {
    System.out.println("is it going to be runn");
  }
}

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("args are" + args[0]);
    Test test = new Test();
    test.print();
  }
}
