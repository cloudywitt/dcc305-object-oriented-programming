package first_test;

// Herança
public class Car extends Automobile {
    public Car(String color, double engineCapacity) {
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.maxVelocity = engineCapacity * 110.0;
    }

    // Getters e Setters
    public String getColor() {
        return this.color;
    }

    public void paint(String color) {
        this.color = color;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public double getVelocity() {
        return this.velocity;
    }

    // Métodos principais
    public void speedUp(double speedUpVelocity) {
        // Tratamento de exceção
        if (speedUpVelocity < 0.0) {
            throw new NegativeVelocityException("You can't have negative velocity.");
        } else if (speedUpVelocity + this.velocity > this.maxVelocity) {
            throw new EngineCapacityOverflowException("You can't speed up more than the capacity of the engine.");
        }

        this.velocity += speedUpVelocity;
    }

    public void slowDown(double slowDownVelocity) {
        // Tratamento de exceção
        if (slowDownVelocity < 0.0) {
            throw new NegativeVelocityException("You can't have negative velocity.");
        } else if (slowDownVelocity > this.velocity) {
            throw new IllegalArgumentException("You can't slow down more than your velocity.");
        } else if (slowDownVelocity > 60.0) {
            System.out.println("Airbag activated!");
        }

        this.velocity =- slowDownVelocity;
    }
}
