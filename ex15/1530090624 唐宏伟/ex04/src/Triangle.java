
public class Triangle extends Shape{
	double edge;
	double height;
	Triangle(double edge,double height){
		this.edge=edge;
		this.height=height;
	}
	public double getarea(){
		return edge*height/2;
	}

}
