/**
*TASK 2 PRAKTIKUM W8 TEKPRO
* Rectangle
* Syifa Khairina-211524063
*/
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    
    public Rectangle(){//1st constructor
       width = 1.0;
        length = 1.0;    
    }
    
    public Rectangle (double width, double length){//2nd constructor
     this.width = width;
     this.length = length;
    }
    
    public Rectangle (double width, double length, String color,boolean filled){//3rd constructor
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
     //setter and getter
    public double getWidth() {
        return width;
    }

    public double getLength() {    
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return getLength()*getWidth();
    }
    
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    
    @Override
    public String toString() { // in Shape class
    return "A Rectangle with width " + width +" and length " + length +"," + " which is a subclass of " + super.toString(); 
// use Shape's toString()
    }
}
