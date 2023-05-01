package basic2._2;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }
    public Student(int age) {
        System.out.println("Constructing!");
        this.age = age;
        System.out.println("Constructed!");
    }

    public Student(String name) {
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("Constructed!");
    }

    public Student() {
        System.out.println("Constructing!");
        System.out.println("Constructed!");
    }
}

