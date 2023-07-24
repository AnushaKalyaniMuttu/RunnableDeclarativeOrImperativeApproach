package com.test;

public class RunnableImperativeVsDeclarative {

	public static void main (String [] args) {
		//Imperative Approach
		Runnable runnable1=new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable1");
			}
			
		};
		new Thread(runnable1).start();
		
		//Declarative Approach
		Runnable runnable2=()->System.out.println("Runnable 2");
		new Thread(runnable2).start();
	}
}

