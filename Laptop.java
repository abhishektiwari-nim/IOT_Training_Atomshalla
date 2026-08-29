class Laptop {
    String brand;
    String model;
    int ram;
    int storage;
    int graphic;

    void start() {
     
	System.out.println(brand + "turned on");
    }

    public static void main(String[] args) {
        Laptop L1 = new Laptop();
	L1.brand = "ASUS";
        L1.model = "Vivobook";
        L1.ram = 8;
        L1.storage = 1;
        L1.graphic = 4;
	System.out.println("Brand: " + L1.brand);
        System.out.println("Model: " + L1.model);
        System.out.println("RAM: " + L1.ram + " GB");
        System.out.println("Storage: " + L1.storage + " TB");
        System.out.println("Graphic: " + L1.graphic + " GB");

        L1.start(); 

        Laptop L2 = new Laptop();
	L2.brand = "HP";
        L2.model = "Victus";
        L2.ram = 16;
        L2.storage = 512;
        L2.graphic = 6;
	System.out.println("\nBrand: " + L2.brand);
        System.out.println("Model: " + L2.model);
        System.out.println("RAM: " + L2.ram + " GB");
        System.out.println("Storage: " + L2.storage + " GB");
        System.out.println("Graphic: " + L2.graphic + " GB");
	L2.start();
}
}