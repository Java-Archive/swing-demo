package com.beep.boop;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;

public class MyView extends JPanel {

	public MyView() {
		this.setLayout(null);
		this.setSize(200,200);

		DefaultListModel lmm1 = new DefaultListModel();

		lmm1.addElement("Fish");
		lmm1.addElement("Fake");
		lmm1.addElement("Kadorto now");
		
		JList jlb1 = new JList();
		jlb1.setModel(lmm1);
		jlb1.setBounds(10, 10, 100, 50);
		
		
		this.add(jlb1);
	}
}
