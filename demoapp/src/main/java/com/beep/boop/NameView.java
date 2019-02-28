package com.beep.boop;

import javax.swing.JPanel;

public class NameView extends GenericView {

	public NameView() {
		this.setLayout(null);
		this.setSize(Main.mainSpace.getSize());
		JButton btCopy = new JButton("Copy");
		JButton btReset = new JButton("Reset");
		JButton btClear = new JButton("Clear");

		JTextField tfIn = new JTextField("");
		jcb1.setBounds(10, 10, 200, 50);

		JCheckBox jcb2 = new JCheckBox("With Garlic");
		jcb2.setBounds(10, 40, 200, 50);

		JCheckBox jcb3 = new JCheckBox("With Cheese");
		jcb3.setBounds(10, 70, 200, 50);


		this.add(jcb1);
		this.add(jcb2);
		this.add(jcb3);
	}

}
