package classes;
import java.lang.*;
import interfaces.*;
public class Restaurant implements FoodItemOperations{
    private String name;
	private String rid;
	private FoodItem fooditem[] = new FoodItem [10];

  //set get starts here
    public void setName(String name){this.name = name;}
	public void setRid(String rid){this.rid = rid;}

	public String getName(){
    	return name;
    }

	public String getRid(){
    	return rid;
    }
  //set get ends here

  //interface coding starts here
  public void insertFoodItem(FoodItem f){
    int flag = 0;
		for(int i=0; i<fooditem.length; i++){

			if (fooditem[i]!= null) {
				if (fooditem[i].getFid().equals(f.getFid())) {
					System.out.println("Opps! The Food ID already exists!");
					break;
				}
			}

			if(fooditem[i] == null){
				fooditem[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food Dish Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}

  }

  public void removeFoodItem(FoodItem f){
    int flag = 0;
		for(int i=0; i<fooditem.length; i++){
			if(fooditem[i] == f){
				fooditem[i] = null;
				flag = 1;
				//System.out.println("flagging");
				break;
      }
    }
    if(flag == 1){
      System.out.println("Food Dish has been Removed");
    }
		else{
      System.out.println("Can Not Remove");
    }
  }

  public FoodItem getFoodItem(String fid){
		FoodItem f = null;
		for(int i=0; i<fooditem.length; i++){
			if(fooditem[i] != null){
				if(fooditem[i].getFid().contains(fid) ){
					f = fooditem[i];
					break;
				}
			}
		}
		return f;
	}

  public void showAllFoodItems(){
    for(FoodItem f : fooditem){
			if(f != null){
				f.showInfo();
			}
		}
  }
//interface ends here
}
