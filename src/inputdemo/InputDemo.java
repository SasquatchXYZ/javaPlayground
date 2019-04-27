package inputdemo;

import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int myInt = input.nextInt();
    System.out.printf("You entered %d.%n%n", myInt);

    System.out.print("Enter a double: ");
    double myDouble = input.nextDouble();
    System.out.printf("You entered %.2f.%n%n", myDouble);

    input.nextLine();
    System.out.print("Enter a string: ");
    String myString = input.nextLine();
    System.out.printf("You Entered \"%s\".%n%n", myString);

  }
}