
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
import java.awt.Window;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class NewBookingFrame extends javax.swing.JFrame {
    MainMenuUI frame;

    /**
     * Creates new form NewBookingFrame
     */
    
    
    public NewBookingFrame(){
        initComponents();
    }
    public NewBookingFrame(MainMenuUI frame) {
        initComponents();
        this.frame= frame;
        this.setLocationRelativeTo(null);
        chkInBox.getDocument().addDocumentListener(new MyDocumentListener());
        chkOutBox.getDocument().addDocumentListener(new MyDocumentListener());
        ApartComboBox.setSelectedIndex(-1); 
    }
    
    class MyDocumentListener implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            ApartComboBox.setSelectedIndex(-1); 
            ApartComboBox.setEnabled(false);
            confirmBtn.setEnabled(false);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            ApartComboBox.setSelectedIndex(-1); 
            ApartComboBox.setEnabled(false);
            confirmBtn.setEnabled(false);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            ApartComboBox.setSelectedIndex(-1); 
            ApartComboBox.setEnabled(false);
            confirmBtn.setEnabled(false);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        lastNameBox = new javax.swing.JTextField();
        addressBox = new javax.swing.JTextField();
        postCodeBox = new javax.swing.JTextField();
        numberBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chkInBox = new javax.swing.JTextField();
        chkOutBox = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        chkApartmentBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ApartComboBox = new javax.swing.JComboBox<>();
        retrieveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Booking");

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Address");

        jLabel4.setText("Postcode");

        jLabel5.setText("Phone Number");

        addressBox.setToolTipText("");
        addressBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressBoxActionPerformed(evt);
            }
        });

        postCodeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeBoxActionPerformed(evt);
            }
        });

        numberBox.setToolTipText("");

        jLabel6.setText("Enter Check-In and Check-Out Dates to See Available Apartments (YYYY-MM-DD)");

        jLabel8.setText("Check-In Date");

        jLabel9.setText("Check-Out Date");

        chkInBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInBoxActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.setMaximumSize(new java.awt.Dimension(110, 48));
        confirmBtn.setMinimumSize(new java.awt.Dimension(110, 48));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        chkApartmentBtn.setText("Check Rooms");
        chkApartmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApartmentBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Rooms Available");

        ApartComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ApartComboBox.setEnabled(false);
        ApartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApartComboBoxActionPerformed(evt);
            }
        });

        retrieveBtn.setText("Retrieve Details");
        retrieveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameBox)
                    .addComponent(lastNameBox)
                    .addComponent(addressBox)
                    .addComponent(postCodeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(retrieveBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(514, 514, 514))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkOutBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkInBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ApartComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chkApartmentBtn)
                                .addGap(170, 170, 170))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(chkInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOutBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(addressBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(postCodeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkApartmentBtn))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retrieveBtn)
                    .addComponent(ApartComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressBoxActionPerformed

    private void postCodeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeBoxActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String firstName= " ";
        if(isFullname(nameBox.getText().toString())){
            firstName= nameBox.getText().toString();
        }else{
            JOptionPane.showMessageDialog(ApartComboBox, "Check Name");
        }
        //add REGEX FOR THE REST!!
        String lastName= lastNameBox.getText().toString();
        String address= addressBox.getText().toString();
        String postCode= postCodeBox.getText().toString();
        String phoneNumber= numberBox.getText().toString();
        String checkInDate= chkInBox.getText().toString();
        String checkOutDate= chkOutBox.getText().toString();
        DAO conn= new DAO();
        if(nameBox.getText().isEmpty()|| lastNameBox.getText().isEmpty()||addressBox.getText().isEmpty()|| postCodeBox.getText().isEmpty()|| numberBox.getText().isEmpty()|| chkInBox.getText().isEmpty()|| chkOutBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(nameBox, "Please ensure details are entered correctly");
        }else{
            try {
                int roomNumber= Integer.parseInt(ApartComboBox.getSelectedItem().toString());
                conn.insertBooking(firstName, lastName, address, postCode, phoneNumber, checkInDate, checkOutDate, roomNumber);
            } catch (SQLException ex) {
                Logger.getLogger(NewBookingFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
            dispose();
            frame.fetchAllBookings();
        }  
        /**if(nameBox.getText().isEmpty()|| lastNameBox.getText().isEmpty()||addressBox.getText().isEmpty()|| postCodeBox.getText().isEmpty()|| numberBox.getText().isEmpty()|| chkInBox.getText().isEmpty()|| chkOutBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(nameBox, "Please ensure details are entered correctly");
        }else{
           try {
            int roomNumber= Integer.parseInt(ApartComboBox.getSelectedItem().toString());
            conn.insertBooking(firstName, lastName, address, postCode, phoneNumber, checkInDate, checkOutDate, roomNumber);
            } catch (SQLException ex) {
            Logger.getLogger(NewBookingFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
           dispose();
           frame.fetchAllBookings();
        } */
    }//GEN-LAST:event_confirmBtnActionPerformed

    public boolean isFullname(String str) {
        String expression = "^[a-zA-Z\\s]+"; 
        return str.matches(expression);        
}
    private void chkApartmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApartmentBtnActionPerformed
        String checkInDate= chkInBox.getText().toString();
        String checkOutDate= chkOutBox.getText().toString();
        ArrayList<Integer> availableApartments= new ArrayList<Integer>();
        DAO conn= new DAO();
        if(checkDate(checkInDate, checkOutDate)){
            try{
                availableApartments= conn.CheckRooms(checkInDate, checkOutDate);
                ApartComboBox.setEnabled(true);
                Integer[] array = availableApartments.toArray(new Integer[availableApartments.size()]);
                DefaultComboBoxModel model= new DefaultComboBoxModel(availableApartments.toArray(new Integer[availableApartments.size()]));
                ApartComboBox.setModel(model);
                confirmBtn.setEnabled(true);
            }catch(SQLException e){
                e.getMessage();
            }
        }else{
            JOptionPane.showMessageDialog(ApartComboBox, "Date is invalid, please try again");
        }
        
        
        //fill comboBox with ArrayList
        
    }//GEN-LAST:event_chkApartmentBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void ApartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApartComboBoxActionPerformed
        
    }//GEN-LAST:event_ApartComboBoxActionPerformed

    private void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveBtnActionPerformed
        DAO conn= new DAO();
        String phoneNumber= numberBox.getText().toString();
        String[] details= new String[4];
        try {
            details= conn.retrieveDetails(phoneNumber);
        }catch(SQLException e) {
            e.getMessage();
        }
        nameBox.setText(details[0]);
        lastNameBox.setText(details[1]);
        addressBox.setText(details[2]);
        postCodeBox.setText(details[3]);
    }//GEN-LAST:event_retrieveBtnActionPerformed

    private void chkInBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkInBoxActionPerformed

    private boolean checkDate(String checkInDate, String checkOutDate){ //checks if dates are correctly formatted, in the future, and if check in date is smaller than check out date
        Date inCheck= null;
        Date outCheck= null; 
        Boolean formatCheck= false; 
        DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String dt= sdf.format(new Date());
        
        try{
            inCheck= sdf.parse(checkInDate);
            outCheck= sdf.parse(checkOutDate);
            Date dateToday= sdf.parse(dt);
            if(!checkInDate.equals(sdf.format(inCheck))|| !checkOutDate.equals(sdf.format(outCheck))|| inCheck.before(dateToday) || outCheck.before(dateToday)|| outCheck.before(inCheck)){
                formatCheck=false;
            }else{
                formatCheck= true;
            }
        }catch(ParseException ex) {
            ex.printStackTrace();
        }
        
        return formatCheck;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBookingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ApartComboBox;
    private javax.swing.JTextField addressBox;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton chkApartmentBtn;
    public javax.swing.JTextField chkInBox;
    private javax.swing.JTextField chkOutBox;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameBox;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField numberBox;
    private javax.swing.JTextField postCodeBox;
    private javax.swing.JButton retrieveBtn;
    // End of variables declaration//GEN-END:variables
}
