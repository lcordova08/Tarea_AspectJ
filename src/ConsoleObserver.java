import java.util.Observable;
import java.util.Observer;

import app.ScreenModel;

public class ConsoleObserver implements Observer {

	@Override
	public void update(Observable obs, Object obj) {
		System.out.print("El nuevo color es: " + ( (ScreenModel) obs ).getColor());
	}	
}
