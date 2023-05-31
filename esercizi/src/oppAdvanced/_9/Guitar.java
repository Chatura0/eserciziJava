package oppAdvanced._9;

class Guitar extends Instrument {
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Playing guitar");
    }
}