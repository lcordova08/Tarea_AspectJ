package app;

import java.util.Observable;
import java.util.Observer;

public class observadorconsola implements Observer{

	public void update(Observable observable, Object value) {
		System.out.println("se ha presionado el boton color " + ((boton)observable).getcolor());
		System.out.println("se ha cambiado el color " + ((boton)observable).getcolor());
	}
}
