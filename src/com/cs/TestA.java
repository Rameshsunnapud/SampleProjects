package com.cs;

public class TestA {
	public int num = 5;

	public static void main(String[] args) {
		b d = new b();
		d.c();
	}
}

class b extends TestA {
	public void c() {
		System.out.println(num);
	}
}
