package com.beep.boop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LeftMenu extends JPanel {

  JButton btn_hi = new JButton("Hi");
  JButton btn_my = new JButton("My");
  JButton btn_name = new JButton("Name");
  JButton btn_is = new JButton("Is");
  JButton btn_svenorben = new JButton("Sven or Ben");

  public LeftMenu() {
    this.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbc.fill = GridBagConstraints.HORIZONTAL;

    add(btn_hi , gbc);
    add(btn_my , gbc);
    add(btn_name , gbc);
    add(btn_is , gbc);
    add(btn_svenorben , gbc);

    btn_hi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Main.mainSpace.removeAll();
        Main.mainSpace.add(new HiView() , BorderLayout.CENTER);
        Main.mainSpace.repaint();
      }
    });
    btn_my.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Main.mainSpace.removeAll();
          Main.mainSpace.add(new MyView() , BorderLayout.CENTER);
          Main.mainSpace.repaint();
        }
      });
    btn_name.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Main.mainSpace.removeAll();
          Main.mainSpace.add(new NameView() , BorderLayout.CENTER);
          Main.mainSpace.repaint();
        }
      });
    btn_is.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Main.mainSpace.removeAll();
          Main.mainSpace.repaint();
        }
      });
    btn_svenorben.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Main.mainSpace.removeAll();
          Main.mainSpace.repaint();
        }
      });

  }
}
