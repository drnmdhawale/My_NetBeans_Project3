
package Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Workers extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    
   
    public Workers() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect() {
         try {
            String host = "jdbc:derby://localhost:1527/Employees";
            String uName = "adminboss";
            String uPass= "adminboss";
            Connection con = DriverManager.getConnection( host, uName, uPass );
            
            stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String SQL = "SELECT * FROM Workers";
            rs = stmt.executeQuery( SQL );
            
            rs.next();  
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first = rs.getString("FIRST_NAME");
            String last = rs.getString("LAST_NAME");
            String job = rs.getString("JOB_TITLE");
            
            textID.setText(id);
            textFirstName.setText(first);
            textLastName.setText(last);
            textJobTitle.setText(job);
                                   
       }
            catch ( SQLException err ) {
            JOptionPane.showMessageDialog (Workers.this, err.getMessage( ) );
            
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

        jPanel1 = new javax.swing.JPanel();
        textID = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textJobTitle = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateRecord = new javax.swing.JButton();
        btnNewRecord = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSaveNewRecord = new javax.swing.JButton();
        btnCancelNewRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textFirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Job Title");

        textJobTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(textJobTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(btnLast)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnFirst)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnUpdateRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateRecord.setText("Update Record");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });

        btnNewRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewRecord.setText("New Record");
        btnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecordActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSaveNewRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveNewRecord.setText("Save New Record");
        btnSaveNewRecord.setEnabled(false);
        btnSaveNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewRecordActionPerformed(evt);
            }
        });

        btnCancelNewRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelNewRecord.setText("Cancel New Record");
        btnCancelNewRecord.setEnabled(false);
        btnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdateRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewRecord))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnSaveNewRecord)
                        .addGap(42, 42, 42)
                        .addComponent(btnCancelNewRecord)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRecord)
                    .addComponent(btnNewRecord)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveNewRecord)
                    .addComponent(btnCancelNewRecord))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
                       
        try {
              
                if (rs.next()) {
                 
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("FIRST_NAME");
                String last = rs.getString("LAST_NAME");
                String job = rs.getString("JOB_TITLE");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
                
            }
            
            else {
                 rs.previous();
                 JOptionPane.showMessageDialog(Workers.this, "End of File");
               
                }
        }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            
            }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
         
        try {
              
                if (rs.previous()) {
                 
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("FIRST_NAME");
                String last = rs.getString("LAST_NAME");
                String job = rs.getString("JOB_TITLE");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
                
            }
            
            else {
                 rs.next();
                 JOptionPane.showMessageDialog(Workers.this, "End of File");
               
                }
        }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            
            }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        
        try {
              
                rs.last();
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("FIRST_NAME");
                String last = rs.getString("LAST_NAME");
                String job = rs.getString("JOB_TITLE");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
              
        }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            
            }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        
        try {
              
                rs.first();
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("FIRST_NAME");
                String last = rs.getString("LAST_NAME");
                String job = rs.getString("JOB_TITLE");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
              
        }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            
            }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
                
        String first = textFirstName.getText( );
        String last = textLastName.getText( );
        String job = textJobTitle.getText( );
        String ID = textID.getText( );

        int newID = Integer.parseInt( ID );
        
        try {
                rs.updateInt( "ID", newID );
                rs.updateString( "FIRST_NAME", first );
                rs.updateString( "lAST_NAME", last );
                rs.updateString( "JOB_TITLE", job );
                rs.updateRow( );
                JOptionPane.showMessageDialog(Workers.this, "Updated");
            }
        catch (SQLException err) {
            System.out.println(err.getMessage());
            }
    }//GEN-LAST:event_btnUpdateRecordActionPerformed

    private void btnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecordActionPerformed
        
        try {
            
        curRow = rs.getRow();
        
        textFirstName.setText("");
        textLastName.setText("");
        textJobTitle.setText("");
        textID.setText("");

        btnFirst.setEnabled( false );
        btnPrevious.setEnabled( false) ;
        btnNext.setEnabled( false );
        btnLast.setEnabled( false );
        btnUpdateRecord.setEnabled( false );
        btnDelete.setEnabled( false );
        btnNewRecord.setEnabled( false );
        
        btnSaveNewRecord.setEnabled( true );
        btnCancelNewRecord.setEnabled( true );
       
        } 
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            }
    }//GEN-LAST:event_btnNewRecordActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        try {
        
        rs.deleteRow();
        stmt.close( );
	rs.close( );
        
        String host = "jdbc:derby://localhost:1527/Employees";
        String uName = "adminboss";
        String uPass= "adminboss";
        Connection con = DriverManager.getConnection( host, uName, uPass );
            
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	String sql = "SELECT * FROM Workers";
	rs = stmt.executeQuery(sql);
	
        rs.next();
        int id_col = rs.getInt("ID");
	String id = Integer.toString(id_col);
	String first = rs.getString("FIRST_NAME");
	String last = rs.getString("LAST_NAME");
	String job = rs.getString("JOB_TITLE");
	
        textID.setText(id);
	textFirstName.setText(first);
	textLastName.setText(last);
	textJobTitle.setText(job);
        } 
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewRecordActionPerformed
        
        String first = textFirstName.getText();
        String last = textLastName.getText();
        String job = textJobTitle.getText();
        String ID = textID.getText();
        int newID = Integer.parseInt(ID);
       
        try {

	rs.moveToInsertRow( );
	rs.updateInt("ID", newID);
	rs.updateString("FIRST_NAME", first);
	rs.updateString("LAST_NAME", last);
	rs.updateString("JOB_TITLE", job);
	rs.insertRow( );
	stmt.close( );
	rs.close( );
        
        String host = "jdbc:derby://localhost:1527/Employees";
        String uName = "adminboss";
        String uPass= "adminboss";
        Connection con = DriverManager.getConnection( host, uName, uPass );
            
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	String sql = "SELECT * FROM Workers";
	rs = stmt.executeQuery(sql);
	
        rs.next();
        int id_col = rs.getInt("ID");
	String id = Integer.toString(id_col);
	String first1 = rs.getString("FIRST_NAME");
	String last1 = rs.getString("LAST_NAME");
	String job1 = rs.getString("JOB_TITLE");
	
        textID.setText(id);
	textFirstName.setText(first1);
	textLastName.setText(last1);
	textJobTitle.setText(job1);

	btnFirst.setEnabled( true );
        btnPrevious.setEnabled( true) ;
        btnNext.setEnabled( true );
        btnLast.setEnabled( true );
        btnUpdateRecord.setEnabled( true );
        btnDelete.setEnabled( true );
        btnNewRecord.setEnabled( true );
        
        btnSaveNewRecord.setEnabled( false );
        btnCancelNewRecord.setEnabled( false );
       
        } 
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            }
    }//GEN-LAST:event_btnSaveNewRecordActionPerformed

    private void btnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewRecordActionPerformed
        
        try {
            
        rs.absolute(curRow);
        textFirstName.setText( rs.getString("FIRST_NAME") );
        textLastName.setText( rs.getString("LAST_NAME") );
        textJobTitle.setText( rs.getString("JOB_TITLE") );
        textID.setText( Integer.toString( rs.getInt("ID" )) );

        btnFirst.setEnabled( true );
        btnPrevious.setEnabled( true) ;
        btnNext.setEnabled( true );
        btnLast.setEnabled( true );
        btnUpdateRecord.setEnabled( true );
        btnDelete.setEnabled( true );
        btnNewRecord.setEnabled( true );
        
        btnSaveNewRecord.setEnabled( false );
        btnCancelNewRecord.setEnabled( false );
       
        } 
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
            }
    }//GEN-LAST:event_btnCancelNewRecordActionPerformed

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
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNewRecord;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveNewRecord;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJobTitle;
    private javax.swing.JTextField textLastName;
    // End of variables declaration//GEN-END:variables
}