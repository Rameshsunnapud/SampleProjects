package com.cs;

public class Variables {

	static int x = 120;

	public static void main(String args[]) {
		System.out.println(x);
		int x = 10;

		{
			// y has limited scope to this block only
			int y = 20;
			System.out.println("Sum of x+y= " + (x + y));
		}
		// here y is unknown
		int y = 100;
		// x is still known
		x = 50;
	}

}
