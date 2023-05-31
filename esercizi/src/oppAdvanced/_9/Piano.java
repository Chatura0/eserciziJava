package oppAdvanced._9;

class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}