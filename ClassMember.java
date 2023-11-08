package classobject;

public class ClassMember {
	
	public ClassMember() {//non args constructor
		System.out.println("non args");
	}
	
	public ClassMember(int a) {//args constructor
		this();//call current class constructor
		System.out.println("args");
	}
	public void getData() {
		System.out.println("intsance");
		
	}
	
	public static void setData() {
		System.out.println("static");
		
	}

	public static void main(String[] args) {
		
		ClassMember d= new ClassMember();
		d.getData();
		
		ClassMember.setData();
		//we cannot call instanc method using class name

	}

}
