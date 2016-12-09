
public class Rect {
	protected double width;
	protected double height;
	Rect(double width,double height){
		this.width=width;
		this.height=height;
	}
	Rect(){
		this(10,10);
	}
	public double getarea(){
		return width*height;
	}
	public double getperimeter(){
		return (width+height)*2;
	}

}
