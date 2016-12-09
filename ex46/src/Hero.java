
public class Hero extends ActionCharacter implements CanSwim,CanFly{
	String name;
	Hero(String name){
		this.name=name;
	}
	public void swim(){
		System.out.println(name+"ÓÎÓ¾");
	}
	public void fly(){
		System.out.println(name+"·ÉÐÐ");
	}
	public void fight(String emp){
		System.out.println(name+emp+"´ò»÷");
		
	}

}
