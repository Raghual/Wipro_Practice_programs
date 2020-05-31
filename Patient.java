package myproject;

public class Patient {
	String n;
	double h,w;
	Patient(String name, double height, double weight){
		n=name;
		h=height;
		w=weight;
	}
	double newpatient(){
		double BMI;
		BMI= ((w/(h*h))*703);
		return BMI;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient ob=new Patient( "Raghual", 1.7,45);
		System.out.println(ob.newpatient());
		

	}

}
