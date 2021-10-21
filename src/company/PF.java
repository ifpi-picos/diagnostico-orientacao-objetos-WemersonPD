public class PF extends Employee {
  PF(String name, float wage, String document) {
    super(name, wage, document);

    Benefit plan = new Benefit("Plano de Saúde");
    Benefit vr = new Benefit("Vr");
    Benefit travel = new Benefit("Ferias");

    super.addBenefit(plan);
    super.addBenefit(vr);
    super.addBenefit(travel);
  }

  public double getCorrectWage() {
    float wageWithoutAjust = super.getWage();
    double percentage = wageWithoutAjust * 0.1;

    return wageWithoutAjust - percentage;
  }
}
