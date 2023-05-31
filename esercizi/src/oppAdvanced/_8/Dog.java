package oppAdvanced._8;

class Dog extends Animal {
    private String breed;

    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond() {
        return getHeight() * 2;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}