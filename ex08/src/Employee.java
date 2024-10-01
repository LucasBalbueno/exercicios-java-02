public abstract class Employee {
    protected String Name;
    protected double Salary;
    protected String Position;

    public Employee (String name, double salary, String position) {
        this.Name = name;
        this.Salary = salary;
        this.Position = position;
    }

    public void work () {
        System.out.println("The " + Name + " is working!");
    }

    public String getName() { return Name; }
    public String getPosition() { return Position; }

    public void setPosition(String newPosition) { this.Position = newPosition; }
    public void setSalary(double newSalary) { this.Salary = newSalary; }

    public abstract double calculateSalary();
    public abstract double calculateBonus();
}