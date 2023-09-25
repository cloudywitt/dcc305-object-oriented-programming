package aula08;

public class Square implements CalculableArea {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
