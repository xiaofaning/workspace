
public class Rect extends Shape{
	int height;
	int width;
	Rect(int height,int width){
		this.height=height;
		this.width=width;
		girth=(height+width)*2;
	}
	public int getgirth(){
		return girth;
	}

}
