
public class E {
	public static void main(String args[]){
		InterfaceA a;
		a=new ClassA();
		System.out.println("����1��10�ĺ�"+a.method(10));
		a=new ClassB();
		System.out.println("10!="+a.method(10));
		a.method(10);
	}

}
