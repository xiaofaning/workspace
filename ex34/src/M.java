
public class M {
	public static void main(String args[]){
		PlainRect a=new PlainRect(20,10,10,10);
		System.out.println("矩形的面积="+a.getarea());
		System.out.println("矩形周长="+a.getperimeter());
		System.out.println("点(25.5,13)是否在矩形中"+a.isInside(25.5, 13));
	
	}
}
