
public class Vehicle {
	String num;
	int speed;
	double weight;
	Vehicle(){
		this("XX1234", 100, 100);
	}
	Vehicle(String num,int speed,double weight ){
		this.num=num;
		this.speed=speed;
		this.weight=weight;
	}
	public void upspeed(){
		System.out.println("正在加速");
		
	}
	public void downspeed(){
		System.out.println("正在减速");
	}
	public void setnum(String num){
		this.num =num;
	}
	public double getweight(){
		return weight;
	}
	
	

}
