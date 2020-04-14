import java.util.*;

class Restaurant {
        String restaurant_name;
        static int total_orders;

        Restaurant() {
                restaurant_name = "";
        }
        
        public void show_menu() {

        }
        public void place_order() {
                System.out.println("Please enter your order from the menu above");
        }
}       

class Order {
        static int order_id;
        static int table_num;
        String     ordered_dish_name;
        int        quantity;
        float      order_bill;
        Dish       ordered_dish;

        Order() {
                ordered_dish_name = "";
                quantity          = 0;
                order_bill        = 0.0f;
        }

        public float calculate_bill() {
                float gst = 0.14f * ordered_dish.get_dish_price();
                order_bill = ordered_dish.get_dish_price() * quantity + gst; 
                return order_bill;       
        }

        public int get_quantity() {
                return quantity;
        }

        public static int get_order_id() {
                return order_id;
        }


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



