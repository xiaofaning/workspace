
public class E {
	public static void main(String args[]){
		InterfaceA a;
		a=(InterfaceA) new Print();
		a.printCapitalLetter();
		InterfaceB b;
		b=(InterfaceB) new Print();
		b.printLowercaseLetter();
		
	}

}
