import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import file.*;
import java.io.IOException;


public class Start{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		FoodCourt b = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		boolean choice = true;

		while(choice){
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant Food Item Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");

			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			clear();

			switch(option){
				case 1:

					System.out.println("\n--------------------\n");
					System.out.println("Employee Management \n");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
                    System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					clear();

					switch(input1)
					{
						case 1:

							System.out.println("\n--------------------\n");
							System.out.println("Insert New Employee");

							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();

							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();

							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							clear();

							Employee e1 = new Employee();
							e1.setId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);


							b.insertEmployee(e1);

							System.out.println("\n--------------------\n");
							
							break;

						case 2:

                            System.out.println("\n--------------------\n");
                            System.out.println("Remove Existing Employee");

                            System.out.print("Enter Employee ID: ");
                            String empId3 = sc.next();
							clear();

                            Employee e3 = b.getEmployee(empId3);

                            if(e3==null){
                            	System.out.println("ID Not Found!");
                            	break;
							}

                            b.removeEmployee(e3);

                            

                            System.out.println("\n----------------------\n");
							
                            break;

						case 3:

                            System.out.println("\n--------------------\n");
                            System.out.println("Show All Employees");

                            b.showAllEmployees();
                            System.out.println("\n--------------------\n");
							
                            break;

						case 4:

                            System.out.println("\n--------------------\n");
                            System.out.println("Search An Employee");

                            System.out.print("Enter Employee ID: ");
                            String empId2 = sc.next();
							clear();

                            Employee e2 = b.getEmployee(empId2);

                            if(e2 !=null)
                            {
                                System.out.println("Employee ID: "+e2.getId());
                                System.out.println("Employee Name: "+e2.getName());
                                System.out.println("Employee Salary: "+e2.getSalary());
                            }
                            else
                            {
                                System.out.println("Employee Does Not Exists");
                            }
                            System.out.println("\n--------------------\n");
                            break;

						case 5:

							System.out.println("\n--------------------\n");
							System.out.println("Go Back");
							System.out.println("\n--------------------\n");
							break;

						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("\n-------------------------\n");
					break;

				


                case 2:

                    System.out.println("********************");
                    System.out.println("Restaurant Management \n");
                    System.out.println("What do you want to do?\n");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Insert New Restaurant");
                    System.out.println("2. Remove Existing Restaurant");
                    System.out.println("3. Show All Restaurants");
                    System.out.println("4. Search a Restaurant1");
                    System.out.println("5. Go Back");
                    System.out.println("--------------------------------------\n");
                    System.out.print("Enter your option: ");
                    int input2 = sc.nextInt();
					clear();

                    switch(input2)
                    {
                        case 1:

                            System.out.println("\n----------------------\n");
                            System.out.println("Insert New Restaurant");
							System.out.println("\n----------------------\n");

                            System.out.print("Enter Restaurant ID: ");
                            String nid1 = sc.next();

                            System.out.print("Enter Restaurant Name: ");
                            String name1 = sc.next();
							clear();

                            Restaurant r1 = new Restaurant();
                            r1.setRid(nid1);
                            r1.setName(name1);

                            b.insertRestaurant(r1);

                            System.out.println("\n----------------------\n");
                            break;

                        case 2:
                            System.out.println("\n----------------------\n");
                            System.out.println("Remove Existing Restaurant");
							System.out.println("\n----------------------\n");

                            System.out.print("Enter Restaurant ID: ");
                            String nid3 = sc.next();
							clear();

                            Restaurant c3 = b.getRestaurant(nid3);

							if(c3==null){
								System.out.println("Restaurant Not Found!");
								break;
							}

                            b.removeRestaurant(c3);

                         

                            System.out.println("\n----------------------\n");
                            break;

                        case 3:
                            System.out.println("\n----------------------\n");
                            System.out.println("Show All Restaurants");
							System.out.println("\n----------------------\n");

                            b.showAllRestaurants();
                           
                            break;

                        case 4:

                        System.out.println("\n----------------------\n");
                        System.out.println("Search A Restaurant");
						System.out.println("\n----------------------\n");

                        System.out.print("Enter Restaurant ID: ");
                        String nid4 = sc.next();
						clear();
                        Restaurant c4 = b.getRestaurant(nid4);
                 
                        if(c4 !=null)
                        {
                            System.out.println("Restaurant ID: "+c4.getRid());
                            System.out.println("Restaurant Name: "+c4.getName());
                        }
                        else
                        {
                            System.out.println("Restaurant Does Not Exist");
                        }
                        System.out.println("\n----------------------\n");
                        break;

                        case 5:

                            System.out.println("#####################");
                            System.out.println("Go Back");
                            System.out.println("#####################");
                            break;


                        default:
                            System.out.println("#####################");
                            System.out.println("Invalid Choice");
                            System.out.println("#####################");
                            break;
                    }
                    System.out.println("\n----------------------\n");
                    break;

                  
				case 3:

					System.out.println("\n----------------------\n");
					System.out.println("Restaurant FoodItem Management \n");
					System.out.println("\n----------------------\n");

					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Food Item");
                    System.out.println("2. Remove Existing Food Item");
                    System.out.println("3. Show All Food Items");
					System.out.println("4. Search a Food Item");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					clear();

					switch(input3)
					{
						case 1:

							System.out.println("\n----------------------\n");
							System.out.println("Insert New FoodItem\n");
							System.out.println("\n----------------------\n");

							System.out.println("Which Type of FoodItem Do you Want to Create?");
							System.out.println("1. Main Dish");
							System.out.println("2. Appetizers");
							System.out.println("3. Go Back");

							System.out.print("Your Type: ");
							int type = sc.nextInt();
							clear();

							FoodItem a = null;

							if(type == 1)
							{
								System.out.print("Enter Dish Number: ");
								String an1 = sc.next();
								System.out.print("Enter Dish Name: ");
								String nameItem = sc.next();
								System.out.print("Enter Available Quantity: ");
								int ir1 = sc.nextInt();
								System.out.print("Enter Dish Category: ");
								String dishType = sc.next();
								System.out.print("Enter Dish Price: ");
								double dishPrice = sc.nextDouble();
								clear();

								MainDish sa = new MainDish();

								sa.setFid(an1);
								sa.setName(nameItem);
								sa.setAvailableQuantity(ir1);
								sa.setCategory(dishType);
								sa.setPrice(dishPrice);

								a = sa;
							}
							else if(type == 2)
							{
								System.out.print("Enter Appetizer Number: ");
								String appetizerNumber = sc.next();
								System.out.print("Enter Appetizer Name: ");
								String appetizerName = sc.next();
								System.out.print("Enter Available Quantity: ");
								int appetizerQuantity = sc.nextInt();
								System.out.print("Enter Appetizer Size: ");
								String appetizerSize = sc.next();
								System.out.print("Enter Appetizer Price: ");
								double appetizerPrice = sc.nextDouble();
								clear();

								Appitizers appitizerObj = new Appitizers();

								appitizerObj.setFid(appetizerNumber);
								appitizerObj.setName(appetizerName);
								appitizerObj.setAvailableQuantity(appetizerQuantity);
								appitizerObj.setSize(appetizerSize);
								appitizerObj.setPrice(appetizerPrice);

								a = appitizerObj;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}


							if(a != null)
							{
								try {
									System.out.print("Enter Restaurant ID: ");
									String rid1 = sc.next();

									b.getRestaurant(rid1).insertFoodItem(a);

								
								}
								catch (NullPointerException insertRestFood){
									insertRestFood.printStackTrace();
									System.out.println("Opps! Restaurant ID Not Found!");
								}
							}

							System.out.println("\n----------------------\n");
							break;

						case 2:

							try {

								System.out.println("\n----------------------\n");
								System.out.println("Remove a Food Item of a Restaurant");
								System.out.println("\n----------------------\n");

								System.out.print("Enter Restaurant ID: ");
								String rid3 = sc.next();
								System.out.print("Enter Food Item Number: ");
								String foodItemNumber3 = sc.next();
								clear();

								

								Restaurant cc = b.getRestaurant(rid3);
								FoodItem aa = cc.getFoodItem(foodItemNumber3);

								if (aa == null) {
									System.out.println("Food Item ID Not Found!");
									break;
								}
								cc.removeFoodItem(aa);
							}
							catch (NullPointerException nn){
								nn.printStackTrace();
							}

                            System.out.println("\n----------------------\n");
                            break;

						case 3:
                            System.out.println("\n----------------------\n");
                            System.out.println("Show All Food Items of a Restaurant");
							System.out.println("\n----------------------\n");
                            System.out.print("Enter Restaurant ID: ");
                            String rid4 = sc.next();
							clear();

                            b.getRestaurant(rid4).showAllFoodItems();

                            System.out.println("\n----------------------\n");
                            break;

						case 4:

                            System.out.println("\n----------------------\n");
                            System.out.println("Search a Food Item");
							System.out.println("\n----------------------\n");

                            System.out.print("Enter Restaurant ID: ");
                            String rid2 = sc.next();
                            System.out.print("Enter Food Item Number: ");
                            String foodNumber = sc.next();


                            FoodItem foodSearchObj = b.getRestaurant(rid2).getFoodItem(foodNumber);

							

                            if(foodSearchObj != null)
                            {
                                foodSearchObj.showInfo();
                            }

                            System.out.println("\n----------------------\n");
                            break;

						case 5:

							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;

						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;

					}

					System.out.println("\n----------------------\n");
					break;

				

				case 4:

					System.out.println("\n----------------------\n");
					System.out.println("Product Quantity Add/Sell Management \n");
					System.out.println("\n----------------------\n");


					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add Product Quantity");
					System.out.println("2. Sell Product Quantity");
					System.out.println("3. Show Add/Sell History");
					System.out.println("4. Go Back");
					System.out.println("--------------------------------------\n");

					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					clear();

					switch(input4)
					{
						case 1:

							System.out.println("\n----------------------\n");
							System.out.println("Add Product\n");
							System.out.println("\n----------------------\n");

							System.out.print("Enter Restaurant ID: ");
							String nid1 = sc.next();
							System.out.print("Enter Food Item Number: ");
							String an1 = sc.next();
							System.out.print("Enter Add Quantity: ");
							int amount1 = sc.nextInt();
							clear();

							if(amount1>0)
							{
								try {
									b.getRestaurant(nid1).getFoodItem(an1).addQuantity(amount1);
				
									frwd.writeInFile("Quantity Added : " + amount1 + " in Food Item ID: " + an1);
								}
								catch (NullPointerException fileioexp1){
									fileioexp1.printStackTrace();
									
									if(b.getRestaurant(nid1)==null){
										System.out.println("Restaurant ID Not Found!");
									}else{
										System.out.println("Food Item ID Not Found!");
									}
								}
							}

							System.out.println("\n----------------------\n");
							break;

						case 2:

							System.out.println("\n----------------------\n");
							System.out.println("Sell Product");
							System.out.println("\n----------------------\n");

							System.out.print("Enter Restaurant ID: ");
							String nid2 = sc.next();
							System.out.print("Enter Food Item Number: ");
							String an2 = sc.next();
							System.out.print("Enter Sell Quantity: ");
							int amount2 = sc.nextInt();
							clear();

							try {
								if (amount2 > 0 && amount2 <= b.getRestaurant(nid2).getFoodItem(an2).getAvailableQuantity()) {

									b.getRestaurant(nid2).getFoodItem(an2).sellQuantity(amount2);


									frwd.writeInFile("Quantity Sold	: " + amount2 + " from Food Item ID: " + an2);
								}
							}
							catch (NullPointerException fileioexp2){
									fileioexp2.printStackTrace();

									if(b.getRestaurant(nid2)==null){
										System.out.println("Restaurant ID Not Found!");
									}else{
										System.out.println("Food Item ID Not Found!");
									}

								}

							System.out.println("\n----------------------\n");
							break;


						case 3:

							System.out.println("\n----------------------\n");
							System.out.println("Show Add/Sell History");
							frwd.readFromFile();

							System.out.println("\n----------------------\n");
							break;

						case 4:

							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;

						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}

					System.out.println("\n----------------------\n");
					break;

				case 5:

					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;

					default:
					System.out.println("Invalid");
					break;
        }
      }

	}
	
	
	public static void clear()
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
       
    }
}
