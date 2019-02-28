package com.beep.boop;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameView extends GenericView {

	protected NameModel nm;
	protected NameController nc;
	
	public NameView() {
		this.setLayout(null);
		this.setSize(Main.mainSpace.getSize());
		
		this.nm = new NameModel(this);
		this.nc = new NameController(this, nm);
		
		JButton btCopy = new JButton("Copy");
		JButton btReset = new JButton("Reset");
		JButton btClear = new JButton("Clear");

		JTextField tfIn = new JTextField();
		JTextField tfOut = new JTextField();
		
		tfIn.setBounds(10, 10, 200, 40);
		tfOut.setBounds(210, 10, 200, 40);
		
		btCopy.setBounds(110, 60, 100, 40);
		btClear.setBounds(210, 60, 100, 40);
		btReset.setBounds(310, 60, 100, 40);


		this.add(tfIn);
		this.add(tfOut);
		this.add(btCopy);
		this.add(btClear);
		this.add(btReset);
	}

}
