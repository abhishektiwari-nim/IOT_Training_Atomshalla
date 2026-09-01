import java.util.ArrayList;

public class CarStore {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Toyota");

        System.out.println("Cars in Store:");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}