/*
Created by Conner Recoskie
June 19th, 2022
This program accepts the CAD currency value, it then calculates and returns that
value in USD, Euro, and the YEN currency. This program also accepts the EST
value, it then calculates and returns that time in PST, AST, and the CST time
zone. Additionally the program accepts the kilogram value, it then calculates 
and returns that value in pounds. The program accepts a "foot" value and then
calculates and returns that value in meters. 
*/

public class FrmConvert extends javax.swing.JFrame {
    
    /*
    toUsd
    This method recives a cad value from the user and it then calculates and 
    returns that value in USD currency.
    Parameters: double
    Returns: double
    */
    
    public static double toUsd (double cadValue)
    {
        double usdValue;
        
        usdValue = cadValue * 0.78;
        
        return (usdValue);
    }
    
    /*
    toEuro
    This method recives a cad value from the user and it then calculates and 
    returns that value in Euro currency.
    Parameters: double
    Returns: double
    */
    public static double toEuro (double cadValue)
    {
        double euroValue;
        
        euroValue = cadValue * 0.73;
        
        return (euroValue);
    }
    
    /*
    toYen
    This method recives a cad value from the user and it then calculates and 
    returns that value in YEN currency.
    Parameters: double
    Returns: double
    */
    public static double toYen (double cadValue)
    {
        double yenValue;
        
        yenValue = cadValue * 104.22;
        
        return yenValue;
    }
    
    /*
    round
    This method recives a curreny value from the user and it then calculates
    and returns that value rounded.
    Parameters: double
    Returns: double
    */
    public static double round (double currency)
    {
        double currencyRounded;
        
        currencyRounded = currency * 100;
        currencyRounded = Math.round(currencyRounded);
        currencyRounded = currencyRounded / 100;
        
        return (currencyRounded);
    }
    
    /*
    toPounds
    This method recives a kg value from the user, it then calculates and 
    returns that value in pounds.
    Parameters: double
    Returns: double
    */
    public static double toPounds (double kg)
    {
        double poundsValue;
        poundsValue = kg * 2.205;
        
        return (poundsValue);
    }
    
    /*
    toMeters
    This method recives a foot value from the user, it then calculates and 
    returns that value in meters.
    Parameters: double
    Returns: double
    */
    public static double toMeters (double ft)
    {
        double metersValue;
        metersValue = ft / 3.28084;
        return (metersValue);
    }
    
    
    public FrmConvert() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCad = new javax.swing.JLabel();
        txtCadValue = new javax.swing.JTextField();
        lblUsd = new javax.swing.JLabel();
        lblEuro = new javax.swing.JLabel();
        lblYen = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblPst = new javax.swing.JLabel();
        lblAst = new javax.swing.JLabel();
        lblCst = new javax.swing.JLabel();
        lblUsdAmount = new javax.swing.JLabel();
        lblEuroAmount = new javax.swing.JLabel();
        lblYenAmount = new javax.swing.JLabel();
        lblTimeInPst = new javax.swing.JLabel();
        lblTimeInAst = new javax.swing.JLabel();
        lblTimeInCst = new javax.swing.JLabel();
        txtEstValue = new javax.swing.JTextField();
        lblKilogram = new javax.swing.JLabel();
        txtKilogramValue = new javax.swing.JTextField();
        lblPounds = new javax.swing.JLabel();
        lblFeet = new javax.swing.JLabel();
        txtFootValue = new javax.swing.JTextField();
        lblMeters = new javax.swing.JLabel();
        lblFirstSide = new javax.swing.JLabel();
        lblSecondSide = new javax.swing.JLabel();
        lblAmountInPounds = new javax.swing.JLabel();
        lblAmountInMeters = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("The Ultimate Quick Converter");

        lblCad.setForeground(new java.awt.Color(255, 0, 0));
        lblCad.setText("Please enter the CAD amount you want to convert:");

        lblUsd.setForeground(new java.awt.Color(0, 0, 0));
        lblUsd.setText("Amount in USD:");

        lblEuro.setForeground(new java.awt.Color(0, 0, 0));
        lblEuro.setText("Amount in Euro:");

        lblYen.setForeground(new java.awt.Color(0, 0, 0));
        lblYen.setText("Amount in YEN:");

        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("Please enter the EST hour of the day (ex. 12):");

        lblPst.setForeground(new java.awt.Color(0, 0, 0));
        lblPst.setText("Time in PST:");

        lblAst.setForeground(new java.awt.Color(0, 0, 0));
        lblAst.setText("Time in AST:");

        lblCst.setForeground(new java.awt.Color(0, 0, 0));
        lblCst.setText("Time in CST:");

        lblUsdAmount.setForeground(new java.awt.Color(0, 0, 0));
        lblUsdAmount.setText("-");

        lblEuroAmount.setForeground(new java.awt.Color(0, 0, 0));
        lblEuroAmount.setText("-");

        lblYenAmount.setForeground(new java.awt.Color(0, 0, 0));
        lblYenAmount.setText("-");

        lblTimeInPst.setForeground(new java.awt.Color(0, 0, 0));
        lblTimeInPst.setText("-");

        lblTimeInAst.setForeground(new java.awt.Color(0, 0, 0));
        lblTimeInAst.setText("-");

        lblTimeInCst.setForeground(new java.awt.Color(0, 0, 0));
        lblTimeInCst.setText("-");

        lblKilogram.setForeground(new java.awt.Color(255, 0, 0));
        lblKilogram.setText("Please enter the amount of kilograms you want to convert:");

        lblPounds.setForeground(new java.awt.Color(0, 0, 0));
        lblPounds.setText("Amount in pounds:");

        lblFeet.setForeground(new java.awt.Color(255, 0, 0));
        lblFeet.setText("Please enter the amount of feet you want to convert:");

        lblMeters.setForeground(new java.awt.Color(0, 0, 0));
        lblMeters.setText("Amount in Meters:");

        lblFirstSide.setForeground(new java.awt.Color(0, 0, 0));
        lblFirstSide.setText("Convert CAD Currency and EST time zone");

        lblSecondSide.setForeground(new java.awt.Color(0, 0, 0));
        lblSecondSide.setText("Convert Unit Measurements ");

        lblAmountInPounds.setForeground(new java.awt.Color(0, 0, 0));
        lblAmountInPounds.setText("-");

        lblAmountInMeters.setForeground(new java.awt.Color(0, 0, 0));
        lblAmountInMeters.setText("-");

        btnConvert.setBackground(new java.awt.Color(153, 153, 153));
        btnConvert.setForeground(new java.awt.Color(255, 0, 0));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblFirstSide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSecondSide)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblUsd)
                                        .addGap(60, 60, 60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblYen)
                                            .addComponent(lblEuro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEuroAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblYenAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsdAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCad)
                                .addGap(18, 18, 18)
                                .addComponent(txtCadValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPounds)
                                        .addGap(31, 31, 31)
                                        .addComponent(lblAmountInPounds, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKilogram)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKilogramValue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMeters)
                                        .addGap(42, 42, 42)
                                        .addComponent(lblAmountInMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFeet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFootValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCst, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblPst)
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTimeInAst, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(lblTimeInCst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTimeInPst, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAst, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstSide)
                            .addComponent(lblSecondSide))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCad)
                                .addComponent(txtCadValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblKilogram)
                                .addComponent(txtKilogramValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsd)
                            .addComponent(lblUsdAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPounds)
                                .addComponent(lblAmountInPounds))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEuro)
                                .addComponent(lblEuroAmount))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYen)
                    .addComponent(lblYenAmount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFeet)
                    .addComponent(txtFootValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPst)
                    .addComponent(lblTimeInPst)
                    .addComponent(lblMeters)
                    .addComponent(lblAmountInMeters))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAst)
                            .addComponent(lblTimeInAst))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimeInCst)
                            .addComponent(lblCst)))
                    .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        
        // Declaring int variables to hold the currency values
        double cadValue = 0;
        double usdValue;
        double euroValue;
        double yenValue;
        
        // Declaring int variables to hold the time values
        int est = 0;
        int pst = 0;
        int ast = 0;
        int cst = 0;
        
        // Declaring double variables to hold the unit values
        double kg = 0;
        double pounds;
        double ft = 0;
        double meters;
        
        // Declaring boolean variables that will be used in error checking
        boolean value1 = false;
        boolean value2 = false;
        boolean value3 = false;
        boolean value4 = false;
        
        try
        {   
            // Getting user input and stroring it in a variable
            cadValue = Double.parseDouble(txtCadValue.getText());
            value1 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            lblUsdAmount.setText("Error, incorrect input!");
        }
        
        // Passing currency values to methods, storing the result in a variable
        usdValue = toUsd(cadValue);
        usdValue = round(usdValue);
        
        euroValue = toEuro(cadValue);
        euroValue = round(euroValue);
        
        yenValue = toYen(cadValue);
        yenValue = round(yenValue);
        
        // Outputting currency's to GUI, if the correct data type is entered
        if (value1)
        {
            lblUsdAmount.setText(String.valueOf(usdValue) + " USD");

            lblEuroAmount.setText(String.valueOf(euroValue) + " Euro");

            lblYenAmount.setText(String.valueOf(yenValue) + " Yen");
        }
        
        try
        {   
            // Getting user input and stroring it in a variable
            est = Integer.parseInt(txtEstValue.getText());
            value2 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            lblTimeInPst.setText("Error, incorrect input!");
        }
        
        // Declaring switch statment to get correct PST, based on the user input
        switch (est)
        {
            case (1):
                pst = 10;
                break;
                
            case (2):
                pst = 11;
                break;
            
            case (3):
                pst = 12;
                break;
            
            case (4):
                pst = 1;
                break;
            
            case (5):
                pst = 2;
                break;
            
            case (6):
                pst = 3;
                break;
            
            case (7):
                pst = 4;
                break;
            
            case (8):
                pst = 5;
                break;
            
            case (9):
                pst = 6;
                break;
            
            case (10):
                pst = 7;
                break;
            
            case (11):
                pst = 8;
                break;
            
            case (12):
                pst = (9);
                break; 
            
            default:
            lblTimeInPst.setText("Please enter a diffrent value.");
            
        }
        
        // Declaring switch statment to get correct AST, based on the user input
        switch (est)
        {
            case (1):
                ast = 2;
                break;
            
            case (2):
                ast = 3;
                break;
            
            case (3):
                ast = 4;
                break;
            
            case (4):
                ast = 5;
                break;
            
            case (5):
                ast = 6;
                break;
            
            case (6):
                ast = 7;
                break;
            
            case (7):
                ast = 8;
                break;
            
            case (8):
                ast = 9;
                break;
            
            case (9):
                ast = 10;
                break;
            
            case (10):
                ast = 11;
                break;
           
            case (11):
                ast = 12;
                break;
            
            case (12):
                ast = 1;
                break;
            
            default:
                lblTimeInAst.setText("Please enter a diffrent value.");
        }
        
        // Declaring switch statment to get correct CST, based on the user input
        switch (est)
        {
            case (1):
            cst = 12;
            break; 
            
            case (2):
            cst = 1;
            break;
            
            case (3):
            cst = 2;
            break;
            
            case (4):
            cst = 3;
            break;
            
            case (5):
            cst = 4;
            break;
            
            case (6):
            cst = 5;
            break;
            
            case (7):
            cst = 6;
            break;
            
            case (8):
            cst = 7;
            break;
            
            case (9):
            cst = 8;
            break;
            
            case (10):
            cst = 9;
            break;
            
            case (11):
            cst = 10;
            break;
            
            case (12):
            cst = 11;
            break;
            
            default:
            lblTimeInCst.setText("Please enter a diffrent value.");
        } 
        
        // Outputting times to GUI if the correct data type was entered
        if (value2)
        {
            lblTimeInPst.setText(String.valueOf(pst) + ":00 PST");
            lblTimeInAst.setText(String.valueOf(ast) + ":00 AST");
            lblTimeInCst.setText(String.valueOf(cst) + ":00 CST");
        }
        
        try
        {   
            // Getting user input and stroring it in a variable
            kg = Double.parseDouble(txtKilogramValue.getText());
            value3 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            lblAmountInPounds.setText("Error, incorrect value!");
        }
        
        // Passing pounds value to methods, storing the result in a variable
        pounds = toPounds(kg);
        
        pounds = round(pounds);
        
        // Outputting amount to GUI if the correct data type was entered
        if (value3)
        {
            lblAmountInPounds.setText(String.valueOf(pounds) + " lbs");
        }
        
        try
        {   
            // Getting user input and stroring it in a variable
            ft = Double.parseDouble(txtFootValue.getText());
            value4 = true;
        } 
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            lblAmountInMeters.setText("Error, incorrect value!");
        }
            
        // Passing meters value to methods, storing the result in a variable
        meters = toMeters(ft);
        
        meters = round(meters);
        
        // Outputting amount to GUI if the correct data type was entered
        if (value4)
        {
            lblAmountInMeters.setText(String.valueOf(meters) + " m");
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConvert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel lblAmountInMeters;
    private javax.swing.JLabel lblAmountInPounds;
    private javax.swing.JLabel lblAst;
    private javax.swing.JLabel lblCad;
    private javax.swing.JLabel lblCst;
    private javax.swing.JLabel lblEuro;
    private javax.swing.JLabel lblEuroAmount;
    private javax.swing.JLabel lblFeet;
    private javax.swing.JLabel lblFirstSide;
    private javax.swing.JLabel lblKilogram;
    private javax.swing.JLabel lblMeters;
    private javax.swing.JLabel lblPounds;
    private javax.swing.JLabel lblPst;
    private javax.swing.JLabel lblSecondSide;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeInAst;
    private javax.swing.JLabel lblTimeInCst;
    private javax.swing.JLabel lblTimeInPst;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsd;
    private javax.swing.JLabel lblUsdAmount;
    private javax.swing.JLabel lblYen;
    private javax.swing.JLabel lblYenAmount;
    private javax.swing.JTextField txtCadValue;
    private javax.swing.JTextField txtEstValue;
    private javax.swing.JTextField txtFootValue;
    private javax.swing.JTextField txtKilogramValue;
    // End of variables declaration//GEN-END:variables
}
