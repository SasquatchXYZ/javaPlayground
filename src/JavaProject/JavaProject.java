package JavaProject;

import java.util.LinkedList;

public class JavaProject {

  public static void main(String[] args) {

    String mem;

    MembershipManagement mm = new MembershipManagement();
    FileHandler fh = new FileHandler();

    LinkedList<Member> members = fh.readFile();
    int choice = mm.getChoice();
  }

}
