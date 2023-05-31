package oppAdvanced._8;

class Bird extends Animal {
    private int wingSpan;

    public Bird(int wingSpan, int height, int weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond() {
        return getWingSpan() * 4;
    }
    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}
