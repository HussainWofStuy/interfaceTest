public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	return (4*Math.PI*Math.pow(super.getRadius(),3))/3;
    }

    public String toString(){
	return "FIXME!";
    }
}