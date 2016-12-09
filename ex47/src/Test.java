
public class Test {
	public static void main(String args[]){
		
	Compute p=new Add();
	Compute m=new Sub();
	Compute t=new cheng();
	Compute d=new chu();
	UseCompute u=new UseCompute();
	u.useCom(m, 15, 5);
	System.out.println("");
	u.useCom(d, 15, 5);
	System.out.println("");
	u.useCom(t, 15, 5);
	System.out.println("");
	u.useCom(p, 15, 5);
	System.out.println("");
	
	
	}
}
