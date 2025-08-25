public class Bicycle implements IPedalPowered {
    @Override
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}