package com.mycompany.main;

public class Application {

	public static void main(String[] args) {
		float f1 = 145.23f;
		float f2 = 234.32f;
		float sum = StaticClass.add(f1, f2);
		System.out.println(sum);
		
		FinalClass fc = new FinalClass();
		System.out.println(fc.myConstant);
		
		ConcreteClass cc = new ConcreteClass();
		cc.run();
	}

}
