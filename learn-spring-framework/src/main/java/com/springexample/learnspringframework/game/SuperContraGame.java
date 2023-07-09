package com.springexample.learnspringframework.game;

public class SuperContraGame implements GameConsole{
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Sit");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}
	
	public void left() {
		System.out.println("Go back");
	}
}
