package app;

/**
 * Screen interface for available colors.
 */
public interface IScreenModel {
	
	/**
	 * Returns an array with the colors can be use on screen.
	 */
	public String[] getColorNames();
	
	/**
	 * Returns the color string.
	 */
	public String getColor();
	
	/**
	 * Set the color string.
	 */
	public void changeColor(String colorName);
	
	/**
	 * Returns a new screen model for the app corresponding to the color name.
	 * 
	 * @param colorName
	 *            The color to be used for the screen background
	 * @throws IllegalArgumentException
	 *             if no such color
	 */
	public IScreenModel createScreen();

}
