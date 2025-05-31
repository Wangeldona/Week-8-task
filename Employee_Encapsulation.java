import java.util.Scanner;

public class Employee_Encapsulation {
    private String name;
    private int employeeId;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double change) {
        if (salary + change >= 0) {
            salary += change;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public void printInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee_Encapsulation emp = new Employee_Encapsulation();

        System.out.print("Enter employee name: ");
        emp.setName(scanner.nextLine());

        System.out.print("Enter employee ID: ");
        emp.setEmployeeId(scanner.nextInt());

        System.out.print("Enter starting salary: ");
        emp.updateSalary(scanner.nextDouble()); // Set initial salary

        emp.printInfo();

        System.out.print("Enter salary change (+/-): ");
        emp.updateSalary(scanner.nextDouble());

        emp.printInfo();
        scanner.close();
    }
}
