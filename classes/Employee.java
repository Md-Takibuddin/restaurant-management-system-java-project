package classes;
import java.lang.*;
public class Employee
{
  private String name;
  private String id;
  private double salary;
public  void setName(String name)
  {
    this.name=name;
  }
  public void setId(String id)
  {
    this.id=id;
  }
  public void setSalary(double salary)
  {
    this.salary=salary;
  }
  public String getName()
  {
    return name;
  }
  public String getId(){
    return id;
  }
  public  double getSalary()
  {
    return salary;
  }

}