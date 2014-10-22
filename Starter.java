public class Starter{
	String msg = "Hello World";
	
	public static void main(String[] args){

		new Starter(args);

	}
	
	public Starter(){

	}
	
	public Starter(String[] args){
	System.out.println(msg + args[0]);
	}
}
