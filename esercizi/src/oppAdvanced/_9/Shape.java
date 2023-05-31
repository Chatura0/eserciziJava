package oppAdvanced._9;

abstract class Shape {
    protected double height;
    protected double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public abstract double calculateArea();
}
