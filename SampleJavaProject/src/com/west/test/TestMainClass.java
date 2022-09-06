package com.west.test;

public class TestMainClass
{

	public static void main(String[] args)
	{
		String whereAmI = TestMainClass.class.getName() + ".main()";
		System.out.println(whereAmI + " method entry");
		TestCalledClass c = new TestCalledClass();
		c.callMe();
		System.out.println(whereAmI + " done!");
	}

}
