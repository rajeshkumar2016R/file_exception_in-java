package inheritance;

class Students{
	void input(){
		System.out.print("Enter Your name: ");
	}
}

class Sub1 extends Students{
	void name1() {
		System.out.print("my name is Rajesh");
	}
}

class Sub2 extends Students{
	void name2() {
		System.out.print("my name is Raj");
	}
}

public class hierarchical {

	public static void main(String[] args) {
		sub1 r = new sub1();
//		sub2 r2 = new sub2();
		
		r.input(); r.name1();
	}

}
