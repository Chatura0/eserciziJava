package oppAdvanced._9;

class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
