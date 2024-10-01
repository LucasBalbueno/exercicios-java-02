public class Main {
    public static void main(String[] args) {
        Employee Lucas = new Developer("Lucas Balbueno", 2500, "Developer");
        Employee Maria = new Manager("Maria Silva", 4000, "Manager");
        Employee Carlos = new Trainee("Carlos Cardoso", 1100, "Trainee");
        SystemEmployees system = new SystemEmployees();

        system.addEmployee(Lucas);
        system.addEmployee(Maria);
        system.addEmployee(Carlos);

        Lucas.work();
        Maria.work();
        Carlos.work();
        System.out.println("======================");

        ((Developer) Lucas).showAttributes();
        System.out.println("======================");
        ((Manager) Maria).showAttributes();
        System.out.println("======================");
        ((Trainee) Carlos).showAttributes();
        System.out.println("======================");

        System.out.println(Lucas.getName());
        System.out.println(Lucas.calculateSalary());
        System.out.println(Lucas.calculateBonus());
        System.out.println("======================");
        System.out.println(Maria.getName());
        System.out.println(Maria.calculateSalary());
        System.out.println(Maria.calculateBonus());
        System.out.println("======================");
        System.out.println(Carlos.getName());
        System.out.println(Carlos.calculateSalary());
        System.out.println(Carlos.calculateBonus());
        System.out.println("======================");

        system.calculatePayroll();
        System.out.println("======================");

        system.promoteEmployee("Lucas Balbueno", "Manager", 5000);

        System.out.println(Lucas.calculateSalary());
        System.out.println(Lucas.calculateBonus());
        System.out.println("======================");
        ((Developer) Lucas).showAttributes();
    }
}