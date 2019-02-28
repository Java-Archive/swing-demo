package com.beep.boop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameView extends GenericView {

	protected NameModel nm;
	protected NameController nc;
	final JTextField tfIn;
	final JTextField tfOut;

	public NameView() {
		this.setLayout(null);
		this.setSize(Main.mainSpace.getSize());

		this.nm = new NameModel(this);
		this.nc = new NameController(this, nm);


		tfIn = new JTextField();
		tfOut = new JTextField();
		tfOut.setEditable(false);
		JButton btCopy = new JButton("Copy");
		JButton btReset = new JButton("Reset");
		JButton btClear = new JButton("Clear");
		btCopy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nc.copy(tfIn.getText());
			}
		});
		btReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nc.reset();
			}
		});
		btClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nc.clear();
			}
		});

		tfIn.setBounds(10, 10, 200, 40);
		tfOut.setBounds(210, 10, 200, 40);
		btCopy.setBounds(110, 60, 100, 40);
		btReset.setBounds(210, 60, 100, 40);
		btClear.setBounds(310, 60, 100, 40);

		this.add(tfIn);
		this.add(tfOut);
		this.add(btCopy);
		this.add(btClear);
		this.add(btReset);
	}

	@Override
	public void refresh() {
		tfIn.setText(this.nm.getInput());
		tfOut.setText(this.nm.getOutput());
		
		
	}

}
