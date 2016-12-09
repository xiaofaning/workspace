
public class Truck extends Vehicle {
	double payload;
	Truck(int wheels,double weight,double payload){
		super(wheels,weight);
		this.payload=payload;
	}
	public void a(){
		System.out.println("车轮数"+wheels+"车重"+weight+"载重"+payload);
	}
	

}
