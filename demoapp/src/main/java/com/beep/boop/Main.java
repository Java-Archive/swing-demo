package com.beep.boop;

import java.awt.*;

import javax.swing.*;

public class Main {
  public static JPanel mainSpace;


  // junit will start the Main App
      // -> invokeLater

  // add the created custom component to JFrame
    // instantiate the generic JFrame instance
    // instantiate the custom component -> abtract methd createComponent(){ /* implemented*/ }
    // add it to generic jFrame

  // run the robot for the test itself
  // shutdown the app,

  // -- until all test methods are done inside a class
  // -- until all test classes are done



  private static void createAndShowGUI() {

    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //Add the ubiquitous "Hello World" label.
//        JLabel label = new JLabel("Hello World");
    frame.getContentPane().setLayout(new BorderLayout());
    frame.getContentPane().add(new LeftMenu() , BorderLayout.WEST);
    mainSpace = new JPanel();
    mainSpace.setBackground(new Color(154 , 154 , 254));
    mainSpace.setLayout(new BorderLayout());

    frame.getContentPane().add(mainSpace , BorderLayout.CENTER);

    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }


  // only one UI thread
  // start headless swing ? ->
  public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }


}
