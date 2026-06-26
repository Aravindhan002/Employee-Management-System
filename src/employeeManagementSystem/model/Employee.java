package employeeManagementSystem.model;

public sealed abstract class Employee permits FullTimeEmployee, PartTimeEmployee, ContractEmployee {

    private int empId;
    private String empName;
    private Department department;
    private Address address;

    public Employee() {
    }

    public Employee(int empId, String empName, Department department, Address address) {

        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.address = address;
    }

    public abstract double calcSalary();

    public void displayBasicInfo() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department : " + department);
        System.out.println("Address : " + address);
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}