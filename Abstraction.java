package myproject;
class Author2{
	private String n;
	private String e;
	private char g;
	Author2(String name,String email,char gender){
		this.n=name;
		this.e=email;
		this.g=gender;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public char getG() {
		return g;
	}
	public void setG(char g) {
		this.g = g;
	}
	
	
	
}
class Book1{
	private String BN;
	private Author2 author;
	private int Qty;
	private int price;
	Book1(String Bookname,Author2 author,int QtyInstock,int price){
		this.BN=Bookname;
		this.author=author;
		this.Qty=QtyInstock;
		this.price=price;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class oopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author2 object = new Author2("Raghual","raviraghual@gmail.com",'m');
		Book1 object1=new Book1("The lion King",object,120,20);
		System.out.println("BookPrice"+object1.getPrice());
		System.out.println("BookQty"+object1.getQty());
		System.out.println("AuthorName"+object.getN());
		System.out.println("Author'sEmail"+object.getE());
		System.out.println("Author's Gender"+object.getG());
		
		
	}

}
