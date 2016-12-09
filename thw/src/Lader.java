
public class Lader {
	public double up;
	public double down;
	public double height;
	Lader(double up,double down,double height){
		this.up=up;
		this.down=down;
		this.height=height;
	}
	public double getarea(){
		return (up+down)*height/2.0;
	}

}
