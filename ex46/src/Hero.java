
public class Hero extends ActionCharacter implements CanSwim,CanFly{
	String name;
	Hero(String name){
		this.name=name;
	}
	public void swim(){
		System.out.println(name+"��Ӿ");
	}
	public void fly(){
		System.out.println(name+"����");
	}
	public void fight(String emp){
		System.out.println(name+emp+"���");
		
	}

}
