
public class example {
int x;
	private example(){
	       System.out.println("Constructor Called");
	       x = 5;
	   }

	   public static void main(String[] args){
	       // constructor is called while creating object
	       example obj = new example();
	       System.out.println("Value of x = " + obj.x);
	   }
}
