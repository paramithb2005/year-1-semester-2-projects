public class Manager extends Employee {
    private double bonus;

    // Constructor taking name, base salary, and bonus, setting them using inherited setters
    public Manager(String name, double baseSalary, double bonus) {
        setName(name);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Overridden method: manager's salary is base salary plus bonus
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}