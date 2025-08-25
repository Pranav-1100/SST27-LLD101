public class FrameCache implements IFrameCache {
    private Frame lastFrame;
    
    @Override
    public void cache(Frame frame) {
        this.lastFrame = frame;
    }
    
    @Override
    public boolean hasCache() {
        return lastFrame != null;
    }
}