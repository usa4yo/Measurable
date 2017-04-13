
public class Rectangle implements Measurable{
    
    private double length;
    private double width;

    public Rectangle(){
        this(Measurable.DEFAULT_SIDE, Measurable.DEFAULT_SIDE);
    }
    
    public Rectangle(double newLength, double newWidth){
        this.setLength(newLength);
        this.setWidth(newWidth);
    }
    
    /**
     * @return the length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * @param length the length to set
     */
    public boolean setLength(double newLength) {
        boolean returnValue = false;
        if(newLength > 0){
            this.length = newLength;
            returnValue = true;
        } else {
            this.length = Measurable.DEFAULT_SIDE;
        }
        return returnValue;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * @param width the width to set
     */
    public boolean setWidth(double newWidth) {
        boolean returnValue = false;
        if(newWidth > 0){
            this.width = newWidth;
            returnValue = true;
        } else {
            this.width = Measurable.DEFAULT_SIDE;
        }
        return returnValue;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return this.getLength() * this.getWidth();
    }
    
}
