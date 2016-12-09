
public class Test5 {
	public static void main(String args[]){
		Human h=new Human();
		Man m=new Man();
		Woman w=new Woman();
		h=m;
		h=w;
		h.say();
		h.talk();
	}

}
