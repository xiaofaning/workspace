
public class Car extends Vehicle {
	int loader;
	Car(int wheels,double weight,int loader){
		super(wheels,weight);
		this.loader=loader;
	}
	public void m(){
		System.out.println("小汽车的车轮数"+wheels+"重量"+weight+"载人数"+loader);
		
	}
	

}
