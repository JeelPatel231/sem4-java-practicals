import java.util.Date;
import java.util.Scanner;

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

public class prac6 {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.setBalance(1000);
        System.out.println("Acc a1 Balance = "+a1.getBalance());
        System.out.println("Setting interest rate 0.18");
        a1.setAnnualInterestRate(0.18);
        System.out.println("success!!");
        System.out.println("Acc a1 Monthly Interest "+a1.getMonthlyInterest());
    }
}
