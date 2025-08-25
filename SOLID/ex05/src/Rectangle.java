public class Rectangle implements IShape, IResizable {
    protected int w, h;
    
    @Override
    public void setWidth(int w) { 
        this.w = w; 
    }
    
    @Override
    public void setHeight(int h) { 
        this.h = h; 
    }
    
    @Override
    public int area() { 
        return w * h; 
    }
}