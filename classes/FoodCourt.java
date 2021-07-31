package classes;
import java.lang.*;
import interfaces.*;
import java.util.*;
public class FoodCourt implements EmployeeOperations, RestaurantOperations{
private Restaurant resturants[]=new Restaurant[50];
private Employee[] employees = new Employee[30];

  public void insertRestaurant(Restaurant r){
    int flag=0;
    for(int i=0;i<resturants.length;i++)
    {

		if (resturants[i]!= null) {
			if (resturants[i].getRid().equals(r.getRid())) {
				System.out.println("Opps! The Restaurant ID already exists!");
				break;
			}
		}

      if(resturants[i]==null)
      {
        resturants[i]=r;
        flag=1;
        break;
      }
    }
    if(flag==1){System.out.println("Resturant insertion Successfully");}
    else{System.out.println("Resturant Can not be inserted");}
  }

	public void removeRestaurant(Restaurant r)
  {
    int flag = 0;
		for(int i=0; i<resturants.length; i++)
		{
			if(resturants[i] == r)
			{
				resturants[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Resturant Removed");}
		else{System.out.println("Resturant can Not be Removed");}
  }
   public Restaurant getRestaurant(String rid){
    Restaurant r = null;
		for(int i=0; i<resturants.length; i++)
		{
			if(resturants[i] != null)
			{
				if(resturants[i].getRid().contains(rid)) {
					r = resturants[i];
					break;
				}
			}
		}
		return r;
  }

  public void showAllRestaurants(){
		for(Restaurant r : resturants){
			if(r!= null)
			{
				System.out.println("**********************************");
				System.out.println("Resturant Name: "+ r.getName());
				System.out.println("Resturant ID: "+ r.getRid());
				System.out.println("----------------------------------");
				r.showAllFoodItems();
				System.out.println("----------------------------------");
				
			}
		}
	}
  //employees code goes here
  public void insertEmployee(Employee e){
		int flag = 0;

		for(int i=0; i<employees.length; i++)
		{
			if (employees[i]!= null) {
				if (employees[i].getId().equals(e.getId())) {
					System.out.println("Opps! The ID already exists!");
					break;
				}
			}

			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Inserted");}
		else{System.out.println("Employee can Not be Inserted");}
	}

  public void removeEmployee(Employee e){
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Employee can Not be Removed");}
	}

  public Employee getEmployee(String empId)
	{
		Employee e = null;

		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}

  public void showAllEmployees(){
		System.out.println("/////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee ID: "+ e.getId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}


}
