
public class Rect extends Shape {
	double height;
	double width;
	Rect(double height,double width){
		this.height=height;
		this.width=width;
	}
	public double getarea(){
		return height*width;
	}

}
