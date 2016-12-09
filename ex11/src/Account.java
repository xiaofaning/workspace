
public class Account {
	public String user;
	public double money;
	Account(String user,double money){
		this.user=user;
		this.money=money;
	}
	public double desposit(double a){
		return money=a+money;
	}
	public double withdraw(double b){
		return money=money-b;
	}
	public void show(){
		System.out.println("Êä³öµ±Ç°Óà¶î"+money);
	}

}
