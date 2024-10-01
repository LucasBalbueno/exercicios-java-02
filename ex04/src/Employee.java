public class Employee {
    protected String name;
    protected double salary;

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work () {
        System.out.println("The Employee is working!");
    }
}