package inheritance;

interface E{
	void show();
}
interface F{
	void show();
}

class G implements E,F{
	public void show() {
		System.out.print("This is E & F");
	}
}
public class multi extends G{

	public static void main(String[] args) {
		multi r = new multi();
		r.show();

	}

}
