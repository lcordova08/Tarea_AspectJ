package app;

import java.util.Observable;

public class boton extends Observable{
private String color;

public String getcolor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
	setChanged();
}


}
