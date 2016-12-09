package a;

public class Son extends Father {
	protected int age;
	String name;
	public Son(int age,String name){
		this.age=age;
		this.name=name;
	}
    private void play(){
		System.out.println(name+"ÔÚÍæ");
	}
	public void study(){
		System.out.println(name+"ÔÚÑ§Ï°");
	}

}
