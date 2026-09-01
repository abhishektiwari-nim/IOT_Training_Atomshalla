import java.util.ArrayList;

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class Tesla {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Car s1 = new Car("Tesla S1");
        Car s2 = new Car("Tesla S2");
        Car s3 = new Car("Tesla S3");

        cars.add(s1);
        cars.add(s2);
        cars.add(s3);

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).display();
        }
    }
}