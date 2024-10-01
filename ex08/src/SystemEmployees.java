import java.util.ArrayList;
import java.util.List;

public class SystemEmployees {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculatePayroll() {
        double totalSalaries = 0;
        double totalBonus = 0;

        for (Employee employee : employees) {
            totalSalaries += employee.calculateSalary();
            totalBonus += employee.calculateBonus();
        }

        System.out.println("Total salaries: R$" + totalSalaries);
        System.out.println("Total de Bonuses: R$" + totalBonus);
    }

    public void promoteEmployee (String name, String newPosition, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.setPosition(newPosition);
                employee.setSalary(newSalary);
            }
        }
    }
}