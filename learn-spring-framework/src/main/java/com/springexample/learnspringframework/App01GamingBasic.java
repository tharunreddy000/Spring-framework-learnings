package com.springexample.learnspringframework;

import com.springexample.learnspringframework.game.GameRunner;
import com.springexample.learnspringframework.game.MarioGame;
import com.springexample.learnspringframework.game.PacManGame;
import com.springexample.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game); //2: Object creation + wiring of dependencies
		// game is a dependency of GameRunner 
		
		gameRunner.run();
		
	}

}
