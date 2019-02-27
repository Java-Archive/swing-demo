package com.beep.boop.component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyComponent extends JPanel {

  private final Button myButton = new Button();
  private final TextField myTextfieldA = new TextField();
  private final TextField myTextfieldB = new TextField();

  public MyComponent() {
    myButton.setLabel("click me");
    myButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        myTextfieldB.setText(myTextfieldA.getText());
      }
    });

    add(myButton);
    add(myTextfieldA);
    add(myTextfieldB);
  }


  public Button myButton(){ return this.myButton; }
  public TextField myTextFieldA() { return this.myTextfieldA; }
  public TextField myTextFieldB() { return this.myTextfieldB; }


  //
  public void setTextA(String txt){ this.myTextfieldA.setText(txt);}
  public void setTextB(String txt){ this.myTextfieldB.setText(txt);}
//  public void click(){ this.myButton.}

}
