
public class Main1 {
	public static void main(String args[]){
		ZhuTi z=new ZhuTi();
		z.seth(3);
		Circle c=new Circle(2);
		z.sets(c);
		double volume1=z.getvolume();
		System.out.println("volume is:" +volume1);
		Rect r=new Rect(1,2);
		z.sets(r);
		double volume2=z.getvolume();
		System.out.println("volume is:" +volume2);
		Triangle t=new Triangle(1,2);
		z.sets(t);
		double volume3=z.getvolume();
		System.out.println("volume is:" +volume3);
		
		
		
	}

}
