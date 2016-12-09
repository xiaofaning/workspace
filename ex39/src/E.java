
public class E {
	public static void main(String args[]){
		Rect r=new Rect(3,4);
		Triangle t=new Triangle(3,4,5);
		Shape a;
		Shape b;
		a=r;
		b=t;
		System.out.println("矩形周长"+a.getgirth());
		System.out.println("三角形"+b.getgirth());
		
	}

}
