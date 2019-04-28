package StaticDemo;

public class StaticDemo {

  public static void main(String[] ars) {

    MyClass sd = new MyClass();

    System.out.println(sd.message);
    sd.displayMessage();

    System.out.println(MyClass.greetings);
    MyClass.displayGreetings();
  }
}