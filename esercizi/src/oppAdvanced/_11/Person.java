package oppAdvanced._11;

record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "Person Details:\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Address: " + address;
    }
}