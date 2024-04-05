package ClassAndObject;

public class Area1 {
	double 	Length,breath;
	public Area1(){
		Length=50;
		breath=30;
		
	}public Area1(double length,double breath){
		this.Length=length;
		this.breath=breath;
	}public void calculaate() {
		double area=Length*breath;
		System.out.println("Area of rectrangle:  "+area);
	}

	public static void main(String[] args) {
		Area1 a =new Area1();
		a.calculaate();
		Area1 b= new Area1(50,30);
		a.calculaate();
		

	}

}
