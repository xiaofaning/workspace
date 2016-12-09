package a;

public class Father {
	private int age;
	public String name;
	public Father(int age,String name){
		this.age=age;
		this.name=name;
	}
	public Father(){
		this(0,"");
	}
	public void work(){
		System.out.println(name+"在工作");
	}
	public void drive(){
		System.out.println(name+"在开车");
	}
	
	

}
