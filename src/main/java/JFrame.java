public class JFrame extends javax.swing.JFrame {

    private IFrameComponents ifc;

    public JFrame() {
        ifc = new IFrameComponents();
        initComponents();
        Press ac = new Press(ifc);
        ac.connectButton();
        ifc.getRb1().setEnabled(false);
    }
    
    

//<editor-fold defaultstate="collapsed" desc="initComponents()">
    protected void initComponents() {
        /* 
            This is Auto-Generated code from a netbeans 
            JFrame Form that I, Linus has then changed names in
            and moved some code elsewhere.
        */
        ifc.setBg1(new javax.swing.ButtonGroup());
        ifc.setTextField(new javax.swing.JTextField());
        ifc.setRb1(new javax.swing.JRadioButton());
        ifc.setRb2(new javax.swing.JRadioButton());
        ifc.setBack(new javax.swing.JButton());
        ifc.setClear(new javax.swing.JButton());
        ifc.setPlus(new javax.swing.JButton());
        ifc.setSeven(new javax.swing.JButton());
        ifc.setEight(new javax.swing.JButton());
        ifc.setNine(new javax.swing.JButton());
        ifc.setFour(new javax.swing.JButton());
        ifc.setFive(new javax.swing.JButton());
        ifc.setSix(new javax.swing.JButton());
        ifc.setOne(new javax.swing.JButton());
        ifc.setTwo(new javax.swing.JButton());
        ifc.setThree(new javax.swing.JButton());
        ifc.setMinus(new javax.swing.JButton());
        ifc.setMultiply(new javax.swing.JButton());
        ifc.setDivision(new javax.swing.JButton());
        ifc.setDot(new javax.swing.JButton());
        ifc.setZero(new javax.swing.JButton());
        ifc.setCalculate(new javax.swing.JButton());
        ifc.setLabel(new javax.swing.JLabel());
        
        //Set program to end on closing window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Sets iframe above everything
        setAlwaysOnTop(true);
        //Sets name on window
        setTitle("projektJframe");
        setLocation(new java.awt.Point(500, 250));
        //Sets window to not resizeable
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        //Sets numbers test frame to not editable
        ifc.getTextField().setEditable(false);
        //Set Font
        ifc.getTextField().setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        ifc.getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ifc.getBg1().add(ifc.getRb1());
        //Set Font
        ifc.getRb1().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ifc.getRb1().setText("On");

        ifc.getBg1().add(ifc.getRb2());
        //Set Font
        ifc.getRb2().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ifc.getRb2().setText("Off");

        //Set Font
        ifc.getBack().setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ifc.getBack().setText("<--");

        //Set Font
        ifc.getClear().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getClear().setText("C");

        //Set Font
        ifc.getPlus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getPlus().setText("+");

        //Set Font
        ifc.getSeven().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getSeven().setText("7");

        //Set Font
        ifc.getEight().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getEight().setText("8");

        //Set Font
        ifc.getNine().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getNine().setText("9");

        //Set Font
        ifc.getFour().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getFour().setText("4");

        //Set Font
        ifc.getFive().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getFive().setText("5");

        //Set Font
        ifc.getSix().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getSix().setText("6");

        //Set Font
        ifc.getOne().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getOne().setText("1");

        //Set Font
        ifc.getTwo().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getTwo().setText("2");

        //Set Font
        ifc.getThree().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getThree().setText("3");

        //Set Font
        ifc.getMinus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getMinus().setText("-");

        //Set Font
        ifc.getMultiply().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getMultiply().setText("*");

        //Set Font
        ifc.getDivision().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getDivision().setText("/");

        //Set Font
        ifc.getDot().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getDot().setText(".");

        //Set Font
        ifc.getZero().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getZero().setText("0");

        //Set Font
        ifc.getCalculate().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ifc.getCalculate().setText("=");

        //Set Font
        ifc.getLabel().setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        //Set Font Color
        ifc.getLabel().setForeground(new java.awt.Color(255, 51, 51));
        ifc.getLabel().setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        // Set Empty text
        ifc.getLabel().setText(" ");

        
        //This sets upp the layout for the JFrame. Its autogenerated in the JFrame Form.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getTextField())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getRb1())
                                                                .addComponent(ifc.getRb2()))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getBack(), javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getClear(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getPlus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(ifc.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getCalculate(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getLabel())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ifc.getTextField(), javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getRb1())
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getRb2()))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getClear(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getPlus(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getBack(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ifc.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ifc.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ifc.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getCalculate(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }

}
