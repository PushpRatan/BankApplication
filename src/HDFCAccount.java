import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
    private String accountNo; //random and unique --> UUID
    private double balance;
    private String password;
    final double rateOfInterest = 6.5;
    public HDFCAccount() {
    }
    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID()); //Universally  unique Identifier
        this.balance = balance;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Current Balance: "+this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return 0;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if (amount < this.balance) {
                this.balance -= amount;
                return "Remaining Balance: " + this.balance;
            }else{
                return "Low Balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            password = newPassword;
        }else{
            return "Incorrect Password";
        }
        return "Password Changed";

    }

    @Override
    public double calculateInterest(int years) {
        double intrest = (this.balance * years * rateOfInterest)/100;
        return 0;
    }
}
