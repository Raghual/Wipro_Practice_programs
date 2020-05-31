package myproject;

public class ClassReturnsVolume {
	double l,b,w;
	ClassReturnsVolume(double length,double breadth,double width){
		l=length;
		b=breadth;
		w=width;
	}
	double volume() {
		return(l*b*w);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassReturnsVolume b=new ClassReturnsVolume(9,3,4);
		System.out.println(b.volume());
		
	}

}
