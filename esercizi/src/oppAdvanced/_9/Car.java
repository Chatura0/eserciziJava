package oppAdvanced._9;

class Car implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Car moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car moving backward");
    }
}
