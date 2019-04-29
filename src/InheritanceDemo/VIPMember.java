package InheritanceDemo;

public class VIPMember extends Member {

  // Constructor
  public VIPMember(String pName, int pMemberID, int pMemberSince) {
    super(pName, pMemberID, pMemberSince);

    System.out.println("Child Constructor with 3 Parameters");
  }

  // Overridden Method from Member Class
  @Override
  public void calculateAnnualFee() {
    annualFee = (1 - 0.01 * getDiscount()) * 1200;
  }
}
