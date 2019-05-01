package JavaProject;

public class SingleClubMember extends Member {

  private int club;

  SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {

    super(pMemberType, pMemberID, pName, pFees);
    club = pClub;

  }

  // Setter Method
  public void setClub(int pClub) {
    club = pClub;
  }

  // Getter Method
  public int getClub() {
    return club;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + club;
  }

}
