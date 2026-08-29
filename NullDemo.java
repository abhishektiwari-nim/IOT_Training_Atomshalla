class NullDemo {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("Null Pointer Exception handled");
        }

        System.out.println("Program ends");
    }
}