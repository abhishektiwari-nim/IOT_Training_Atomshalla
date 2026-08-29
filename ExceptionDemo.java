class ExceptionDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception handled");
        }

        System.out.println("Program ends...");
    }
}