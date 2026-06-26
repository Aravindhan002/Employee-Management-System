package employeeManagementSystem.main;

import employeeManagementSystem.model.*;
import employeeManagementSystem.service.EmployeeService;

class EmployeeManagementApp {
    static void main() {
        EmployeeService service = new EmployeeService();

        Address address1 = new Address(
                "Royal Theatre",
                "Erode",
                "Tamil Nadu",
                "638301");
        Address address2 = new Address(
                "289, Srinivasapuram, Bhavani",
                "Erode",
                "Tamil Nadu",
                "638301");
        Address address3 = new Address(
                "Nandha college",
                "Erode",
                "Tamil Nadu",
                "638301");

        Employee emp1 = new FullTimeEmployee(
                1,
                "Aravindhan",
                Department.IT,
                address1,
                50000);
        Employee emp2 = new PartTimeEmployee(
                2,
                "Maarimuthu",
                Department.SALES,
                address2,
                250,
                8);
        Employee emp3 = new ContractEmployee(
                3,
                "Ayiien",
                Department.MARKETING,
                address3,
                25000);
        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);
        System.out.println("\nALL EMPLOYEES : ");

        service.displayAllEmployees();

        try {

            System.out.println("\nSEARCH EMPLOYEE :");

            Employee employee = service.searchEmployee(2);

            employee.displayBasicInfo();


            System.out.println(
                    "Salary : ₹"
                            + employee.calcSalary());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {

            System.out.println(
                    "\nREMOVE EMPLOYEE :");

            service.removeEmployee(1);

            System.out.println(
                    "\nUPDATED LIST :");

            service.displayAllEmployees();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}