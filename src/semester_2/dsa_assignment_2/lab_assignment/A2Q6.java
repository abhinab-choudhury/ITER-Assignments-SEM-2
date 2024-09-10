package semester_2.dsa_assignment_2.lab_assignment;

abstract class Marks {
  int markICP, markDSA;
  double percentage;

  abstract void getPercentage();
}

class CSE extends Marks {
  int algoDesign;

  CSE(int markDSA, int markICP, int algoDesign) {
    this.markDSA = markDSA;
    this.markICP = markICP;
    this.algoDesign = algoDesign;
  }

  public void getPercentage() {
    this.percentage = ((this.markDSA * 1.00 + this.markICP + this.algoDesign) / 300) * 100;
    System.out.println("Percentage(CSE) : " + this.percentage);
  }
}

class NonCSE extends Marks {
  int enggMechanics;

  NonCSE(int markDSA, int markICP, int enggMechanics) {
    this.markDSA = markDSA;
    this.markICP = markICP;
    this.enggMechanics = enggMechanics;
  }

  public void getPercentage() {
    this.percentage = ((this.markDSA * 1.00 + this.markICP + this.enggMechanics) / 300) * 100;
    System.out.println("Percentage(CSE) : " + this.percentage);
  }
}

public class A2Q6 {
  public static void main(String[] args) {
    CSE student_CSE = new CSE(98, 95, 99);
    student_CSE.getPercentage();
    NonCSE student_NonCSE = new NonCSE(89, 88, 90);
    student_NonCSE.getPercentage();
  }
}
