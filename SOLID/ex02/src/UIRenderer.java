public class UIRenderer implements IUIRenderer {
    @Override
    public void displayPlaying(int byteCount) {
        System.out.println("\u25B6 Playing " + byteCount + " bytes");
    }
    
    @Override
    public void displayCacheStatus(boolean isCached) {
        System.out.println("Cached last frame? " + isCached);
    }
}