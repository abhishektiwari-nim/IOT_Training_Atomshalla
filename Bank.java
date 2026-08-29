class Bank
 {
    public static void main(String[] args){
	String name1 = "Kartik";
        String name2 = "Anu";
	int b1 = 10000, b2 = 10000;
        int d1 = 500, d2 = 700;
        int w1 = 5000, w2 = 500;
	b1 = b1 + d1 - w1;
	if (d2 <= 500)
            b2 = b2 + d2 - w2;
	System.out.println(name1 + ": Deposit " + d1 + ", Withdraw " + w1 + ", Balance " + b1);
	if (d2 > 500)
            System.out.println(name2 + ": Cannot deposit more than 500");
        else
            System.out.println(name2 + ": Deposit " + d2 + ", Withdraw " + w2 + ", Balance " + b2);
}
}