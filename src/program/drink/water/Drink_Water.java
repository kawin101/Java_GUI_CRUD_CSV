package program.drink.water;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static program.drink.water.Login.iconTitle1;

public class Drink_Water extends javax.swing.JFrame {

    public Drink_Water() {
        initComponents();
        
        // setDefaultFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Drink Water!");
        setLocationRelativeTo(null); //set this JFrame Center 
        
        // setIconJFrame
        iconTitle1 = new ImageIcon("D:\\Programing\\Java\\oopfinalproject63-Kawin101\\src\\program\\drink\\water\\Photo\\Drink small.jpg");
        setIconImage(iconTitle1.getImage());
        
        //set open&&close button
        welcome_button.setEnabled(false);
        result_button.setEnabled(true);
        delete_button.setEnabled(false);
        name_button.setEnabled(false);
    }

////////////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        result_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name_button = new javax.swing.JButton();
        welcome_button = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Age:");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Drink Water!");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Age :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Wake Up Time :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Weight :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("year old.");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        result_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/SaveS11.jpg"))); // NOI18N
        result_button.setText("Result");
        result_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_buttonActionPerformed(evt);
            }
        });

        delete_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("kg.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("ืn.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Please don't input decimal. (Ex. 00:00 - 23:00)");

        name_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name_button.setForeground(new java.awt.Color(0, 0, 255));
        name_button.setText("Name!");
        name_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_buttonActionPerformed(evt);
            }
        });

        welcome_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome_button.setForeground(new java.awt.Color(0, 153, 153));
        welcome_button.setText("Welcome!");
        welcome_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcome_buttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Please input Age and Weight an integer.");

        exit_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_button)
                            .addComponent(result_button))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcome_button)
                            .addComponent(name_button))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_button)
                            .addComponent(result_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcome_button)
                            .addComponent(delete_button)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void result_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_buttonActionPerformed
    // Completed Button
        //set open&&close button
        welcome_button.setEnabled(true);
        result_button.setEnabled(false);
        delete_button.setEnabled(true);
        name_button.setEnabled(true);
        
        //input name,lastname,Email,age
        int age = Integer.parseInt(jTextField1.getText());
        // input Weight
        int Weight = Integer.parseInt(jTextField3.getText());
        Weight = 33*Weight; // Calculate should drink water number CC., liter, Cup per day.
        // input WakeUpTime
        String sleepTime = jTextField2.getText();
                switch (sleepTime) {
                    case "00:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break;
                    case "01:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break;
                    case "02:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break; 
                    case "03:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break;
                    case "04:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break;
                    case "05:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 00:00 - 6:00");
                        break;    
                    case "06:00": //Morning
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 06:00 - 8:00");
                        break;
                    case "07:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 06:00 - 8:00");
                        break;
                    case "08:00": 
                        jTextArea1.setText("Drink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 06:00 - 8:00");
                        break;
                    case "09:00": 
                        jTextArea1.setText("Drink Water : 2 Cup (500 C.C.)"
                                + "\nTime : 09:00 - 12:00");
                        break;
                    case "10:00": 
                        jTextArea1.setText("Drink Water : 2 Cup (500 C.C.)"
                                + "\nTime : 09:00 - 12:00");
                        break;
                    case "11:00": 
                        jTextArea1.setText("Drink Water : 2 Cup (500 C.C.)"
                                + "\nTime : 09:00 - 12:00");
                        break;
                    case "12:00": 
                        jTextArea1.setText("Drink Water : 2 Cup (500 C.C.)"
                                + "\nTime : 09:00 - 12:00");
                        break;     
                    case "13:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "14:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "15:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "16:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "17:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "18:00": //Afternoon
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 13:00 - 18:00");
                        break;
                    case "19:00":
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 19:00 - 20:00");
                        break;
                    case "20:00":
                        jTextArea1.setText("Drink Water : 3 Cup (750 C.C.)"
                                + "\nTime : 19:00 - 20:00");
                        break;    
                    case "21:00":
                        jTextArea1.setText("Before Sleeping "+"\nDrink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 21:00 - 23:00");
                        break;
                    case "22:00": //before sleep
                        jTextArea1.setText("Before Sleeping "+"\nDrink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 21:00 - 23:00");
                        break;
                    case "23:00": //before sleep
                        jTextArea1.setText("Before Sleeping "+"\nDrink Water : 1 Cup (250 C.C.)"
                                + "\nTime : 21:00 - 23:00");
                        break;     
                    default:
                        jTextArea1.setText("This time, you don't need to drink water."
                                + "\n\t-->> Or try input time again!!!! <<--");
                        break;
                }
        // Create variable keep age&Weight        
        String display_tf4 = "\nAge : " + age + "\nWeight : "+ jTextField3.getText() 
                + "\n\nYou should drink water ("
                + Weight + " C.C.)"+ "\nOr "+ Weight/1000 
                + " liter. "+ "\nOr " + Weight/250 
                + " Cup per day!";
        // Show outputText on jTextArea1
        String outputText = jTextArea1.getText();
        
        //loop check in output not null 
        if (outputText.length() != 0) {
            display_tf4 = outputText + "\r\n" + display_tf4;}
        // Show data in display_tf4 on jTextArea1
        jTextArea1.setText(display_tf4);                 
    }//GEN-LAST:event_result_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // Delete Button
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        //setButtonDelete off
        welcome_button.setEnabled(false);
        result_button.setEnabled(true);
        delete_button.setEnabled(false);
        name_button.setEnabled(false);
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void name_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_buttonActionPerformed
        // Close window before
        this.dispose();
        // Create obj class Login
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_name_buttonActionPerformed

    private void welcome_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcome_buttonActionPerformed
        // Close window before
        this.dispose();
        // Create obj class In_Login
        In_Login inlogin = new In_Login();
        inlogin.setVisible(true);
    }//GEN-LAST:event_welcome_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
    //ExitButton
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Drink_Water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Drink_Water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Drink_Water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Drink_Water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Drink_Water().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton name_button;
    private javax.swing.JButton result_button;
    private javax.swing.JButton welcome_button;
    // End of variables declaration//GEN-END:variables
}
