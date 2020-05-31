package myproject;

public class Calculator {
	static int powerint(int a,int b) {
		int c;
		c=(int) Math.pow(a,b);
		return c;
		
	}
	static double powerdouble(double a ,double b) {
		double c;
		c=(double)Math.pow(a, b);
		return  c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		a=Calculator.powerint(2,3);
		b=Calculator.powerdouble(2,3);
		System.out.println(a);
		System.out.println(b);
		

	}

}
