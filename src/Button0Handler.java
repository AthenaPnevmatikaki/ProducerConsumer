import java.awt.event.*;

public class Button0Handler implements ActionListener{
	public Gui gui;
	public Integer price;
	public Integer productionTime;
	
	public Button0Handler(Gui gui) {
		this.gui = gui;
	}
	
	public void actionPerformed(ActionEvent pushingButton0) {
		System.out.println("button 0 pressed");
		
		try {
			price = Integer.parseInt(gui.price.getText());
			productionTime = Integer.parseInt(gui.productionTime.getText());
			if(price == 0) {
				throw new IlegalArgumentException("Initial price");
			}
			if(productionTime == 0) {
				throw new IlegalArgumentException("Production Time");
			}
			Producer p = new Producer(gui.b, price, productionTime);
			p.start();
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch (IlegalArgumentException e) {
			System.out.println(e);
		}
	}
}
