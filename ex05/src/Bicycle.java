public class Bicycle implements IMeansTransport{
    @Override
    public void accelerate () {
        System.out.println("The bike is accelerating!");
    }

    @Override
    public void brake () {
        System.out.println("The bike is braking");
    }
}