
public class Main3 {
	public static void main(String args[]){
		Vehicle a=new Vehicle();
		a.setnum("��A9752");
		a.upspeed();
		Vehicle b=new Vehicle("��B5086",150,200);
		b.downspeed();
		System.out.println("a����Ϣ:"+a.num+" "+a.speed+" "+a.weight);
		System.out.println("b����Ϣ:"+b.num+" "+b.speed+" "+b.weight);
	}

}
