/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package employee_managment_system;

/**
 *
 * @author MAYANK
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
     Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
  
    public Main() {
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_managment_system/images/logout_icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Employee Manager");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Allowance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update Salary");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Deductions");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("PaySlips");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Welcome to Employee Payroll Management System");

        jMenu2.setText("Reports");

        jMenuItem1.setText("Employees Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Employee Allwance Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Employee Deduction Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        login l1=new login();
        l1.setVisible(true);
        this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        String filePath = null;
        if(dialogResult==JFileChooser.APPROVE_OPTION){
             filePath=dialog.getSelectedFile().getPath();
        }
        
        try{
            String sql1="Select * from employeedata";
            ps=con.prepareStatement(sql1);
            rs=ps.executeQuery();
            Document doc=new Document();
            PdfWriter myWriter=PdfWriter.getInstance(doc, new FileOutputStream(filePath));
            PdfPTable table=new PdfPTable(5);
             doc.open();
             
             float[] documentWidth=new float[]{3,6,6,6,5};
             table.setWidths(documentWidth);
             table.setWidthPercentage(100);
             
             doc.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            doc.add(new Paragraph(new Date().toString()));
            doc.add(new Paragraph("-------------------------------------------------------------------------------------"));
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            
            while(rs.next()){
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
           }
           doc.add(table);
           
            doc.newPage();
            doc.close();
            JOptionPane.showMessageDialog(null,"Employee Data PDF created");
             
            
        }catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Allowance Report.pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        String filePath = null;
        if(dialogResult==JFileChooser.APPROVE_OPTION){
             filePath=dialog.getSelectedFile().getPath();
        }
        
        try{
            String sql1="Select * from allowance";
            ps=con.prepareStatement(sql1);
            rs=ps.executeQuery();
            
            Document doc=new Document();
            PdfWriter myWriter=PdfWriter.getInstance(doc, new FileOutputStream(filePath));
            PdfPTable table=new PdfPTable(6);
             doc.open();
             
             float[] documentWidth=new float[]{3,6,6,6,6,6};
             table.setWidths(documentWidth);
             table.setWidthPercentage(100);
             
             doc.add(new Paragraph("Employees Allowance List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            doc.add(new Paragraph(new Date().toString()));
            doc.add(new Paragraph("-------------------------------------------------------------------------------------"));
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Overtime",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Total",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Created By",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            
            while(rs.next()){
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));

            }
           doc.add(table);
           
            doc.newPage();
            doc.close();
            JOptionPane.showMessageDialog(null,"Employee Allowance PDF created");
             
            
        }catch(Exception e){
            e.printStackTrace();
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Deduction Report.pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        String filePath = null;
        if(dialogResult==JFileChooser.APPROVE_OPTION){
             filePath=dialog.getSelectedFile().getPath();
        }
        
        try{
            String sql1="Select * from deduction";
            ps=con.prepareStatement(sql1);
            rs=ps.executeQuery();
            
            Document doc=new Document();
            PdfWriter myWriter=PdfWriter.getInstance(doc, new FileOutputStream(filePath));
            PdfPTable table=new PdfPTable(6);
             doc.open();
             
             float[] documentWidth=new float[]{3,6,6,6,6,6};
             table.setWidths(documentWidth);
             table.setWidthPercentage(100);
             
             doc.add(new Paragraph("Employees Dedution List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            doc.add(new Paragraph(new Date().toString()));
            doc.add(new Paragraph("-------------------------------------------------------------------------------------"));
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Deduction",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Reason",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Made By",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD))));
            
            while(rs.next()){
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));
            table.addCell(new PdfPCell(new Paragraph(""+rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.NORMAL))));

            }
           doc.add(table);
           
            doc.newPage();
            doc.close();
            JOptionPane.showMessageDialog(null,"Employee Deduction PDF created");
             
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        addEmployee a1=new addEmployee();
        a1.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        Allowance a2=new Allowance();
        a2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    
        addEmployee a1=new addEmployee();
        a1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
        UpdateSalary a3=new UpdateSalary();
        a3.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

            deduction d1=new deduction();
            d1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        generateSlip gs=new generateSlip();
        gs.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
