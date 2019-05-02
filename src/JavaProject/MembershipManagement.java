package JavaProject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {

  final private Scanner reader = new Scanner(System.in);

  private int getIntInput() {
    int choice = 0;

    while (choice == 0) {
      try {
        // Code to try reading an integer from the user
        choice = reader.nextInt();

        if (choice == 0) {
          throw new InputMismatchException();
        }

        reader.nextLine();
      } catch (InputMismatchException e) {
        // Code to prompt the user to enter a new value
        reader.nextLine();
        System.out.println("\nERROR: INVALID INPUT.  Please try again: ");
      }
    }
    return choice;
  }

  private void printClubOptions() {
    System.out.println("\n1) Club Mercury");
    System.out.println("2) Club Neptune");
    System.out.println("3) Club Jupiter");
    System.out.println("4) Multi Clubs");
  }

  public int getChoice() {
    int choice;

    System.out.println("\nWELCOME TO OZONE FITNESS CENTER");
    System.out.println("================================");
    System.out.println("1) Add Member");
    System.out.println("2) Remove Member");
    System.out.println("3) Display Member Information");
    System.out.println("\n\nPlease select an option (or Enter -1 to quit");

    choice = getIntInput();

    return choice;
  }

  public String addMembers(LinkedList<Member> m) {
    String name;
    int club;
    String mem;
    double fees;
    int memberID;
    Member mbr;
    Calculator<Integer> cal;

    System.out.println("Please Enter the Member's Name: ");
    name = reader.nextLine();

    printClubOptions();
    System.out.println("\nPlease enter the member's clubID");

    club = getIntInput();

    while (club < 1 || club > 4) {
      System.out.println("\nInvalid Club ID.  Please try again: ");
      club = getIntInput();
    }

    if (m.size() > 0) {
      memberID = m.getLast().getMemberID()
    } else {
      memberID = 1;
    }

    if (club != 4) {
      cal = (n) -> {
        switch (n) {
          case 1:
            return 900;
          case 2:
            return 950;
          case 3:
            return 1000;
          default:
            return -1;
        }
      }
    }
  }

}
