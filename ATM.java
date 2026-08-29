import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rPin = 2222;
        int attempts = 0;

        while (attempts < 4) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == rPin) {
                System.out.println("Welcome To ATM");
                break;
            } else {
                attempts++;
                System.out.println("Enter Correct PIN");
            }
        }

        if (attempts == 4)
            System.out.println("ATM Blocked");
    }
}