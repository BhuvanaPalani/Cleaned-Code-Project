
public class Press {

    double x, y;
    int c;
    boolean clear = true;
    IFrameComponents ifc;
    public Press(IFrameComponents ifc) {
        this.ifc = ifc;
        off();
    }

    public void connectButton() {
    	ifc.getRb2().addActionListener(this::onPower);
       
        ifc.getRb1().addActionListener(this::setOn);
      
        ifc.getBack().addActionListener(this::backButton);
       
        ifc.getClear().addActionListener(this::pressClear);
        
        ifc.getPlus().addActionListener(this::pressPlusButton);
        
        ifc.getSeven().addActionListener(this::press7);
       
        ifc.getEight().addActionListener(this::press8);
        
        ifc.getNine().addActionListener(this::press9);
        
        ifc.getFour().addActionListener(this::press4);
        
        ifc.getFive().addActionListener(this::press5);
        
        ifc.getSix().addActionListener(this::press6);
        
        ifc.getOne().addActionListener(this::press1);
        
        ifc.getTwo().addActionListener(this::press2);
        
        ifc.getThree().addActionListener(this::press3);
        
        ifc.getMinus().addActionListener(this::pressMinusButton);
       
        ifc.getMultiply().addActionListener(this::pressMultiplyButton);
        
        ifc.getDivision().addActionListener(this::pressDivideButton);
        
        ifc.getDot().addActionListener(this::pressDotButton);
        
        ifc.getZero().addActionListener(this::pressZero);
        
        
        ifc.getCalculate().addActionListener(this::pressCalculateButton);
       

    }

    public void math() {
        System.out.println(ifc.getTextField().getText());
        
    
    
        switch(c) {
        
         case 1:
        
            y = CalculatorFunctions.addition(x, ifc);
         break;
         
         case 2:
             
             y = CalculatorFunctions.substraction(x, ifc);
             break;
            
          case 3:
            
        	  y = CalculatorFunctions.multiplication(x, ifc);
              break;
              
           case 4:
                    
               y = CalculatorFunctions.division(x, ifc);
              break;
              
           
            	  
        }
                
   System.out.println("=");
   System.out.println("" +y);
   System.out.println(); 
}
        protected void uTF(javax.swing.JButton button) {
        ifc.getTextField().setText(ifc.getTextField().getText() + button.getText());
        on();
    }

    public void enable() {
        ifc.getTextField().setEnabled(true);
        ifc.getBack().setEnabled(true);
        ifc.getClear().setEnabled(true);
        ifc.getPlus().setEnabled(true);
        ifc.getSeven().setEnabled(true);
        ifc.getEight().setEnabled(true);
        ifc.getNine().setEnabled(true);
        ifc.getFour().setEnabled(true);
        ifc.getFive().setEnabled(true);
        ifc.getSix().setEnabled(true);
        ifc.getOne().setEnabled(true);
        ifc.getTwo().setEnabled(true);
        ifc.getThree().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMultiply().setEnabled(true);
        ifc.getDivision().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getZero().setEnabled(true);
        ifc.getCalculate().setEnabled(true);
        ifc.getRb1().setEnabled(false);
        ifc.getRb2().setEnabled(true);
    }

    public void disable() {
        ifc.getTextField().setEnabled(false);
        ifc.getBack().setEnabled(false);
        ifc.getClear().setEnabled(false);
        ifc.getPlus().setEnabled(false);
        ifc.getSeven().setEnabled(false);
        ifc.getEight().setEnabled(false);
        ifc.getNine().setEnabled(false);
        ifc.getFour().setEnabled(false);
        ifc.getFive().setEnabled(false);
        ifc.getSix().setEnabled(false);
        ifc.getOne().setEnabled(false);
        ifc.getTwo().setEnabled(false);
        ifc.getThree().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMultiply().setEnabled(false);
        ifc.getDivision().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getZero().setEnabled(false);
        ifc.getCalculate().setEnabled(false);
        ifc.getRb1().setEnabled(true);
        ifc.getRb2().setEnabled(false);
    }

    public void off() {
        ifc.getBack().setEnabled(false);
        ifc.getPlus().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMultiply().setEnabled(false);
        ifc.getDivision().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getCalculate().setEnabled(false);
    }

    public void on() {
        ifc.getBack().setEnabled(true);
        ifc.getPlus().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMultiply().setEnabled(true);
        ifc.getDivision().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getCalculate().setEnabled(true);
    }

    protected void pressMultiplyButton(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(ifc.getTextField().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Multiplication By Zero");
            off();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getTextField().getText());
            System.out.println("*");
            clear = false;
            x = Double.parseDouble(ifc.getTextField().getText());
            c = 3;
            ifc.getTextField().setText("");
            ifc.getLabel().setText(x + "*");
        }
    }

    protected void press1(java.awt.event.ActionEvent evt) {
        uTF(ifc.getOne());
    }

    protected void press2(java.awt.event.ActionEvent evt) {
        uTF(ifc.getTwo());
    }

    protected void press3(java.awt.event.ActionEvent evt) {
        uTF(ifc.getThree());
    }

    protected void press4(java.awt.event.ActionEvent evt) {
        uTF(ifc.getFour());
    }

    protected void press5(java.awt.event.ActionEvent evt) {
        uTF(ifc.getFive());
    }

    protected void press6(java.awt.event.ActionEvent evt) {
        uTF(ifc.getSix());
    }

    protected void press7(java.awt.event.ActionEvent evt) {
        uTF(ifc.getSeven());
    }

    protected void press8(java.awt.event.ActionEvent evt) {
        uTF(ifc.getEight());
    }

    protected void press9(java.awt.event.ActionEvent evt) {
        uTF(ifc.getNine());
    }

    protected void pressZero(java.awt.event.ActionEvent evt) {
        uTF(ifc.getZero());
    }

    protected void pressPlusButton(java.awt.event.ActionEvent evt) {

        if (!clear) {
            math();
        }
        System.out.println(ifc.getTextField().getText());
        System.out.println("+");
        clear = false;
        x = Double.parseDouble(ifc.getTextField().getText());
        c = 1;
        ifc.getTextField().setText("");
        ifc.getLabel().setText(x + "+");
    }

    protected void pressMinusButton(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(ifc.getTextField().getText());
        System.out.println("-");
        clear = false;
        x = Double.parseDouble(ifc.getTextField().getText());
        c = 2;
        ifc.getTextField().setText("");
        ifc.getLabel().setText(x + "-");
    }

    protected void pressDivideButton(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(ifc.getTextField().getText()) == 0.0) {
            System.out.println("Division By Zero");
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Division By Zero");
            off();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getTextField().getText());
            System.out.println("/");
            clear = false;
            x = Double.parseDouble(ifc.getTextField().getText());
            c = 4;
            ifc.getTextField().setText("");
            ifc.getLabel().setText(x + "/");

        }

    }

    protected void pressDotButton(java.awt.event.ActionEvent evt) {
        uTF(ifc.getDot());
    }

    protected void pressClear(java.awt.event.ActionEvent evt) {
        ifc.getTextField().setText("");
        off();
    }

    protected void setOn(java.awt.event.ActionEvent evt) {
        enable();
    }

    protected void onPower(java.awt.event.ActionEvent evt) {
        disable();
    }

    protected void backButton(java.awt.event.ActionEvent evt) {
        int length = ifc.getTextField().getText().length();
        int number = ifc.getTextField().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(ifc.getTextField().getText());
            back.deleteCharAt(number);
            store = back.toString();
            ifc.getTextField().setText(store);
        }
        if (ifc.getTextField().getText().length() <= 0) {
            off();
        }
    }

    protected void pressCalculateButton(java.awt.event.ActionEvent evt) {
        math();
        clear = true;
        ifc.getLabel().setText("");
    }
}
