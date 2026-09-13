public class Emplyeesalary {
    private String name;
    private double salary;
    Emplyee (String name, double salary) {
        this.name = name;
        this.salary  = salary;
    }
    public double getsalary() {
        return salary;
    }
    public void setsalary(double newsalary) {
        if ( newsalary > 0){
            salary = newsalary;
         } else{
            System.out.println("invalid salary!");
    }
}
}
public class Emplyeesalary {
    public static void main(String[]args) {
        Employee e = new Emplyee("krishna",30000);
        e.setsalar(-5000);
        e.setsalary (40000);
        System.out.println(e.getsalary());
    }
}

    

    