
public class Test2 {
	public static void main(String args[]){
		int yanghui[][]=new int[10][];
		for(int i=0;i<yanghui.length;i++){
			yanghui[i]=new int[i+1];
			for(int j=0;j<=i;j++){
				if(i==0||j==0||j==i){
					yanghui[i][j]=1;
				}else {
					yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-i];
				}
				System.out.print(yanghui[i][j]+"");
				
			}
			System.out.println();
		}
		
	}

}
