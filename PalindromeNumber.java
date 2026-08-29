class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int original = x;
        int reverse = 0;

        while (x > 0) {
            reverse = reverse * 10 + x % 10
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
	System.out.println(isPalindrome(34));
        System.out.println(isPalindrome(-34));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
}
}