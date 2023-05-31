package oppAdvanced._9;

class Boat implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Boat moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Boat moving backward");
    }
}
