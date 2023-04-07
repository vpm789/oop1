package oop.add_tasks;

public class Pyramid extends Shape {
    protected double square;
    protected double height;

    public Pyramid(double volume, double square, double height) {
        super(volume);
        this.square = square;
        this.height = height;
    }

    public double getSquare() {
        return square;
    }

    public double getHeight() {
        return height;
    }
}
