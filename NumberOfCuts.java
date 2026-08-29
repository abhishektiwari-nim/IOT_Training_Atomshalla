class NumberOfCuts {

    public static int numberOfCuts(int n) {

        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return n / 2;
        }

        return n;
    }

    public static void main(String[] args) {

        System.out.println(numberOfCuts(1));
        System.out.println(numberOfCuts(4));
        System.out.println(numberOfCuts(3));
        System.out.println(numberOfCuts(6));
    }
}