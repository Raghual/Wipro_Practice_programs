package myproject;
class Animal{
	Animal(){
		
	}
	String eat() {
		return "It can eat";
		
	}
	String sleep() {
		return "It can sleep";
	}
}
class Bird{
	Bird(){
		
	}
	String eat() {
		return "It can eat";
		
	}
	String sleep() {
		return "It can sleep";
	}
	String fly() {
		return "It can fly";
	}
}


public class AnimalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal obj1=new Animal();
		System.out.println(obj1.eat());*/
		Bird obj1=new Bird();
		System.out.println(obj1.eat());
		System.out.println(obj1.sleep());
		System.out.println(obj1.fly());
		Animal obj2=new Animal();
		System.out.println(obj2.eat());
		System.out.println(obj2.sleep());
		
	}

}
