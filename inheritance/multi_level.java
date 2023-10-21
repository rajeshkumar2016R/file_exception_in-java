package inheritance;

class students{
	String name;
	int roll,marks;
}

class c extends students{
	
	void mark(){
		System.out.println("Math: 39 , roll: 1");
	}
}
class d extends c{
	void name() {
		System.out.println("Rajesh");
	}
}
public class multi_level {

	public static void main(String[] args) {
		d r = new d();
		r.mark(); r.name();

	}

}
