import java.util.*;
class FoodItem {
    String name;
    double price;
    int quantity;

    FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
}

    void bill() {
        double total = price * quantity;
        double discount = total * 0.10;
	System.out.println("Item: " + name);
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + (total - discount));
}
}

class CheesePizza extends FoodItem {
    CheesePizza(int q) {
        super("Cheese Pizza", 200, q);
}
}

class VegPizza extends FoodItem {
    VegPizza(int q) {
        super("Veg Pizza", 150, q);
}
}

class CheeseBurger extends FoodItem {
    CheeseBurger(int q) {
        super("Cheese Burger", 120, q);
}
}

class VegBurger extends FoodItem {
    VegBurger(int q) {
        super("Veg Burger", 100, q);
}
}

class ChickenBiryani extends FoodItem {
    ChickenBiryani(int q) {
        super("Chicken Biryani", 250, q);
}
}

class VegBiryani extends FoodItem {
    VegBiryani(int q) {
        super("Veg Biryani", 180, q);
}
}

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1. Cheese Pizza");
        System.out.println("2. Veg Pizza");
        System.out.println("3. Cheese Burger");
        System.out.println("4. Veg Burger");
        System.out.println("5. Chicken Biryani");
        System.out.println("6. Veg Biryani");
	System.out.print("Choice: ");
        int choice = sc.nextInt();
	System.out.print("Quantity: ");
        int q = sc.nextInt();
	FoodItem food;
	switch(choice) {
            case 1: food = new CheesePizza(q); break;
            case 2: food = new VegPizza(q); break;
            case 3: food = new CheeseBurger(q); break;
            case 4: food = new VegBurger(q); break;
            case 5: food = new ChickenBiryani(q); break;
            case 6: food = new VegBiryani(q); break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        food.bill();
    }
}