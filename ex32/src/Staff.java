
public class Staff extends Employee{
	Staff(double wage, String hiredate) {
		super(wage, hiredate);
	}

	String duty;
	public void setduty(String duty){
		this.duty=duty;
	}
	public void say3(){
		System.out.println("³ÆºÅ"+duty);
	}
		
		
		

}
