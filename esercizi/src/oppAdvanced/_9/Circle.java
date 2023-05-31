package oppAdvanced._9;

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}