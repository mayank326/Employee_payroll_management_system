/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_managment_system;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author MAYANK
 */
public class generateSlip extends javax.swing.JFrame {

    /**
     * Creates new form generateSlip
     */
    
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public generateSlip() {
        initComponents();
        con=DB.java_db();
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
        txt_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Generate PaySlip");

        jLabel2.setText("Emplyee Id : ");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel3.setText("Employee Id : ");

        jLabel4.setText("Name : ");

        jLabel5.setText("Department : ");

        jLabel6.setText("Gender : ");

        jLabel7.setText("Basic Salary :  ");

        txt_id.setEditable(false);

        txt_name.setEditable(false);

        txt_dept.setEditable(false);

        txt_gender.setEditable(false);

        txt_salary.setEditable(false);

        jButton1.setText("Generate PaySlip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txt_name)
                            .addComponent(txt_dept))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_gender, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(txt_salary))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
    
       String sql="Select * from employeedata where id=?";
        try{
        ps=con.prepareStatement(sql);
        ps.setString(1,txt_search.getText());
        rs=ps.executeQuery();
        
        rs.next();
        txt_id.setText(String.valueOf(rs.getInt("id")));
        txt_name.setText(rs.getString("name"));
        txt_gender.setText(rs.getString("gender"));
        txt_dept.setText(rs.getString("department"));
        txt_salary.setText(String.valueOf(rs.getInt("salary")));
        
        }catch(Exception e){
            e.printStackTrace();
            
        }

    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name=txt_name.getText();
        String id=txt_id.getText();
        String dept=txt_dept.getText();
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File(id+"_"+name+"_salary Slip"+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        String filePath = null;
        if(dialogResult==JFileChooser.APPROVE_OPTION){
             filePath=dialog.getSelectedFile().getPath();
        }

        try{
            
            String sql="Select * from deduction where emp_id="+Integer.parseInt(id);
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            rs.next();
            int val=rs.getInt(4);
            String reason=rs.getString(5);
            rs.close();
            ps.close();
            
            int calcTotal=Integer.parseInt(txt_salary.getText());
            String sql2="Select * from allowance where empid="+Integer.parseInt(id);
            ps=con.prepareStatement(sql2);
            rs=ps.executeQuery();
            rs.next();
            float x=Float.valueOf(rs.getString(5));
            float total=calcTotal+x-val;
            
            Document doc=new Document();
            PdfWriter myWriter=PdfWriter.getInstance(doc, new FileOutputStream(filePath));
            
            doc.open();
            doc.add(new Paragraph("Pay Slip",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            doc.add(new Paragraph(new Date().toString()));
            doc.add(new Paragraph("-----------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            
            doc.add(new Paragraph("EMPLOYEE DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
            doc.add(new Paragraph("Employee Id : "+id,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("Employee Name : "+name,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("Employee Department : "+dept,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("-----------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            
            
            doc.add(new Paragraph("SALARY DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
            doc.add(new Paragraph("Basic Salary : "+calcTotal,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("Overtime : "+rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("Medical : "+rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("-----------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            
            doc.add(new Paragraph("DEDUCTION DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
            doc.add(new Paragraph("Deduction Reason : "+reason,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("Deduction Ammount : "+val,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            doc.add(new Paragraph("-----------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            
            
            doc.add(new Paragraph("Net Payable Salary : "+total,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL)));
            
            doc.newPage();
            doc.close();
            JOptionPane.showMessageDialog(null,"Pay Slip created");
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(generateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generateSlip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
