public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return super.getArea()*getHeight();
    }

    public String toString(){
	return "FIXME!";
    }
}