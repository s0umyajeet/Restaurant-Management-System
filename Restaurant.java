import java.util.*;

class Restaurant {
        String restaurant_name;
        float bill;
        static int total_orders;

        Restauran() {
                restaurant_name = "";
                bill = 0;
        }
        public float calculate_bill() {
                
        }

        public void take_order() {

        }
}       

class Order {
        static int order_id;
        static int table_num;
        String     ordered_dish;
        int        quantity;
        


}
class Dish {
        String name;
        float  price;
        String type;

        //Constructor
        Dish() {
                name = "";
                price = 0.0f;
                type = "default";
        }

        public float get_dish_price() {
                return this.price;
        }

        public String get_dish_name() {
                return this.name;
        }

        public String get_dish_type() {
                return this.type;
        }

}
