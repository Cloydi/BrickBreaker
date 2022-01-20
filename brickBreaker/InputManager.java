package brickBreaker;
import java.util.ArrayList;
import java.awt.event.*;

import javax.swing.*;
public class InputManager extends JPanel implements KeyListener, ActionListener{
	
	/////////////////// PROPERTIES ///////////////////
	
	private static InputManager instance;
	private ArrayList<Integer> pressed = new ArrayList<Integer>();
	private ArrayList<Integer> just_pressed = new ArrayList<Integer>();
	private ArrayList<Integer> just_released = new ArrayList<Integer>();

	public InputManager() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		System.out.println("Added Listener");
	}
	
	public static InputManager getInstance() {
		if (instance == null) {
			instance = new InputManager();
		}
		System.out.println("Accessed InputManager");
		return instance;
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		if (!pressed.contains(code)) {
            pressed.add(code);
            just_pressed.add(code);
        }
		System.out.println("Pressing" + pressed);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Releasing");
		int code = e.getKeyCode();
        pressed.remove(Integer.valueOf(code));
        just_released.add(code);                
        System.out.println("Releasing" + just_released);
	}
	/////////////////// GETTERS & SETTERS ///////////////////
	
	public boolean pressed(int keycode) {return pressed.contains(keycode);}
	public boolean justPressed(int keycode) {return just_pressed.contains(keycode);}
	public boolean justReleased(int keycode) {return just_released.contains(keycode);}
	public int pressedInt(int keycode) {return pressed(keycode) ? 1 : 0;}
	public int justPressedInt(int keycode) {return justPressed(keycode) ? 1 : 0;}
	public int justReleasedInt(int keycode) {return justReleased(keycode) ? 1 : 0;}
	public void clearPressed() {pressed.clear();}
	public void clearJustPressed() {just_pressed.clear();}
	public void clearJustReleased() {just_released.clear();}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}