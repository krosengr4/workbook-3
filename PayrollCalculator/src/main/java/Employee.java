public class Employee {
    // declaring variables
    int employeeId;
    String name;
    double hoursWorked;
    double payRate;

    //Constructor to create new employee instance
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //region Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    //endregion

    //Method to calculate an employees gross pay
    public double calculateGrossPay() {
        return this.hoursWorked * this.payRate;
    }



}
