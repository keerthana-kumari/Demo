
public class Constructor_5 {
	Constructor_5(){  
		System.out.println("this is constructor.");
		new Constructor_5(100);
	}
	Constructor_5(int i){  
		System.out.println("this is 2nd constructor."+i);
		new Constructor_5();
	}
	public static void main(String[] args) {
		Constructor_5 c = new Constructor_5();
		Constructor_5 c1 = new Constructor_5(100);
		System.out.println("this is main method.");
	}

}
