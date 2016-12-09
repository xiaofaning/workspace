
public class Rect1 extends Rect{
	double h;
	Rect1(double height,double width,double h){
		super(height,width);
		this.h=h;
	}
	public double getv(){
		return height*width*h;
	}
	

}
