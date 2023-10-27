package first_test;

// Herança
public class EngineCapacityOverflowException extends IllegalArgumentException {
    EngineCapacityOverflowException(String message) {
        super(message);
    }
}
