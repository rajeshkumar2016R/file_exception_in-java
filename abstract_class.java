package abstract_class;


abstract class animal{
	void legs() {
		System.out.println("has 4 legs");
	}
	abstract void eat() ;
	abstract void sound();
}

class dog extends animal{
	@Override
	void sound() {
		System.out.println("bow bow bow.....");
	}
	void eat() {
		System.out.println("eat grasss....");
	}
}
public class abstract_class {

	public static void main(String[] args) {
		
		dog d = new dog();
		d.eat(); d.sound(); d.legs();
	}

}
