package com.beep.boop;

import javax.swing.JPanel;

public abstract class GenericView extends JPanel {
	
	protected GenericModel gm;
	protected GenericController gc;

	public void setModel(GenericModel gm) {
		this.gm = gm;
	}
	
	public void setController(GenericController gc) {
		this.gc = gc;
	}
}
