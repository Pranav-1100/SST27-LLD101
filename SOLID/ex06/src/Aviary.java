public class Aviary {
    public void release(IFlyable bird) {
        bird.fly();
        System.out.println("Released");
    }
    
    public void releaseToWater(Penguin penguin) {
        penguin.swim();
        System.out.println("Released to water");
    }
}