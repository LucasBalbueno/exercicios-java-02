public class Car implements IMeansTransport {
    @Override
    public void accelerate () {
        System.out.println("The car is accelerating!");
    }

    @Override
    public void brake () {
        System.out.println("The car is braking");
    }
}