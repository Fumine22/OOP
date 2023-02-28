public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public Bank() {
        System.out.println("Empty constructor called");
    }
    public Bank(String accountNumber, double accountBalance, String customerName, String email1, String phoneNumber1) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = email1;
        phoneNumber = phoneNumber1;

    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + accountBalance);
    }
    public void withdrawFunds(double withdrawAmount) {
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount + " processed, Remaining balance = $" + accountBalance);
        }
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
