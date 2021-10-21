import java.util.ArrayList;
import java.util.List;

class Company {
  private String name;
  private List<Employee> employees;
  
  Company(String name) {
    this.name = name;
    this.employees = new ArrayList<Employee>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addEmployee(Employee employee) {
    this.employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    this.employees.remove(employee);
  }

  public Employee getEmployeeByIndex(int index) {
    return this.employees.get(index);
  }

}
