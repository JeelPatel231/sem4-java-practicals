import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    Account(int id, int balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // getters 
    double getId(){ return this.id; }
    double getBalance(){ return this.balance; }
    double getAnnualInterestRate(){ return this.annualInterestRate; }
    Date getDate(){ return this.dateCreated; }

    double getMonthlyInterestRate(){ return this.annualInterestRate / 12 ;}
    double getMonthlyInterest(){ return balance * getMonthlyInterestRate() ;}

    // setters
    void setId(int i){this.id = i;};
    void setBalance(double i){this.balance = i;};
    void setAnnualInterestRate(double i){this.annualInterestRate = i;};

    void deposit(double i){ this.balance += i;}
    void withdraw(double i){ this.balance -= i;}
}

class CheckingAccount extends Account {
    int OVERDRAFT_LIMIT = 100000;
    void deposit(double i){
        double finalAmount = this.getBalance() + i;
        if( finalAmount < OVERDRAFT_LIMIT){
            this.setBalance(finalAmount);
            return;
        }

        System.out.println("Overdraft Limit exceeded!\nNo changes made!");
    }
}

class SavingsAccount extends Account{
    int OVERDRAW_LIMIT = 3000;
    void withdraw(double i) {
        double finalAmount = this.getBalance() - i;

        if( finalAmount > OVERDRAW_LIMIT){
            this.setBalance(finalAmount);
            return;
        }

        System.out.println("Overdraw Limit exceeded!\nNo changes made!");
    }
}


public class prac9 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.withdraw(1000);
        CheckingAccount c1 = new CheckingAccount();
        c1.deposit(100001);
    }
}
