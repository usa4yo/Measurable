
public class Circle implements Measurable {

    private double radius;

    public Circle(){
        this(Measurable.DEFAULT_SIDE);
    }
    public Circle(double newRadius){
        this.setRadius(newRadius);
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public boolean setRadius(double newRadius) {
        boolean returnValue = false;
        if(newRadius > 0) {
            this.radius = newRadius;
        } else {
            this.radius = Measurable.DEFAULT_SIDE;
        }
        return returnValue;

    }
    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * this.getRadius();
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(this.getRadius(),2);
    }
    
}
