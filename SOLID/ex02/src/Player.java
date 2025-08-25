public class Player {
    private IDecoder decoder;
    private IUIRenderer uiRenderer;
    private IFrameCache frameCache;
    
    public Player(IDecoder decoder, IUIRenderer uiRenderer, IFrameCache frameCache) {
        this.decoder = decoder;
        this.uiRenderer = uiRenderer;
        this.frameCache = frameCache;
    }
    
    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        
        frameCache.cache(frame);
        
        uiRenderer.displayPlaying(fileBytes.length);
        uiRenderer.displayCacheStatus(frameCache.hasCache());
    }
}