package com.springexample.learnspringframework.game;

public class PacManGame implements GameConsole{
	public void up() {
		System.out.println("Jump PacMan");
	}
	
	public void down() {
		System.out.println("Sit");
	}
	
	public void left() {
		System.out.println("Back");
	}
	
	public void right() {
		System.out.println("Shoot");
	}
}
