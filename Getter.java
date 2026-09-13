public class Getter {
    private int EmpId;
    private String name;
    private String department;
    public void setEmpId(int empId) {
        this.EmpId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
public int getEmpId() {
        return EmpId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
 class Main {
    public static void main(String[] args) {
        Getter emp = new Getter();
        emp.setEmpId(101);
        emp.setName("John Doe");
        emp.setDepartment("IT");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Department: " + emp.getDepartment());
    }
}