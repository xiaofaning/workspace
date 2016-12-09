
public class E {
	public static void main(String args[]){
		InterfaceA a;
		a=new ClassA();
		System.out.println("计算1到10的和"+a.method(10));
		a=new ClassB();
		System.out.println("10!="+a.method(10));
		a.method(10);
	}

}
