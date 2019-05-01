package GenericsDemo;

public class GenericsDemo {

  public static void main(String[] args) {

//    MyGenericsClass g = new MyGenericsClass();
    MyGenericsClass<Integer> g = new MyGenericsClass();

    g.setMyVar(6);
//    g.setMyVar(6.1);
//    g.setMyVar("Java");
    g.printValue();

  }

}

// ---------------------------------------------------------------------------------------------------------------------
// Original
/*
class MyGenericsClass {

  private Integer myVar;

  void setMyVar(Integer i) {
    myVar = i;
  }

  void printValue() {
    System.out.println("The value of myVar is " + myVar);
  }

}*/

// Using Type Parameter
class MyGenericsClass<T> {

  private T myVar;

  void setMyVar(T i) {
    myVar = i;
  }

  void printValue() {
    System.out.println("The value of myVar is " + myVar);
  }

}