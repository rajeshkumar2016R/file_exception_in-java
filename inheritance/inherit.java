package inheritance;

class A{
	String name ;
	int a;
}
class B extends A{
	void show() {
		System.out.print("Rajesh"+ " " + 20);
	}
}
public class inherit {

	public static void main(String[] args) {
		B r = new B();
		r.show();
	}

}
