package classes;
import java.lang.*;
import interfaces.*;
public abstract class FoodItem implements IQuantity{
  protected String fid;
  protected String name;
  protected int availableQuantity;
  protected double price;
  //set Item
  public void setFid(String fid)
  {
    this.fid=fid;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public  void setAvailableQuantity(int availableQuantity)
  {
    this.availableQuantity=availableQuantity;
  }
  public void setPrice(double price)
  {
    this.price=price;
  }
  //get Item
  public String getFid()
  {
    return fid;
  }
  public String getName()
  {
    return name;
  }
  public  int getAvailableQuantity()
  {
    return availableQuantity;
  }
  public double getPrice()
  {
    return price;
  }
  //abstract method calling
  public abstract void showInfo();
  public void addQuantity(int amount)
  {
    if(amount>0)
    {
      //previous calculation
      System.out.println("Previous Quantity: "+availableQuantity);
      System.out.println("New adding quantity: "+amount);
      availableQuantity=availableQuantity+amount;
      //new calculation
      System.out.println("Now total Quantity: "+availableQuantity);
      
    }
    else
    {
      System.out.println("Invalid");
    }
    
  }
  public void sellQuantity(int amount)
  {
    if(amount>0&&amount<=availableQuantity)
    {
      System.out.println("Selling Amount :"+amount);
      //now available calculation
      availableQuantity=availableQuantity-amount;
      System.out.println("Now available Quantity: "+availableQuantity);
    }
  }
  
}