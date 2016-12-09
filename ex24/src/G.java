
public class G {
	public static void main(String args[]){
		int a[][]={{3,2,6},{6,8,2,10},{5},{12,3,23}};
		int max=a[0][0];
		int min=a[0][0];
		int i,j;
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				if(a[i][j]>max)
					max=a[i][j];
				if(a[i][j]<min)
					min=a[i][j];
					
			}
			
		}
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
		
	}

}
