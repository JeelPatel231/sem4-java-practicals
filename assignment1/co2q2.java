class Account{
    String accNumber;
    private Double balance;

    Account(String accNumber){
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    void addBalance(Double amount){
        balance += amount;
    }

    void deductBalance(Double amount){
        balance -= amount;
    }

    Double getBalance(){
        return balance;
    }

}

class Customer{
    String name;
    int age;
    String address;
    String accType;
    String DoB;
    Account account;

    Customer(String name,int age,String address,String accType,String DoB,String accNumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.accType = accType;
        this.DoB = DoB;
        this.account = new Account(accNumber);
    }
}


public class co2q2 {
    public static void main(String[] args) {
        Customer accJohn = new Customer("John", 19, "34 this street", "savings", "2003-01-05", "12345");
        Customer accCindy = new Customer("Cindy", 45, "42 that steet", "current", "1986-07-23", "54321");
        
        accJohn.account.addBalance(4000.0);
        accCindy.account.addBalance(40204.00);

        accJohn.account.deductBalance(1500.00);
        accCindy.account.deductBalance(1500.00);

        System.out.printf("%s account balance : %f\n",accCindy.name,accCindy.account.getBalance());
        System.out.printf("%s account balance : %f\n",accJohn.name,accJohn.account.getBalance());

    }
}
