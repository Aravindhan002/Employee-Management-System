package employeeManagementSystem.service;
import employeeManagementSystem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {

        employees.add(employee);
        System.out.println(employee.getEmpName() + " added successfully.");
    }
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
            return;
        }
        for (Employee emp : employees) {
            emp.displayBasicInfo();
            System.out.println("Salary : ₹" + emp.calcSalary());
            System.out.println("--------------------------");
        }
    }
    public Employee searchEmployee(int empId) throws Exception {

        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        throw new Exception("Employee with ID " + empId + " not found.");
    }

    public void removeEmployee(int empId) throws Exception {

        Employee employee = searchEmployee(empId);
        employees.remove(employee);
        System.out.println("Employee Removed Successfully.");
    }
}