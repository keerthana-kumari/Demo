
public class Constructor_4 {

	Constructor_4(){                                                                    // default constructor no arguments 
		System.out.println("this is constructor.");
	}
	Constructor_4(int i){  // parametric constructor
		System.out.println("this is 2nd constructor."+i);
	}
	public static void main(String[] args) {
		Constructor_4 c = new Constructor_4();
		new Constructor_4(100);                 //Parameterized constructor 
		System.out.println("this is main method.");
	}
	public void constructor() {
		System.out.println("this is method");
		}
}
