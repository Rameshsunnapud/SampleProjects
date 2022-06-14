package com.cs;

class Animal {
	public void eat() {
		System.out.println("eating...");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("eating bread...");
	}

	public void bark() {
		System.out.println("barking...");
	}

	public void work() {
		super.eat();
		bark();
	}
}

public class Dog {
	public static void main(String args[]) {
		Cat d = new Cat();
		d.work();
	}
}
