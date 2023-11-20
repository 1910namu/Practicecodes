package single_inheritance;

public class child extends parent {
		
		int age;
		String name;
		String address;

	public child(int age, String name, String address) {
		
		super.age=age;
		super.name=name;
		super.address=address;
		System.out.println(super.age+" "+super.name+" "+super.address);
	}
	
	public child(String address, int age, String name) {
		this.age = age;
		this.name = name;
		this.address = address;
		System.out.println(this.age+" "+this.name+" "+this.address);
	}
	public static void main(String[] args) {
		child ch= new child(21,"Namrata","Ambernath");
		child pp= new child("Ambernath", 21,"Namrata");
	}
	
}
