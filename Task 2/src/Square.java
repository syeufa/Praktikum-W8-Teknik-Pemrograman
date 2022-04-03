/**
*TASK 2 PRAKTIKUM W8 TEKPRO
* Square
* Syifa Khairina-211524063
*/
public class Square extends Rectangle{
    public Square(){
        super(); // inherit from superclass
    }
    
    public Square(double side) {
    super(side, side); // Call superclass Rectangle(double, double)
    }
    
    public Square(double side, String color, boolean filled) {
    super(side, side,color,filled); // Call superclass Rectangle(double, double)
    }
    
    //setter and getter
    public double getSide(){
        return super.getWidth();
    }
    public void setSide (double side){
        super.setLength(side); //set length and width as side, so it will be equal
        super.setWidth(side); 
    }

    @Override
    public String toString() {
        return "A Square with side " + getSide() +","+" which is a subclass of " + super.toString();
    }
    
    @Override
    public void setLength(double side){
        setSide(side);
    }
    
    @Override
    public void setWidth(double side){
        setSide(side);
    }
    
    @Override
    public double getPerimeter(){
        return getSide() + getSide()+ getSide() + getSide();
    }
}
