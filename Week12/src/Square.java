
public class Square extends Rectangle {

    public Square() {
        this(Measurable.DEFAULT_SIDE);
    }
    
    public Square(double newSide) {
        super(newSide, newSide);
    }
    
    public double getSide(){
        return this.getLength();
    }
    
    public boolean setSide(double newSide){
        this.setLength(newSide);
        return this.setWidth(newSide);
    }
}
