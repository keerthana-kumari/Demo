
public class Constructor_3 {

	Constructor_3(){
		System.out.println("this is constructor.");
		new Constructor_3 ();                                             //stack over flow
	}
	public static void main(String[] args) {
		Constructor_3 c = new Constructor_3();
		System.out.println("this is main method.");
	}
	public void constructor() {
		System.out.println("this is method");
		}
}
