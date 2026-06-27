# Employee Management System

## Project Overview

The Employee Management System is a Java console application developed using Object-Oriented Programming (OOP) concepts. This project demonstrates Java 17 features such as Sealed Classes, Records, Enums, Collections, and Exception Handling.

The system allows users to manage employee information by adding employees, viewing employee details, searching employees, calculating salaries, and removing employees.

---

# Technologies Used

- Java 17
- IntelliJ IDEA / Eclipse
- Collections Framework
- OOP Concepts

---

# Project Structure

```
employeeManagementSystem
│
├── main
│   └── EmployeeManagementApp.java
│
├── model
│   ├── Employee.java
│   ├── FullTimeEmployee.java
│   ├── PartTimeEmployee.java
│   ├── ContractEmployee.java
│   ├── Address.java
│   └── Department.java
│
└── service
    └── EmployeeService.java
```

---

# OOP Concepts Used

## 1. Abstract Class

`Employee` is an abstract class.

It contains common employee details such as:

- Employee ID
- Employee Name
- Department
- Address

It also contains the abstract method:

```java
calcSalary()
```

Each employee type calculates salary differently.

---

## 2. Inheritance

Three classes inherit from Employee.

- FullTimeEmployee
- PartTimeEmployee
- ContractEmployee

These classes reuse the common properties of Employee.

---

## 3. Polymorphism

Employee objects are created using parent class references.

Example:

```java
Employee emp = new FullTimeEmployee(...);
```

This allows one reference to store different employee types.

---

## 4. Sealed Class (Java 17)

Employee is declared as a sealed class.

```java
public sealed abstract class Employee
permits FullTimeEmployee,
PartTimeEmployee,
ContractEmployee
```

Only the permitted classes can extend Employee.

---

## 5. Record

Address is implemented using Java Record.

```java
public record Address(
String street,
String city,
String state,
String pincode){}
```

Record automatically creates:

- Constructor
- Getter methods
- toString()
- equals()
- hashCode()

---

## 6. Enum

Department is created using Enum.

Available Departments:

- IT
- HR
- SALES
- FINANCE
- MARKETING

---

## 7. Collections

Employee objects are stored inside an ArrayList.

```java
List<Employee> employees = new ArrayList<>();
```

Collections allow storing multiple employee objects dynamically.

---

## 8. Exception Handling

If an employee ID is not found, the program throws an exception.

Example:

```java
Employee with ID 5 not found.
```

This prevents the program from crashing.

---

# Operations Performed

## 1. Add Employee

Adds a new employee into the employee list.

Method:

```java
addEmployee(Employee employee)
```

Example:

```java
service.addEmployee(emp1);
```

Output:

```
Aravindhan added successfully.
```

---

## 2. Display All Employees

Displays every employee stored in the collection.

Method:

```java
displayAllEmployees()
```

Output includes:

- Employee ID
- Employee Name
- Department
- Address
- Salary

---

## 3. Search Employee

Searches an employee using Employee ID.

Method:

```java
searchEmployee(int empId)
```

Example:

```java
service.searchEmployee(2);
```

If employee exists:

```
Employee Found
```

Otherwise:

```
Employee with ID 2 not found.
```

---

## 4. Calculate Salary

Each employee type calculates salary differently.

### Full-Time Employee

Returns monthly salary.

Example:

```
₹50000
```

### Part-Time Employee

Formula:

```
Hourly Rate × Hours Worked
```

Example:

```
250 × 8 = ₹2000
```

### Contract Employee

Returns the fixed contract amount.

Example:

```
₹30000
```

---

## 5. Remove Employee

Deletes an employee from the collection.

Method:

```java
removeEmployee(int empId)
```

Example:

```java
service.removeEmployee(1);
```

Output:

```
Employee Removed Successfully.
```

---

# Program Flow

```
Start
      │
      ▼
Create Employee Objects
      │
      ▼
Add Employees
      │
      ▼
Display All Employees
      │
      ▼
Search Employee
      │
      ▼
Calculate Salary
      │
      ▼
Remove Employee
      │
      ▼
Display Updated Employee List
      │
      ▼
End
```

---

# Java 17 Features Used

- Sealed Classes
- Records
- Enhanced Switch Support (Optional)
- Modern Java Syntax

---

# Advantages

- Simple and easy to understand.
- Demonstrates all major OOP concepts.
- Uses modern Java 17 features.
- Easy to extend with new employee types.
- Beginner-friendly project structure.

---

# Future Enhancements

- Menu-driven application using Scanner
- Update Employee Details
- Save employee data to a file
- Database integration using MySQL
- Employee login system
- Salary report generation
- GUI using JavaFX or Swing
- REST API using Spring Boot

---

# Sample Output

```
Aravindhan added successfully.
Maarimuthu added successfully.

ALL EMPLOYEES

Employee ID : 1
Employee Name : Aravindhan
Department : IT
Salary : ₹50000

Employee ID : 2
Employee Name : Maarimuthu
Department : SALES
Salary : ₹2000

SEARCH EMPLOYEE

Employee Found

Employee ID : 2
Employee Name : Maarimuthu
Salary : ₹2000

REMOVE EMPLOYEE

Employee Removed Successfully.
```

---

# Conclusion

This project demonstrates how Object-Oriented Programming concepts can be applied to build a simple Employee Management System. It showcases Abstract Classes, Inheritance, Polymorphism, Sealed Classes, Records, Enums, Collections, and Exception Handling while providing basic employee management operations.
