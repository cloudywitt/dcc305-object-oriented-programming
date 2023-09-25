package aula08;

public class Rectangle implements CalculableArea {
    private int height;
    private int width;

    @Override
    public double calculateArea() {
        return height * width;
    }
}
