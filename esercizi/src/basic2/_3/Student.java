package basic2._3;

public class Student {
    private String name;
    private int age;
    private String address;
    private String major;
    private boolean isGraduated;
    private int getAgeCounter = 0;

    public Student(String name, int age, String address, String major, boolean isGraduated) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.major = major;
        this.isGraduated = isGraduated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            throw new IllegalArgumentException("Devi inserire il nome");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'età non puo essere negativa");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }
    public int getGetAgeCounter() {
        return getAgeCounter;
    }
}
