
public class Adventure {
	public static void main(String args[]){
		Hero hb=new Hero("��ͯľ");
		CanFly cf;
		cf=hb;
		cf.fly();
		CanSwim cs;
		cs=hb;
		cs.swim();
		ActionCharacter ac;
		ac=hb;
		ac.fight("biubiubiu");
		ac.speak("haha");
		
	}

}
