class BankAccount {
    String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class PhonePeUser {

    private String name;
    private String phoneNumber;
    private String upiId;
    private double walletBalance;

    private BankAccount bankAccount;

    
    PhonePeUser(String name, String phoneNumber, String upiId,
                double walletBalance, BankAccount bankAccount) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.upiId = upiId;
        this.walletBalance = walletBalance;
        this.bankAccount = bankAccount;
    }

    
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUpiId() {
        return upiId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
