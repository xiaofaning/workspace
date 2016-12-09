
public class Employee extends Person {
	String office;
	static double wage;
	static String hiredate;
	Employee(double wage,String hiredate){
		super(name,adress);
		this.wage=wage;
		this.hiredate=hiredate;
		
	}
	public void say1(){
		System.out.println("����"+wage+"ʱ��"+hiredate);
		
	}
	
	

}
