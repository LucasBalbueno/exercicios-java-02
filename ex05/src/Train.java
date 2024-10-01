public class Train implements IMeansTransport{
    @Override
    public void accelerate () {
        System.out.println("The train is accelerating!");
    }

    @Override
    public void brake () {
        System.out.println("The train is braking");
    }
}