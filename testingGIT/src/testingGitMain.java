
public class testingGitMain {

	public static void main(String args[]){
		System.out.println("Welcome.....");
//		System.out.println("hello from testing EGIT!!!");
		if(SayHello("naveen")){
			System.out.println("Bye....");
		}
		
	}
	
	
	public static boolean SayHello(String name){
		System.out.println("Hello"+name);
		return true;
	}
}
