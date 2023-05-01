package basic2._4;

public class ExerciseLunch {
    private Double price;
    private String nameOfDayEaten;
    private int lunchWeightInGrams;
    private static final double MAX_PRICE = 5;
    private int numberOfTimesWeHaveGotPrice = 0;

    ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    private void setPrice(Double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice++;
        return this.price;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public void setLunchWeightInGrams(int lunchWeightInGrams) {
        this.lunchWeightInGrams = lunchWeightInGrams;
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public int getNumberOfTimesWeHaveGotPrice() {
        return numberOfTimesWeHaveGotPrice;
    }
}

