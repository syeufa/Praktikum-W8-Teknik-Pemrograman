/**
*TASK 2 PRAKTIKUM W8 TEKPRO
* The Circle class models a circle with a radius and color.
* Syifa Khairina-211524063
*/
public class Circle extends Shape{ // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
 private double radius;

 
// Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
 super();
 radius = 1.0;
 }

 /** Constructs a Circle instance with the given radius and default color */
 public Circle(double r) { // 2nd constructor
 super();
 radius = r;
 }
 
 public Circle(double r, String color,boolean filled){
 super(color, filled);
 radius = r;
 }
 
 
 // add getter and setter

 /** Returns the radius
     * @return  */
 public double getRadius() {
 return radius;
 }
 
 public void setRadius(double radius){
 this.radius = radius;
 } 

 /** Returns the area of this Circle instance
     * @return  */
 public double getArea() {
 return radius*radius*Math.PI;
 }
 
 /** Returns the perimeter of this Circle instance
     * @return  */
 public double getPerimeter(){
 return 2*radius*Math.PI;     
 }
 
 /** Return a self-descriptive string of this instance in the form of
Circle[Shape[color=?,filled=?],radius=?
* @return ]*/
@Override
public String toString() { // in Shape class
 return "A Circle with radius " + radius +" which is a subclass of " + super.toString(); 
// use Shape's toString()
 
  }
}
