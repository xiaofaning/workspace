
public class Print {
	public void output(){
		int b,c,d;
		for(int i=100;i<=999;i++){
			b=i/100;
			c=i/10%10;
			d=i%10;
			if(i==b*b*b+c*c*c+d*d*d){
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
