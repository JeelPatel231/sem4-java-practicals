import java.time.LocalDateTime;

class Person{
    String name;
    String address;
    double phoneNumber;
    String email;

    Person(String n,String a,double p,String e){
        this.name = n;
        this.address = a;
        this.phoneNumber = p;
        this.email = e;
    }

    public String toString(){
        return getClass().getName()+" : "+this.name;
    }

}
enum StudStatus {
    FRESHMAN,
    SOPHOMORE,
    JUNIOR,
    SENIOR
}
class Student extends Person{
    StudStatus status;

    Student(String n,String a,double p,String e,StudStatus s){
        super(n,a,p,e);
        this.status = s;
    }
}

class Employee extends Person{
    int office;
    double salary;
    LocalDateTime dateHired;
    Employee(String n,String a,double p,String e,int o, double s){
        super(n,a,p,e);
        this.office = o;
        this.salary = s;
        this.dateHired = LocalDateTime.now();
    }
}

class Faculty extends Employee{
    double officeHours;
    int rank;

    Faculty(String n,String a,double p,String e,int o, double s,double oh,int r){
        super(n, a, p, e, o, s);
        this.officeHours = oh;
        this.rank = r;
    }

}

class Staff extends Employee{
    String title;

    Staff(String n,String a,double p,String e,int o, double s,String t){
        super(n, a, p, e, o, s);
        this.title = t;
    }
}
public class prac8 {
    public static void main(String[] args) {
        Student s1 = new Student("jeel", "s", 566565, "email", StudStatus.JUNIOR);
        System.out.println(s1.toString());

        Staff s2 = new Staff("ankur", "f", 857675, "email2", 4, 23423, "title");
        System.out.println(s2.toString());
    }
}
