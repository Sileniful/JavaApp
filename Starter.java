package app;

import test.Test;

public class Starter{
	
	public static void main(String[] args){

		new Starter();

	}
	
	public Starter(){

	}
	
	public Starter(String[] args){
	System.out.println("Hello World");
	Test test = new Test();
	System.out.println( test.getMessage() );
	
	}
	
	
}
