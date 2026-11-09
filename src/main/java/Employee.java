public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getRegularHours() {
        if (getHoursWorked() <= 40){
            return getHoursWorked();
        }else {
            return 40;
        }
    }
    public double getOvertimeHours() {
       if (getHoursWorked() > 40){
           return getHoursWorked() - 40;
       }else return 0;
    }
    public double getTotalPay() {
        return getHoursWorked() * getPayRate() + (getOvertimeHours()* (getPayRate() * 1.5));
    }

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee Id: " + employeeId + "\nName:" + name + "\nDepartment: " + department +
                "\nPay Rate: " + payRate + "\nHours Worked: " + hoursWorked;

    }
}
