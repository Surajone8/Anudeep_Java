public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee() {}

    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSalary=" + empSalary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "niraj yadav", 30, 60000.00);

        System.out.println("Employee 1 Details:");
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setEmpId(102);
        employee2.setEmpName("suraj yadav");
        employee2.setEmpAge(25);
        employee2.setEmpSalary(50000.00);

        System.out.println("\nEmployee 2 Details:");
        System.out.println("ID: " + employee2.getEmpId());
        System.out.println("Name: " + employee2.getEmpName());
        System.out.println("Age: " + employee2.getEmpAge());
        System.out.println("Salary: " + employee2.getEmpSalary());
    }
}


//output
/*
Employee 1 Details:
Employee{empId=101, empName='niraj yadav', empAge=30, empSalary=60000.0}

Employee 2 Details:
ID: 102
Name: suraj yadav
Age: 25
Salary: 50000.0 */
