package myproject;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		    char ch;
		    int n,a,b,c;
		    do
		    {
		    System.out.println("The options are \n 1.Add\n 2.Sub \n Enter any one option");
			n=s.nextInt();
			switch (n){
			case 1:
				System.out.println("Enter a:");
				a=s.nextInt();
				System.out.println("Enter b:");
				b=s.nextInt();
				c=a+b;
				System.out.println("Result:"+c);
				break;
			case 2:
				System.out.println("Enter a:");
				a=s.nextInt();
				System.out.println("Enter b:");
				b=s.nextInt();
				c=a-b;
				System.out.println("Result:"+c);
				break;}
			System.out.println("Do u want to continue:");
			ch=s.next().charAt(0);
		    ch=Character.toUpperCase(ch);
			}while(ch=='Y');
	
	}
}

