package JavaProject;

public class MultiClubMember extends Member {

  private int membershipPoints;

  MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints) {

    super(pMemberType, pMemberID, pName, pFees);
    membershipPoints = pMembershipPoints;

  }

  // Setter Method
  public void setMembershipPoints(int pMembershipPoints) {
    membershipPoints = pMembershipPoints;
  }

  // Getter Method
  public int getMembershipPoints() {
    return membershipPoints;
  }

  public String toString() {
    return super.toString() + ", " + membershipPoints;
  }

}
