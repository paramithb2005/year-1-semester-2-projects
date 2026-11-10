public class Employee {
    private String name;
    private double baseSalary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Calculates regular salary
    public double calculateSalary() {
        return baseSalary;
    }

    // Overloaded method: calculates salary including overtime hours (500 per hour)
    public double calculateSalary(int overtimeHours) {
        return baseSalary + (overtimeHours * 500);
    }
}