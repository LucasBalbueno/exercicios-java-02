public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Lucas", 2500);
        Manager manager = new Manager("Maria", 5000);

        developer.showAttributes();
        manager.showAttributes();
    }
}