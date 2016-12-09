
public class ZhuTi {
		Shape s;
		double h;
		public void seth(double h){
			 this.h=h;
			
		}
		public void sets(Shape s){
			this.s=s;
		}
		public double getvolume(){
			return s.getarea()*h;
		}

}
