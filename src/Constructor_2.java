
public class Constructor_2 {
	Constructor_2(){                                          
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		Constructor_2 c= new Constructor_2();       // Here creating object but not calling method
		Constructor_2 c1= new Constructor_2();
		Constructor_2 c2= new Constructor_2();
	}
	public void constructor() {
		System.out.println("this is method");
		}

}
