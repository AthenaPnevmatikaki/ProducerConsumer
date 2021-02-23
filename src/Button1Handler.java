import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Handler implements ActionListener{
	public Gui gui;
	public Integer number;
	public Integer consumptionTime;
	
	public Button1Handler(Gui gui) {
		this.gui = gui;
	}
	
	public void actionPerformed(ActionEvent pushingButton0) {
		System.out.println("button 1 pressed");
		
		try {
			number = Integer.parseInt(gui.number.getText());
			consumptionTime = Integer.parseInt(gui.consumptionTime.getText());
			Consumer c = new Consumer(gui.b, number, consumptionTime);
			c.start();
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
