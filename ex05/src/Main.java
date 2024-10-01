public class Main {
    public static void main(String[] args) {
        IMeansTransport[] transports = {new Car(), new Bicycle(), new Train()};

        for (IMeansTransport vehicle : transports) {
            vehicle.accelerate();
            vehicle.brake();
            System.out.println();
        }
    }
}