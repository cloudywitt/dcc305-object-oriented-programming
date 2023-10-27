package first_test;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Homar");
        Car mobi = new Car("white", 1.0);

        try {
            driver.drive(mobi);
        } catch (EngineCapacityOverflowException ecofe) {
            System.out.println(ecofe + "The car was too weak");
        }
    }
}
