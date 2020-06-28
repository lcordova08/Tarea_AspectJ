package app;

import java.util.Observable;

public class ScreenModel extends Observable implements IScreenModel {
	
	private String color;

	@Override
	public String[] getColorNames() {
		return new String[] { "BLACK", "WHITE", "BLUE" };
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void changeColor(String colorName) {
		this.color = colorName;
		
		if (colorName.equals("BLACK")) {
			// TODO
		} else if (colorName.equals("WHITE")) {
			// TODO
		} else if (colorName.equals("BLUE")) {
			// TODO
		} else {
			throw new IllegalArgumentException("No such color name: " + colorName); 
		}
		
		// Tell when the screen have changed
		setChanged();		
	}
	
	@Override
	public IScreenModel createScreen() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
