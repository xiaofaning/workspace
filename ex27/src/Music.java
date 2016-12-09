
public class Music {
	public static void tune(Instrument i){
		i.play();
		
	}
	public static void main(String args[]){
		Wind wind=new Wind();
		Music.tune(wind);
	    Brass brass=new Brass();
	    Music.tune(brass);
	}
	 
	

}
