
public class testingGitMain {

	public static void main(String args[]){
		System.out.println("Welcome.....");
//		System.out.println("hello from testing EGIT!!!");
		if(SayHello("naveen")){
			String msg = "BYE";
			for(int i=0;i<3;i++){
				System.out.println(msg.charAt(i));
			}

		}
				
	}
	
	
	public static boolean SayHello(String name){
		System.out.println("Hello"+name);
		return true;
	}
}
