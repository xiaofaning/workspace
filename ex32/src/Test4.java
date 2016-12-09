
public class Test4 {
	public static void main(String args[]){
		Person p=new Person("小明","山大路");
		Faculty f=new Faculty("本科");
		Staff s=new Staff( 0,"学生");
		Employee e=new Employee(2000,"3:14");
		s.setduty("学生");
		p.speak1();
		e.say1();
		f.say2();
		s.say3();
	}

}
