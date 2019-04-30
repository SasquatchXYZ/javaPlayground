package AnotherPackage;

import ModifierDemo.ModifierDemo;

public class ClassesInAnotherPackage {

  // Just an Empty Class
}

class ClassC extends ModifierDemo {

  public void printMessages() {

    // This is ok
    System.out.println(publicNum);

    // This is ok
    System.out.println(protectedNum);

    // This is NOT ok
    System.out.println(packagePrivateNum);

    // This is NOT ok
    System.out.println(privateNum);
  }
}

class ClassD {

  public void printMessages() {

    ModifierDemo p = new ModifierDemo();

    // This is ok
    System.out.println(p.publicNum);

    // This is NOT ok
    System.out.println(p.protectedNum);

    // This is NOT ok
    System.out.println(p.packagePrivateNum);

    // This is NOT ok
    System.out.println(p.privateNum);
  }
}