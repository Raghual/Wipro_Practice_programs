package myproject;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args[0]=gender
		//args[1]=age
		int interest;
	    if(args[0]=="Female" and (args[1]>=1 && args[1]<=58)) 
	    	interest = "8.2%";
	    if(args[0]=="Female" and (args[1]>=59 && args[1]<=120)) 
		    interest = "7.9%";
		if(args[0]=="Male" and (args[1]>=1 && args[1]<=60)) 
		    interest = "9.3%";
		if(args[0]=="Male" and (args[1]>=61 && args[1]<=120)) 
	    	interest = "8.3%";
	}

}
