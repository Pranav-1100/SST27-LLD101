public class Demo02 {
    public static void main(String[] args) {
        IDecoder decoder = new Decoder();
        IUIRenderer uiRenderer = new UIRenderer();
        IFrameCache frameCache = new FrameCache();
        
        Player player = new Player(decoder, uiRenderer, frameCache);
        player.play(new byte[]{1,2,3,4});
    }
}
