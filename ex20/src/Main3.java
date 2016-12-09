
public class Main3 {
	public static void main(String args[]){
		Vehicle a=new Vehicle();
		a.setnum("辽A9752");
		a.upspeed();
		Vehicle b=new Vehicle("辽B5086",150,200);
		b.downspeed();
		System.out.println("a的信息:"+a.num+" "+a.speed+" "+a.weight);
		System.out.println("b的信息:"+b.num+" "+b.speed+" "+b.weight);
	}

}
