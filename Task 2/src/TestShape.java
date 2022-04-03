///TASK 2 PRAKTIKUM W8 TEKPRO

 public class TestShape { 
 public static void main (String[] args) {
  
  Shape s0 = new Shape ("Pink",true);
  System.out.println(s0);
  
  Shape s1 = new Circle();
  System.out.println(s1);
  
  Circle c1 = new Circle(2.0);
  System.out.println(c1);
  
  Rectangle r1 = new Rectangle(3.0 , 1.0 , "Purple", false);
  System.out.println(r1);
  
  Rectangle s3 = new Square (4.0);
  System.out.println(s3);
  System.out.println( "The perimeter of this square is= "+ s3.getPerimeter());
  
  }
  
  
 }
 


