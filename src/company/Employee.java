import java.util.ArrayList;
import java.util.List;

abstract class Employee {
  private String name;
  private float wage;
  private List<Benefit> benefits;
  private String document;

  Employee(String name, float wage, String document) {
    this.name = name;
    this.wage = wage;
    this.document = document;

    this.benefits = new ArrayList<Benefit>();
  }

  public void addBenefit(Benefit benefit) {
    this.benefits.add(benefit);
  }

  public void removeBenefit(Benefit benefit) {
    this.benefits.remove(benefit);
  }

  public Benefit getBenefitByIndex(int index) {
    return this.benefits.get(index);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }  

  public float getWage() {
    return this.wage;
  }

  public void setWage(float wage) {
    this.wage = wage;
  }

  public String getDocument() {
    return this.document;
  }

  public void setDocument(String document) {
    this.document = document;
  }
}
