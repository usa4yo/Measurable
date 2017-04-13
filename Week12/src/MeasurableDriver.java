
public class MeasurableDriver {
    
    private static Measurable r1 = new Rectangle();
    private static Measurable r2 = new Rectangle(4.0, 5.0);

    private static Measurable c1 = new Circle();
    private static Measurable c2 = new Circle(3.0);
    
    private static Measurable s1 = new Square();
    private static Measurable s2 = new Square(6.0);

    private static Measurable[] measurable = {r1, r2, c1, c2, s1, s2};

    
    public static void main(String[] args) {
        for(Measurable m : measurable){
            MeasurableDriver.display(m);
        }
        
        // TODO Auto-generated method stub

    }

    private static void display(Measurable shape){
        System.out.print("Perimeter = " + shape.getPerimeter());
        System.out.println(", Area = " + shape.getArea());
        
        if(shape instanceof Square){
            Square tempShape = (Square) shape;
            System.out.println("Side = " + tempShape.getSide());
        }
    
    }
    
    
}
