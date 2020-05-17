/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class StudentPerformanceForm extends javax.swing.JFrame {
    
    DefaultTableModel model;
    int SchoolId = 0;
    String TeacherPhoneNo = "";
    String encode = "";
    private Map<Character, Integer> map = new HashMap<Character, Integer>();

    /**
     * Creates new form StudentPerformanceForm
     */
    public StudentPerformanceForm() {
        initComponents();
        decodeMap();
        model = (DefaultTableModel) performancePerSchool.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schoolComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        performancePerSchool = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        performancePerStudent = new javax.swing.JTable();
        showButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        try{
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("select SchoolName from School order by SchoolName");

            ArrayList<String> ar = new ArrayList<String>();
            String x;
            while(resultset.next())
            {
                x=new String(resultset.getString("SchoolName"));
                ar.add(x);
            }
            int sz=ar.size();
            for(int i=0;i<sz;i++)schoolComboBox.addItem(ar.get(i));
        }catch (Exception ex) {

            ex.printStackTrace();
            System.out.print("??");
        }

        for(int i=1; i<13; i++){
            monthComboBox.addItem(new Integer(i).toString());
        }
        monthComboBox.setMaximumRowCount(12);
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        for(int i=2018; i<30000; i++){
            yearComboBox.addItem(new Integer(i).toString());
        }
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        performancePerSchool.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        performancePerSchool.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Performance"
            }
        ));
        performancePerSchool.setRowHeight(24);
        performancePerSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                performancePerSchoolMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(performancePerSchool);

        performancePerStudent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        performancePerStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Performance"
            }
        ));
        performancePerStudent.setRowHeight(24);
        performancePerStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                performancePerStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(performancePerStudent);

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
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
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schoolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        model.setRowCount(0);
        try {
            // TODO add your handling code here:
            String SchoolName = schoolComboBox.getSelectedItem().toString();
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            SchoolId = 0;
            ResultSet resultset = statement.executeQuery("select SchoolId from School where SchoolName='" + SchoolName + "'");
            while (resultset.next()) {
                SchoolId = resultset.getInt("SchoolId");
            }
            TeacherPhoneNo = "";
            resultset = statement.executeQuery("select PhoneNo from Teacher where SchoolId=" + SchoolId);
            while (resultset.next()) {
                TeacherPhoneNo = resultset.getString("PhoneNo");
            }
            encode = "";
            resultset = statement.executeQuery("select Marks from Performance_Table where SchoolId=" + SchoolId + " and TeacherPhoneNo='" + TeacherPhoneNo + "' and Year=" + new Integer(yearComboBox.getSelectedItem().toString()) + " and Month='"+monthComboBox.getSelectedItem().toString()+"'");
            while (resultset.next()) {
                encode = resultset.getString("Marks");
            }
            resultset = statement.executeQuery("select StudentId, StudentName from Student where SchoolId=" + SchoolId + " order by StudentId");
            Object[] rowData = new Object[3];

                int i=0;
            while (resultset.next()) {
                rowData[0] = resultset.getInt("StudentId");
                rowData[1] = resultset.getString("StudentName");
                rowData[2] = returnMarks(encode.charAt(i));
                i++;

                model.addRow(rowData);

            

            }
            System.out.println(encode);
        } catch (SQLException ex) {
            Logger.getLogger(StudentPerformanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_showButtonActionPerformed

    private void performancePerStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancePerStudentMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_performancePerStudentMouseClicked

    private void performancePerSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancePerSchoolMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel models = (DefaultTableModel) performancePerStudent.getModel();
            models.setRowCount(0);
            // TODO add your handling code here:
            int x = (Integer) model.getValueAt(performancePerSchool.getSelectedRow(), 0);
            //int x = new Integer(s).intValue();
            
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("select Marks, Month from Performance_Table where SchoolId="+SchoolId+" and Year="+new Integer(yearComboBox.getSelectedItem().toString())+" and TeacherPhoneNo='"+TeacherPhoneNo+"'");
        
            Object[] amarRowData = new Object[2];
            while(resultset.next()){
                amarRowData[0] = resultset.getString("Month");
                amarRowData[1] = returnMarks(resultset.getString("Marks").charAt(x));
                models.addRow(amarRowData);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(SchoolAttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_performancePerSchoolMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          new HomeFrame().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(StudentPerformanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPerformanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPerformanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPerformanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPerformanceForm().setVisible(true);
            }
        });
    }
    private int returnMarks(char c)
    {
        return map.get(c);
    }
    private void decodeMap()
    {
        char c = '0';
        for(int i=0;i<10;i++)
        {
         map.put(c, i);
         c+=1;
        }
        
        c = 'a';
        for(int i=10;i<37;i++)
        {
            map.put(c, i);
            c+=1;
        }
           c = 'A';
        for(int i=37;i<=50;i++)
        {
            map.put(c, i);
            c+=1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTable performancePerSchool;
    private javax.swing.JTable performancePerStudent;
    private javax.swing.JComboBox<String> schoolComboBox;
    private javax.swing.JButton showButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}