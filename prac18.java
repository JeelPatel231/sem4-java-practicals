class prac18 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("jeel", 19, "555-555-555", "420, this street", 456654, "specialization");
        Manager man1 = new Manager("manager", 43, "777-777-777", "69, that street", 7654345, "department");

        emp1.showDetails();
        man1.showDetails();

    }
}

class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name,int age,String phoneNumber,String address,double salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void show(){
        System.out.println("\nDETAILS : ");
        System.out.printf("NAME : %s\n",this.name);
        System.out.printf("AGE : %d\n", this.age);
        System.out.printf("Phone Number : %s\n", this.phoneNumber);
        System.out.printf("Address : %s\n", this.address);
        printSalary();
    }

    void printSalary(){
        System.out.printf("Salary : %f\n",this.salary);
    }
}

class Employee extends Member{
    String specialization;
    Employee(String name,int age,String phoneNumber,String address,double salary,String specialization){
        super(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
    }

    void showDetails(){
        super.show();
        System.out.printf("Specialization : %s\n", this.specialization);
    }
}

class Manager extends Member{
    String department;
    Manager(String name,int age,String phoneNumber,String address,double salary,String department){
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }

    void showDetails(){
        super.show();
        System.out.printf("Department : %s\n", this.department);
    }
}