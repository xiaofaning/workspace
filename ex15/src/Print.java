
public class Print {
	public void output(int x){
		char i=0,j=0;
		if(x==1){
			i='A';
			j='Z';
		}
		if(x==2){
			i='a';
			j='b';
		}
		for(;i<=j;i++){
			System.out.println(i+"");
		}
		
	}

}
