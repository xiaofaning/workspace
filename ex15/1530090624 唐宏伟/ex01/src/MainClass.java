
public class MainClass {
	public static void main(String args[]){
	Student stu=new Student();
	Circle c=new Circle(2);
	Rect r=new Rect(3,4);
	Triangle t=new Triangle(4,5);
	double area1=stu.computerarea(c, r);
	double area2=stu.computerarea(r, t);
	System.out.println(area1);
	System.out.println(area2);
	}
	
	
	
	
	
	
	
	
	

}
