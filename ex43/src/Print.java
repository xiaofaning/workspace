
public class Print implements InterfaceA,InterfaceB {
	public void printCapitalLetter(){
		System.out.println("大写");
		for(char i='A';i<='Z';i++)
			System.out.printf(i+"\t");
			System.out.println();
	}
	public void printLowercaseLetter(){
		System.out.println("小写");
		for(char j='a';j<='z';j++){
			System.out.printf(j+"\t");
			System.out.println();
		}
	}

}
