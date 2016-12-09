
public class Faculty extends Employee{
	Faculty(double wage, String hiredate) {
		super(wage, hiredate);
	}
	String degree;
	String level;
	Faculty(String degree){
		super(wage,hiredate);
		this.degree=degree;
	}
	public void say2(){
		System.out.println("ѧλ"+degree);
	}

}
