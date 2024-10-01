public class Developer extends Employee{
    public Developer (String name, double salary, String position) {
        super(name, salary, position);
    }

    @Override
    public double calculateSalary () {
        double salaryCalculated = 0;
        if (Position == "Manager") {
            salaryCalculated = Salary + calculateBonus();
        } else if (Position == "Developer") {
            salaryCalculated = Salary + calculateBonus();
        } else if (Position == "Trainee") {
            salaryCalculated = Salary + calculateBonus();
        }

        return salaryCalculated;
    }

    @Override
    public double calculateBonus () {
        double bonus = 0;

        if (Position == "Manager") {
            bonus = Salary * 0.2;
        } else if (Position == "Developer") {
            bonus = Salary * 0.15;
        } else if (Position == "Trainee") {
            bonus = Salary * 0.05;
        }

        return bonus;
    }

    public void showAttributes () {
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary completed: " + calculateSalary());
        System.out.println("Bonus: " +calculateBonus());
    }
}