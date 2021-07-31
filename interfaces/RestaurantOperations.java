package interfaces;

import java.lang.*;
import classes.*;
public interface RestaurantOperations{
 void insertRestaurant(Restaurant r);
 void removeRestaurant(Restaurant r);
 Restaurant getRestaurant(String rid);
 void showAllRestaurants();
}
