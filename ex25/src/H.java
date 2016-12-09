
public class H {
	public static void main(String args[]){
		int x[];
		x=new int[50];
		for(int i=0;i<50;i++){
			x[i]=2*i+1;
			
		}
		for( int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
			if((i+1)%10==0)
				System.out.println();	
		}
		String y[][]=new String[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==j||(i+j)==9)
					y[i][j]="*";
				else y[i][j]="#";
					
			}
			for(i=0;i<10;i++){
				for(int j=0;j<10;j++){
					System.out.print(y[i][j]);
				System.out.println();
					
				}
				
			}
		}
			
		
	}

}


