class Rectangle{
    public void Area(double width,double height){
        System.out.println("Area of rectangle is "+ width*height); 
    }
}
public class Area_of_Rectangle{
    public static void main (String[] args){
        Rectangle obj1=new Rectangle();
        Rectangle obj2=new Rectangle();
        obj1.Area(1.5,2.0);
        obj2.Area(3.0,4.5);
    }
}