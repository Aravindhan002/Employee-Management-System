package employeeManagementSystem.model;

public final class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(int empId, String empName, Department department, Address address, double hourlyRate, int hoursWorked) {

        super(empId, empName, department, address);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calcSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayDetails() {
        displayBasicInfo();
        System.out.println("Employee Type : Part Time");
        System.out.println("Salary : ₹" + calcSalary());
    }
}