package program.drink.water;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {
    public static ImageIcon iconTitle1,iconSave;

    public Login() {
        initComponents();
        
        // setDefaultFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set JFrame close on click "X" button
        setTitle("Name!"); // Set name JFrame
        setLocationRelativeTo(null); //set this JFrame Center 
        
        // setIconJFrame
        iconTitle1 = new ImageIcon("D:\\Programing\\Java\\oopfinalproject63-Kawin101\\src\\program\\drink\\water\\Photo\\facekawin101.jpg");
        setIconImage(iconTitle1.getImage());
        
        //Set open&&close button
        cancel_button.setEnabled(true);
        delete_button.setEnabled(false);
        add_button.setEnabled(true);
        save_button.setEnabled(false);
        load_button.setEnabled(false);
        drink_button.setEnabled(false);
        welcome_button.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label2 = new javax.swing.JLabel();
        textField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        welcome_button = new javax.swing.JButton();
        drink_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        cancel_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        load_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setText("LastName:");

        textField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("  Name!");

        label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 255));
        label1.setText("์Name:");

        textField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText(": Please input your English Language.");

        welcome_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome_button.setForeground(new java.awt.Color(0, 153, 153));
        welcome_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/Welcome.jpg"))); // NOI18N
        welcome_button.setText("Welcome!");
        welcome_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcome_buttonActionPerformed(evt);
            }
        });

        drink_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        drink_button.setForeground(new java.awt.Color(102, 0, 102));
        drink_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/Drink small.jpg"))); // NOI18N
        drink_button.setText("Drink Water");
        drink_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_buttonActionPerformed(evt);
            }
        });

        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        textArea1.setRows(5);
        jScrollPane2.setViewportView(textArea1);

        cancel_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        add_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/Add.png"))); // NOI18N
        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        save_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/SaveS11.jpg"))); // NOI18N
        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        load_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        load_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/LoadL1.png"))); // NOI18N
        load_button.setText("Load");
        load_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_buttonActionPerformed(evt);
            }
        });

        delete_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textField1)
                                        .addComponent(textField2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save_button)
                                    .addComponent(load_button))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancel_button)
                                    .addComponent(delete_button))
                                .addGap(78, 78, 78))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcome_button, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drink_button, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit_button)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_button, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(save_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(load_button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel4)))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drink_button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcome_button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void drink_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_buttonActionPerformed
    // Close window before
        this.dispose();
    // Create obj class Drink_Water
        Drink_Water dw = new Drink_Water();
        dw.setVisible(true);
    }//GEN-LAST:event_drink_buttonActionPerformed
    
    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
    // CancelButton
    // set Clear text in Textfield1&2
        textField1.setText("");
        textField2.setText(""); 
    }//GEN-LAST:event_cancel_buttonActionPerformed
    
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
    //AddButton
    //Set open&&close button
    cancel_button.setEnabled(false);
    delete_button.setEnabled(false);
    add_button.setEnabled(false);
    save_button.setEnabled(true);
    load_button.setEnabled(false);
    drink_button.setEnabled(false);
    welcome_button.setEnabled(false);

    // input name,LastName
    String name = textField1.getText();
    String LastName = textField2.getText();
    // Create variable keep name&lasname 
    String display = "Name : " + name + " \nLastName : " + LastName;
    //Show output on textArea1
    String output = textArea1.getText();
    
    // loop check in textfield1&2 not null?    
    if(output.length() != 0) 
    {
        display = output + "\r\n" + display;
    }
    textArea1.setText(display);
    clearText();
    }
    // Create Method cleartext in TextField1&2
    private void clearText() {
        textField1.setText("");
        textField2.setText(""); 
    }//GEN-LAST:event_add_buttonActionPerformed

    private void welcome_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcome_buttonActionPerformed
    // Close window before
        this.dispose();
    // Create obj class In_Login
        In_Login Ln = new In_Login();
        Ln.setVisible(true);
    }//GEN-LAST:event_welcome_buttonActionPerformed
    
    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
    //SaveButton
    //set open&&close button
    cancel_button.setEnabled(false);
    delete_button.setEnabled(true);
    add_button.setEnabled(false);
    save_button.setEnabled(false);
    load_button.setEnabled(false);
    drink_button.setEnabled(false);
    welcome_button.setEnabled(false);
    
    try {
        FileWriter fileWriter = new FileWriter("datagui.csv"); //CreateFile
        String data = textArea1.getText(); //getData to Variable
        fileWriter.append(data);
        fileWriter.flush();
        fileWriter.close();
    }catch (Exception b) {
        b.getMessage();
    }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void load_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_buttonActionPerformed
    //loadButton
    //set open&&close button
    cancel_button.setEnabled(true);
    delete_button.setEnabled(false);
    add_button.setEnabled(true);
    save_button.setEnabled(false);
    load_button.setEnabled(false);
    drink_button.setEnabled(true);
    welcome_button.setEnabled(true);
    // Set variable keep file csv
    String file = "datagui.csv"; //getFileToVariable
    try{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String Data_Text = ""; //CreateVariable to Data
        String display_Text = ""; //CreateVariable to display
        while ((Data_Text = reader.readLine()) != null) //loop check Variable=null right?
        {
            display_Text += Data_Text + "\n"; //add getData to showText
        }
        textArea1.setText(display_Text);
        reader.close(); // EndReader
    } catch (Exception e) {
        e.getMessage();
    }
    }//GEN-LAST:event_load_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
    //DeleteButton
    //set open&&close button
    cancel_button.setEnabled(false);
    delete_button.setEnabled(false);
    add_button.setEnabled(false);
    save_button.setEnabled(false);
    load_button.setEnabled(true);
    drink_button.setEnabled(false);
    welcome_button.setEnabled(false);            
    textArea1.setText("");
              
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
    //ExitButon
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
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
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(() -> {
//            new Login().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add_button;
    public javax.swing.JButton cancel_button;
    public javax.swing.JButton delete_button;
    private javax.swing.JButton drink_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    public javax.swing.JButton load_button;
    public javax.swing.JButton save_button;
    private javax.swing.JTextArea textArea1;
    public javax.swing.JTextField textField1;
    public javax.swing.JTextField textField2;
    private javax.swing.JButton welcome_button;
    // End of variables declaration//GEN-END:variables
}
