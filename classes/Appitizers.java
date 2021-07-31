package classes;
import java.lang.*;

public class Appitizers extends FoodItem
{
  private String size;
  public void setSize(String size)
  {
    this.size=size;
  }
  public String getSize()
  {
    return size;
  }
  public  void showInfo()
  {
    System.out.println("Appitizers ID: "+getFid());
		System.out.println("Appitizers Name: "+getName());
		System.out.println("Appitizers size: "+getSize());
		System.out.println("Available Quantity: "+getAvailableQuantity());
		System.out.println("Price: "+getPrice());
    System.out.println();
	}
}
