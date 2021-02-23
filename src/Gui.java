import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame{
	public Button button0;
	public Button button1;
	public TextField productionTime;
	public TextField price;
	public TextField consumptionTime;
	public TextField number;
	public Buffer b = new Buffer();
	
	public Gui() {
		super ("Producer Consumer");
		
		this.setLocation(50,100);
		this.setSize(new Dimension (300, 300));
		this.setFont(new Font ("TimesRoman", Font.PLAIN, 12));
		this.setBackground(Color.lightGray);
		this.setVisible(true);
		this.setResizable(false);
		this.toFront();
		this.setLayout(null);
		this.addWindowListener(new CloseWindowAndExit());
		
		button0 = new Button("Create Producer");
		button0.setFont(new Font ("TimesRoman", Font.PLAIN, 14));
		button0.setBounds(new Rectangle (90, 90, 100, 27));
		button0.setBackground(Color.WHITE);
		button0.setForeground(Color.black);
		this.add(button0);
		button0.addActionListener(new Button0Handler(this));
		
		button1 = new Button("Create Consumer");
		button1.setFont(new Font ("TimesRoman", Font.PLAIN, 14));
		button1.setBounds(new Rectangle (90, 200, 100, 27));
		button1.setBackground(Color.WHITE);
		button1.setForeground(Color.black);
		this.add(button1);
		button1.addActionListener(new Button1Handler(this));
		
		productionTime = new TextField("Production Time", 14);
		this.add(productionTime);
		productionTime.setEditable(true);
		productionTime.setBounds(new Rectangle (15, 50, 120, 27));
		productionTime.setFont(new Font ("TimesRoman", Font.PLAIN, 14));
		
		price = new TextField("Price", 14);
		this.add(price);
		price.setEditable(true);
		price.setBounds(new Rectangle (155, 50, 120, 27));
		price.setFont(new Font ("TimesRoman", Font.PLAIN, 14)); 
		
		consumptionTime = new TextField("Consumption Time", 14);
		this.add(consumptionTime);
		consumptionTime.setEditable(true);
		consumptionTime.setBounds(new Rectangle (15, 160, 120, 27));
		consumptionTime.setFont(new Font ("TimesRoman", Font.PLAIN, 14));
		
		number = new TextField("Number", 14);
		this.add(number);
		number.setEditable(true);
		number.setBounds(new Rectangle (155, 160, 120, 27));
		number.setFont(new Font ("TimesRoman", Font.PLAIN, 14));
	}
}


class CloseWindowAndExit extends WindowAdapter {
	public void windowClosing (WindowEvent closeWindowAndExit) {
		System.exit(0);
	}
}
