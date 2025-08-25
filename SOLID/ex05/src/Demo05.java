
public class Demo05 {
    static int areaAfterResize(IResizable shape) {
        if (shape instanceof IShape) {
            shape.setWidth(5); 
            shape.setHeight(4); 
            return ((IShape) shape).area();
        }
        throw new IllegalArgumentException("Shape must implement IShape interface");
    }
    
    static int calculateArea(IShape shape) {
        return shape.area();
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Rectangle area after resize: " + areaAfterResize(rect));
        
        IResizableSquare resizableSquare = new IResizableSquare();
        System.out.println("IResizableSquare area after resize: " + areaAfterResize(resizableSquare));
        
        Square square = new Square(3);
        System.out.println("Square area: " + calculateArea(square));
        
        System.out.println("=== Proper Usage ===");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Rectangle (5x4): " + rectangle.area());
        
        Square squareFixed = new Square(4);  
        System.out.println("Square (4x4): " + squareFixed.area());
    }
}
