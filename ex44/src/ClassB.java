
public class ClassB implements InterfaceA {
	public int method(int n){
		int p=1;
		for(int i=n;i>0;i--){
			p=p*i;
		}
		return p;
	}

}
