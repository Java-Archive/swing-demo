package junit.com.beep.boop;

import org.vaadin.testbench.MyViewPageObject;

public class MyViewTest  {

//  @Override
//  public MyView createInstance() {
//    return new MyView();
//  }


  //@SwingTest -> start the life cycle
  // based on the dependency ->
  //      Swing or Vaadin or JavaFX would be instantiated
  public void doTest01(MyViewPageObject po) {
    // test code ..
    Box b = po.comboBox();
    b.addValue("ddd");
    po.btnClick();
    //Assert

  }

//  public void doTestVaadin(MyViewPageObject po){
//
//    // test code ..
//
//  }

}
