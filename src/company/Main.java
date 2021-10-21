public class Main {
  public static void main(String[] args) {
    PJ pj = new PJ("Wemerson", 3000, "74.374.010/0001-23");
    PF pf = new PF("Rafael", 2000, "845.052.870-41");

    Company company = new Company("Mambee");
    company.addEmployee(pj);
    company.addEmployee(pf);

    System.out.println(company.getEmployeeByIndex(0));
  }
}
