package first_test;

public class Driver {
    private String name;

    Driver(String name) {
        this.name = name;
    }

    // Polimorfismo
    public void drive(Automobile automobile) {
        automobile.speedUp(60);
        automobile.slowDown(40);
        automobile.speedUp(30);
        automobile.slowDown(50);
    }
}
