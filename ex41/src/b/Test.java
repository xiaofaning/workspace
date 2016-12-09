package b;
import a.*;

public class Test {
	public static void main(String args[]){
		Father f=new Father(40,"张三");
		Son s=new Son(10,"小明");
		f.drive();
		f.work();
		s.study();
		
				
	}

}
