package first_test;

// Herança
public abstract class Automobile {
    protected String color;
    protected double engineCapacity;
    protected double velocity;
    protected double maxVelocity;

    public abstract void speedUp(double speedUpVelocity);
    public abstract void slowDown(double slowDownVelocity);
}
