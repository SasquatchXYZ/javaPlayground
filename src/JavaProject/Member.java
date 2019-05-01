package JavaProject;

public class Member {

  // Fields
  private char memberType;
  private int memberID;
  private String name;
  private double fees;

  // Constructor
  Member(char pMemberType, int pMemberID, String pName, double pFees) {
    memberType = pMemberType;
    memberID = pMemberID;
    name = pName;
    fees = pFees;
  }

  // Setter Methods
  public void setMemberType(char pMemberType) {
    memberType = pMemberType;
  }

  public void setMemberID(int pMemberID) {
    memberID = pMemberID;
  }

  public void setName(String pName) {
    name = pName;
  }

  public void setFees(double pFees) {
    fees = pFees;
  }

  // Getter Methods
  public char getMemberType() {
    return memberType;
  }

  public int getMemberID() {
    return memberID;
  }

  public String getName() {
    return name;
  }

  public double getFees() {
    return fees;
  }

  @Override
  public String toString() {
    return memberType + ", " + memberID + ", " + name + ", " + fees;
  }

}
