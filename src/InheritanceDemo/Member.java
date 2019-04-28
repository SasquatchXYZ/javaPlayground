package InheritanceDemo;

import java.util.Scanner;

public class Member {

  // Fields
  public String welcome = "Welcome to ABC Fitness";
  protected double annualFee;
  private String name;
  private int memberID;
  private int memberSince;
  private int discount;

  // Constructors
  public Member() {

    System.out.println("Parent Constructor with no parameters");
  }

  public Member(String pName, int pMemberID, int pMemberSince) {

    System.out.println("Parent Constructor with 3 Parameters");

    name = pName;
    memberID = pMemberID;
    memberSince = pMemberSince;
  }

  // Getter Method
  public double getDiscount() {
    return discount;
  }

  // Setter Method
  public void setDiscount() {

    Scanner input = new Scanner(System.in);
    String password;

    System.out.println("Please enter the admin password: ");

    password = input.nextLine();

    if (!password.equals("abcd")) {
      System.out.println("Invalid Password: You do not have authority to edit the discount");
    } else {
      System.out.print("Please Enter the Discount: ");
      discount = input.nextInt();
    }
  }

  // Methods
  public void displayMemInfo() {
    System.out.println("Member Name: " + name);
    System.out.println("Member ID: " + memberID);
    System.out.println("Member Since " + memberSince);
    System.out.println("Annual Fee: " + annualFee);
  }

  public void calculateAnnualFee() {
    annualFee = 0;
  }

}
