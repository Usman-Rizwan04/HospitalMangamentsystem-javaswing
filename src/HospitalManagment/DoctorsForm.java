/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HospitalManagment;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CC
 */
public class DoctorsForm extends javax.swing.JFrame {

    /**
     * Creates new form DoctorsForm
     */
    DefaultTableModel table;
    public DoctorsForm() {
        initComponents();
        createconnection();
        table = (DefaultTableModel) tblDoctor.getModel();
    }
    Connection con;
    public void createconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "usman4112005");
            } catch (SQLException ex) {
                Logger.getLogger(DoctorsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorsForm.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chkMale = new javax.swing.JCheckBox();
        chkFemale = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDocID = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        btnTerminate = new javax.swing.JButton();
        btnShowRecord = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        txtDateJoin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1758, 757));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagment/AKU_HOSPITAL_LOGO.gif"))); // NOI18N
        jLabel1.setText("     ");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Agha Khan Hospital Managment System");

        btnDashboard.setBackground(new java.awt.Color(204, 0, 0));
        btnDashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("DashBoard");
        btnDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 6));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1756, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Doctors Panel");

        jLabel4.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Full Name: ");

        jLabel5.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("DOB:");

        jLabel6.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Gender:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkMale);
        chkMale.setForeground(new java.awt.Color(102, 102, 102));
        chkMale.setText("Male");

        buttonGroup1.add(chkFemale);
        chkFemale.setForeground(new java.awt.Color(102, 102, 102));
        chkFemale.setText("Female");

        jLabel7.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Contact:");

        jLabel9.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Father Name:");

        jLabel10.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Date of Joining");

        jLabel12.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Doctors ID");

        btnClear.setBackground(new java.awt.Color(204, 0, 0));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(100, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnJoin.setBackground(new java.awt.Color(204, 0, 0));
        btnJoin.setForeground(new java.awt.Color(255, 255, 255));
        btnJoin.setText("JOIN");
        btnJoin.setPreferredSize(new java.awt.Dimension(100, 30));
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        btnTerminate.setBackground(new java.awt.Color(204, 0, 0));
        btnTerminate.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminate.setText("TERMINATE");
        btnTerminate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTerminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminateActionPerformed(evt);
            }
        });

        btnShowRecord.setBackground(new java.awt.Color(204, 0, 0));
        btnShowRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnShowRecord.setText("Show Record");
        btnShowRecord.setMaximumSize(new java.awt.Dimension(97, 27));
        btnShowRecord.setMinimumSize(new java.awt.Dimension(97, 27));
        btnShowRecord.setPreferredSize(new java.awt.Dimension(100, 30));
        btnShowRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Specialization:");

        tblDoctor.setForeground(new java.awt.Color(102, 102, 102));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Full Name", "Father Name", "DOB", "Gender", "Specilization", "Contact", "Email", "Joining Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);
        if (tblDoctor.getColumnModel().getColumnCount() > 0) {
            tblDoctor.getColumnModel().getColumn(0).setResizable(false);
            tblDoctor.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblDoctor.getColumnModel().getColumn(1).setResizable(false);
            tblDoctor.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblDoctor.getColumnModel().getColumn(2).setResizable(false);
            tblDoctor.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblDoctor.getColumnModel().getColumn(3).setResizable(false);
            tblDoctor.getColumnModel().getColumn(3).setPreferredWidth(68);
            tblDoctor.getColumnModel().getColumn(4).setResizable(false);
            tblDoctor.getColumnModel().getColumn(4).setPreferredWidth(58);
            tblDoctor.getColumnModel().getColumn(5).setResizable(false);
            tblDoctor.getColumnModel().getColumn(5).setPreferredWidth(90);
            tblDoctor.getColumnModel().getColumn(6).setResizable(false);
            tblDoctor.getColumnModel().getColumn(6).setPreferredWidth(65);
            tblDoctor.getColumnModel().getColumn(7).setResizable(false);
            tblDoctor.getColumnModel().getColumn(7).setPreferredWidth(85);
            tblDoctor.getColumnModel().getColumn(8).setResizable(false);
            tblDoctor.getColumnModel().getColumn(8).setPreferredWidth(68);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1756, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(chkMale)
                                            .addGap(18, 18, 18)
                                            .addComponent(chkFemale)))
                                    .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSpecialization, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(chkMale)
                            .addComponent(chkFemale))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDateJoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecordActionPerformed

        table.setRowCount(0);
        
        try {
            String query = "SELECT * FROM doctors";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String docid = rs.getString("DoctorID");
                String name = rs.getString("FullName");
                String fathname = rs.getString("FatherName");
                String dob = rs.getString("DOB");
                String gender = rs.getString("Gender");
                String special = rs.getString("Specialization");
                String contact = rs.getString("Contact");
                String email = rs.getString("Email");
                String dateofjoin = rs.getString("DateofJoining");
                
                table.addRow(new Object[]{docid, name, fathname, dob, gender, special, contact, email, dateofjoin});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnShowRecordActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        
        try {
            String DocID = txtDocID.getText();
            String Name = txtName.getText();
            String FathName = txtFatherName.getText();
            String DOB = txtDOB.getText();
            String Special = txtSpecialization.getText();
            String Contact = txtContact.getText();
            String Email = txtEmail.getText();
            String DateofJoin = txtDateJoin.getText();
            String Gender = "";
            
            if(chkMale.isSelected()){Gender = " Male";}
            if(chkFemale.isSelected()){Gender = " Female";}
           if(DocID.isEmpty() && Name.isEmpty() && FathName.isEmpty() && DOB.isEmpty() && Special.isEmpty() && Contact.isEmpty() && Email.isEmpty() && DateofJoin.isEmpty() && Gender.isEmpty()){
               
               JOptionPane.showMessageDialog( DoctorsForm.this, "Please fill all the text field");
               
           }else{
            String query = "INSERT INTO doctors (DoctorID, FullName, FatherName, DOB, Gender, Specialization, Contact, Email, DateofJoining) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, Integer.parseInt(DocID));
            st.setString(2, Name);
            st.setString(3, FathName);
            st.setString(4, DOB);
            st.setString(5, Gender);
            st.setString(6, Special);
            st.setString(7, Contact);
            st.setString(8, Email);
            st.setString(9, DateofJoin);
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(DoctorsForm.this, "Doctor has Joined Successfully");
            
               btnClearActionPerformed(evt);
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(DoctorsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

       txtDocID.setText("");
       txtContact.setText("");
       txtDOB.setText("");
       txtDateJoin.setText("");
       txtEmail.setText("");
       txtFatherName.setText("");
       txtName.setText("");
       txtSpecialization.setText("");
       
       buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnTerminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminateActionPerformed
        
        try {
            int rownum = tblDoctor.getSelectedRow();
            if(rownum != -1){
                Object id = tblDoctor.getValueAt(rownum, 0);
                table.removeRow(rownum);
                String query = "DELETE FROM doctors WHERE DoctorID = "+id;
                PreparedStatement st = con.prepareStatement(query);
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Doctor Terminated Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Please select a Doctor to Terminate");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DoctorsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTerminateActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnShowRecord;
    private javax.swing.JButton btnTerminate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkFemale;
    private javax.swing.JCheckBox chkMale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDateJoin;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}
