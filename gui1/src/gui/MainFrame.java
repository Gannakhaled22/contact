package gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
//import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame {
    static int no_clients;
    DefaultTableModel model;  //retun informatiom
    File f;
    login client;
    public MainFrame() throws Exception{
        initComponents();
         setTitle("gui");
               setIconImage(null);
        this.setLocationRelativeTo(null);
        model=(DefaultTableModel) table.getModel();
        table.setAutoCreateRowSorter(true);
        f=new File("src/data.txt");
        if(f.exists()==false){
            f.createNewFile();
        }
        FileInputStream fi=new FileInputStream("src/data.txt");
        if(f.length()<=0){
            return;
        }
        ObjectInputStream o=new ObjectInputStream(fi);
         Vector<Vector> tdata=(Vector <Vector>) o.readObject();
        o.close();
        fi.close();
        for (int i = 0; i < tdata.size(); i++) {
            model.addRow(new Object[]{tdata.get(i).get(0),tdata.get(i).get(1),tdata.get(i).get(2),tdata.get(i).get(3),tdata.get(i).get(4)});
        }
        
    }
     
      public void updateFile() throws Exception{
        Vector<Vector> tableData = model.getDataVector();
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(tableData);
        fo.close();
        oo.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        Fphone = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        gmailLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        Femail = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Fcity = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Concats");
        setBackground(new java.awt.Color(255, 153, 255));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));

        newClientPanel.setBackground(new java.awt.Color(255, 255, 102));
        newClientPanel.setForeground(new java.awt.Color(0, 0, 102));
        newClientPanel.setName("LOGIN"); // NOI18N
        newClientPanel.setOpaque(false);

        fullNameLabel.setBackground(new java.awt.Color(204, 204, 255));
        fullNameLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        fullNameLabel.setText("  name");

        Fphone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        phoneNumberLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        phoneNumberLabel.setText("phone number ");

        gmailLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        gmailLabel.setText("email");

        cityLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        cityLabel.setText("  City");

        Femail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Femail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemailActionPerformed(evt);
            }
        });

        Fname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });

        Fcity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        updateButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        updateButton.setText(" Update ");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clean.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/working (1).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 64));

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newClientPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fcity, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Femail, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fphone, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newClientPanelLayout.createSequentialGroup()
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newClientPanelLayout.createSequentialGroup()
                                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fphone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(gmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Femail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Fcity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Full Name", "Phone number", "Gmail", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(170);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(170);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(200);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void update(login c) throws Exception{ // int i = table.get selected row();
    model.setValueAt(c.getname(), table.getSelectedRow(), 1);
    model.setValueAt(c.getPhoneNumber(), table.getSelectedRow(), 2);
    model.setValueAt(c.getemail(), table.getSelectedRow(), 3);
    model.setValueAt(c.getCity(), table.getSelectedRow(), 4);
    updateFile();
}
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
 if(Fname.getText().isEmpty()==true || 
                Fphone.getText().isEmpty()==true || 
                Femail.getText().isEmpty()==true || 
                Fcity.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "please enter your informations","Error",JOptionPane.ERROR_MESSAGE);    
        }
        else{
            client=new login(Fname.getText().trim(),
                    Fphone.getText().trim(),
            Femail.getText().trim(),Fcity.getText().trim());
        }
           if(client.i()==false){
                JOptionPane.showMessageDialog(null, client.getMessage(),"Error info",JOptionPane.ERROR_MESSAGE);
            }
           else{
     try {
         update(client);
     } catch (Exception ex) {
         Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
               JOptionPane.showMessageDialog(null, "user is added sucesfully","Added",JOptionPane.INFORMATION_MESSAGE);
           }
    }//GEN-LAST:event_updateButtonActionPerformed


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(Fname.getText().isEmpty()==true || 
                Fphone.getText().isEmpty()==true || 
                Femail.getText().isEmpty()==true || 
                Fcity.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "please enter your information","Error",JOptionPane.ERROR_MESSAGE);    
        }
        else{
            client=new login(Fname.getText().trim(),
                    Fphone.getText().trim(),
            Femail.getText().trim(),Fcity.getText().trim());
        }
           if(client.i()==false){
                JOptionPane.showMessageDialog(null, client.getMessage(),"Error info",JOptionPane.ERROR_MESSAGE);
            }
           else{
            try {
                add(client);
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
               JOptionPane.showMessageDialog(null, "user is added sucesfully","Added",JOptionPane.INFORMATION_MESSAGE);
           }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     int index=table.getSelectedRow();
     if(index<0){
         JOptionPane.showMessageDialog(null, "please select any thing !", "Error", JOptionPane.ERROR_MESSAGE);
     }
     model.removeRow(index);
  
JOptionPane.showMessageDialog(null, "row is deleted succesfuly","removed",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void FemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemailActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed
  public void add(login s) throws Exception{
    model.addRow(new Object[]{table.getRowCount()+1
            ,s.getname(),s.getPhoneNumber(),s.getemail(),s.getCity()});
   
 
 updateFile();
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainFrame().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fcity;
    private javax.swing.JTextField Femail;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Fphone;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel gmailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTable table;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
