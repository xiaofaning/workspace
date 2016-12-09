
public class PlainRect extends Rect {
	public double startX;
	public double startY;
	PlainRect(double width,double height,double startX,double startY){
		super(width,height);
		this.startX=startX;
		this.startY=startY;
		
	}
	PlainRect(){
		this(0,0,0,0);
		
		
	}
	public boolean isInside(double x,double y){
		if(x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height))
			return true;
		else return false;
	}
	

}
