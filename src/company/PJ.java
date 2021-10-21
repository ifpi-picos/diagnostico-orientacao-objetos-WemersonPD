public class PJ extends Employee {
  PJ(String name, float wage, String document) {
    super(name, wage, document);

    Benefit plan = new Benefit("Plano de Saúde");

    super.addBenefit(plan);
  }

  public double getCorrectWage() {
    float wageWithoutAjust = super.getWage();
    double percentage = wageWithoutAjust * 0.05;

    return wageWithoutAjust - percentage;
  }
}
