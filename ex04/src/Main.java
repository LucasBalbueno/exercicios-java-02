public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Roger", 1500);
        Developer developer = new Developer("Lucas", 2500);
        Manager manager = new Manager("Maria", 5000);

        employee.work();
        developer.work();
        manager.work();
    }
}