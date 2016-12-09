
public class Triangle extends Shape {
	int a;
	int b;
	int c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	  girth=a+b+c;
	}
	public int getgirth(){
		
		return girth;
	}

}
