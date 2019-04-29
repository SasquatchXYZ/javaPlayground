package InheritanceDemo;

public class NormalMember extends Member {

  // Constructors
  public NormalMember() {
    System.out.println("Child Constructor with No Parameters");
  }

  public NormalMember(String pName, int pMemberID, int pMemberSince) {

    super(pName, pMemberID, pMemberSince);

    System.out.println("Child Constructor with 3 Parameters");
  }

  // Overriding Parent Method
  @Override
  public void calculateAnnualFee() {
    annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 30);
  }
}
