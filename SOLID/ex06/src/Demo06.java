public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        Bird bird = new Bird();
        aviary.release(bird);
        
        Penguin penguin = new Penguin();
        aviary.releaseToWater(penguin);
    }
}
