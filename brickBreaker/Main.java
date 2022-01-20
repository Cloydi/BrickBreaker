package brickBreaker;
import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		GamePlay gamePlay = new GamePlay();
		InputManager INPUT_MANAGER = InputManager.getInstance();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(INPUT_MANAGER);
		obj.add(gamePlay);		
	}
}
