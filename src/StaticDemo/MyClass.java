package StaticDemo;

class MyClass {

  // Non Static field and method
  public String message = "Hello World";

  public void displayMessage() {
    System.out.println("Message = " + message);
  }

  // Static Field and Method
  public static String greetings = "Good Morning";

  public static void displayGreetings() {
    System.out.println("Greeting = " + greetings);
  }
}