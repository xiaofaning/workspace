
public class Truck extends Vehicle {
	double payload;
	Truck(int wheels,double weight,double payload){
		super(wheels,weight);
		this.payload=payload;
	}
	public void a(){
		System.out.println("������"+wheels+"����"+weight+"����"+payload);
	}
	

}
