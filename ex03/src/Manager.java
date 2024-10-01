public class Manager extends Employee{
    public Manager (String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus () {
        double bonus = salary * 0.20;
        double newSalary = salary + bonus;
        return newSalary;
    }

    public void showAttributes () {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Salary with bonus: " + calculateBonus());
    }
}