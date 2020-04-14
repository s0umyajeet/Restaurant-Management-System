import java.util.*;

class Restaurant {
        String            restaurant_name;
        static int        total_orders;
        static int        total_dish_count;
        static int        total_tables;
        //static Restaurant restaurant;
        Dish              available_dishes[];

        Restaurant() {
                restaurant_name   = "";
                total_dish_count  = 10;
                total_tables      = 10;
        }
        
        public void initial_setup(Restaurant restaurant) {
                System.out.println("");
                System.out.println("\t\t------------------------------------------------------------");
                System.out.println("\t\t          Welcome to Restaurant Management System           ");
                System.out.println("\t\t------------------------------------------------------------");
                System.out.println("");
                System.out.println("\t\tMENU:");
                System.out.println("");
                System.out.println("\t\t1. Show dishes menu");
                System.out.println("\t\t2. Place an order");
                System.out.println("\t\t3. Cancel order");
                System.out.println("\t\t4. Show bill");
                System.out.println("\t\t5. Exit");
                System.out.println("");
                System.out.println("Enter your choice (1 to 5): ");

                int choice;
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                switch(choice) {
                        case 1: restaurant.show_menu(restaurant);
                                break;
                        case 2: restaurant.place_order(restaurant);
                                break;
                        case 3: restaurant.cancel_order(restaurant);
                                break;
                        case 4: restaurant.cancel_order(restaurant);
                                break;
                        case 5: restaurant.exit();
                }
        }

        public void show_menu(Restaurant restaurant) {
                System.out.println("\t\t------------------- Menu -----------------");
                System.out.println("\t\t  Dishes\t\t\tPrice");
                System.out.println("\t\t------------------------------------------");
                System.out.println("\t\t  Starters: ");
                System.out.println("\t\t  1. Sandwich\t\t\t100");
                System.out.println("\t\t  2. Burger\t\t\t200");
                System.out.println("\t\t  3. Pasta\t\t\t300");
                System.out.println("\t\t  4. Noodles\t\t\t400");
                System.out.println("");
                System.out.println("\t\t  Main Course: ");
                System.out.println("\t\t  5. Paneer1\t\t\t500");
                System.out.println("\t\t  6. Paneer2\t\t\t600");
                System.out.println("\t\t  7. Paneer3\t\t\t700");
                System.out.println("\t\t  8. Paneer69\t\t\t800");
                System.out.println("\t\t     (Really Spice ;) ...)");
                System.out.println("");
                System.out.println("\t\t  Desserts: ");
                System.out.println("\t\t  9. Sweet1\t\t\t900");
                System.out.println("\t\t  10. Sweet2\t\t\t1000");
                System.out.println("\t\t  11. Sweet3\t\t\t1200");
                System.out.println("\t\t  12. Sweet16\t\t\t1600");
                System.out.println("\t\t     (Really Sweet ;) ...)");
                System.out.println("\n");
                System.out.println("\t\tPress any key to go back....");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                restaurant.initial_setup(restaurant);
        }
        public void cancel_order(Restaurant restaurant) {

        }
        public void place_order(Restaurant restaurant) {
                System.out.println("\t\tPlease enter your order from the menu below");
                System.out.println("");
                System.out.println("\t\t------------------- Menu -----------------");
                System.out.println("\t\t  Dishes\t\t\tPrice");
                System.out.println("\t\t------------------------------------------");
                System.out.println("\t\t  Starters: ");
                System.out.println("\t\t  1. Sandwich\t\t\t100");
                System.out.println("\t\t  2. Burger\t\t\t200");
                System.out.println("\t\t  3. Pasta\t\t\t300");
                System.out.println("\t\t  4. Noodles\t\t\t400");
                System.out.println("");
                System.out.println("\t\t  Main Course: ");
                System.out.println("\t\t  5. Paneer1\t\t\t500");
                System.out.println("\t\t  6. Paneer2\t\t\t600");
                System.out.println("\t\t  7. Paneer3\t\t\t700");
                System.out.println("\t\t  8. Paneer69\t\t\t800");
                System.out.println("\t\t     (Really Spice ;) ...)");
                System.out.println("");
                System.out.println("\t\t  Desserts: ");
                System.out.println("\t\t  9. Sweet1\t\t\t900");
                System.out.println("\t\t  10. Sweet2\t\t\t1000");
                System.out.println("\t\t  11. Sweet3\t\t\t1200");
                System.out.println("\t\t  12. Sweet16\t\t\t1600");
                System.out.println("\t\t     (Really Sweet ;) ...)");
                System.out.println("\n");
        
                Order order = new Order();
                order.order_id++;
                Scanner sc = new Scanner(System.in);
                System.out.println("\t\tEnter your choice as index number of dish: ");                
                order.dish_choice = sc.nextInt();
                System.out.println("\t\tEnter quantity: ");
                order.quantity = sc.nextInt();
                
        }

        public void exit() {
                System.out.println("");
                System.out.println("Thank you for using Restaurant management system....");
                System.out.println("Now exiting....");
                System.out.println("");
        }
        public static void main(String []args) {
                Restaurant restaurant = new Restaurant();
                restaurant.initial_setup(restaurant);
        }
}       

class Order {
        static int order_id = 0;
        static int table_num;
        int        dish_choice;
        int        quantity;
        float      order_bill;
        int        dish_id;
        float      dish_price;
        String     dish_type; 
        String     dish_name;
        
        Order() {
                dish_choice  = 0;
                quantity     = 0;
                order_bill   = 0.0f;
        }

        public float calculate_bill() {
                float gst = 0.14f * dish_price;
                order_bill =dish_price * quantity + gst; 
                return order_bill;       
        }

        public int get_quantity() {
                return quantity;
        }

        public static int get_order_id() {
                return order_id;
        }
        
        public String get_dish_name() {
                return this.dish_name;
        }

        public String get_dish_type() {
                return this.dish_type;
        }
}