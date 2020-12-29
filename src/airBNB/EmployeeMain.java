/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airBNB;

import airBNB.Helper.Auth;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Administrator
 */
public class EmployeeMain extends javax.swing.JFrame {
    
    ResultSet rs=null;
    PreparedStatement pst=null;
    private Map<String, String> bundle;
    private ArrayList<Map<String, String>> properties;
    private Auth auth;

    /**
     * Creates new form login
     */
    
    public EmployeeMain() {
        initComponents();
         
    }
    
    public EmployeeMain(Map<String, String> bundle, Auth auth){
        this();
        this.name = bundle.get("username");
        Branch.setText("Welcome: " +name);
        this.bundle = bundle;
        this.auth = auth;
        this.properties = new ArrayList<>();
        fetch();
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
        logo = new javax.swing.JLabel();
        FrameClose = new javax.swing.JLabel();
        LogOut = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Branch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Add = new java.awt.Button();
        Edit = new java.awt.Button();
        Delete = new java.awt.Button();
        Info = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airBNB/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 80));

        FrameClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FrameClose.setForeground(new java.awt.Color(255, 255, 255));
        FrameClose.setText("X");
        FrameClose.setName(""); // NOI18N
        FrameClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FrameCloseMouseReleased(evt);
            }
        });
        jPanel1.add(FrameClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 20, 20));

        LogOut.setBackground(new java.awt.Color(102, 102, 255));
        LogOut.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setLabel("Log-Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 180, 40));

        jList1.setBackground(new java.awt.Color(32, 33, 35));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 750, 320));

        Branch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Branch.setForeground(new java.awt.Color(255, 255, 255));
        Branch.setText("Branch: ");
        jPanel1.add(Branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booking's Available in this Branch:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Add.setActionCommand("Add");
        Add.setBackground(new java.awt.Color(102, 102, 255));
        Add.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setLabel("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 180, 40));

        Edit.setBackground(new java.awt.Color(102, 102, 255));
        Edit.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setLabel("Edit");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 190, 40));

        Delete.setBackground(new java.awt.Color(102, 102, 255));
        Delete.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setLabel("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 190, 40));

        Info.setBackground(new java.awt.Color(102, 102, 255));
        Info.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Info.setForeground(new java.awt.Color(255, 255, 255));
        Info.setLabel("Prop Info");
        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoMouseClicked(evt);
            }
        });
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        jPanel1.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
  int xy;
  int xx;
  String name;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
         xx = evt.getX();
         xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void FrameCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameCloseMouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FrameCloseMouseReleased

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        
        //not done properly.
        
        JOptionPane.showMessageDialog(null, "Logged-Out!", "InfoBox: Success", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        LoginMain login = new LoginMain(auth);
        login.setVisible(true);
        
        
        

    }//GEN-LAST:event_LogOutActionPerformed

    private void fetch() {
        DefaultListModel m = new DefaultListModel();
        properties.clear();
        try{
            String q = "SELECT * FROM project.property where country='" + bundle.get("country") + "';";
            pst = auth.getConnection().prepareStatement(q);
            rs=pst.executeQuery();
            while(rs.next()){
                Map<String, String> temp = new HashMap<String, String>();
                temp.put("property_id", rs.getString("property_id"));
                temp.put("city", rs.getString("city"));
                temp.put("street", rs.getString("street"));
                temp.put("houseno", rs.getString("houseno"));
                temp.put("province", rs.getString("province"));
                temp.put("propertytype", rs.getString("propertytype"));
                temp.put("roomtype", rs.getString("roomtype"));
                temp.put("accommodates", rs.getString("accommodates"));
                temp.put("amenities", rs.getString("amenities"));
                temp.put("availabledate", rs.getString("availabledate"));
                temp.put("price", rs.getString("price"));
                temp.put("host_id", rs.getString("host_id"));
                temp.put("bathroom", rs.getString("bathroom"));
                temp.put("bedroom", rs.getString("bedroom"));
                
                properties.add(temp);
                
                String total = temp.get("houseno") +" "+ temp.get("street")+ ", " + temp.get("city") + ", " + temp.get("province")+ "     Price: "+ temp.get("price") + " per night"; 
                
                m.addElement(total);
            }
            jList1.setModel(m);
            
            pst.close();
            rs.close();
            
        }catch(NullPointerException | SQLException | ClassNotFoundException e){
            Logger.getLogger(EmployeeMain.class.getName()).log(Level.SEVERE, e, null);
            // JOptionPane.showMessageDialog(null,e);
        }
    }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        fetch();
    }//GEN-LAST:event_formWindowGainedFocus

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        try {
            // String id = JOptionPane.showInputDialog(null, "Enter host id", "InfoBox: Enter id", JOptionPane.INFORMATION_MESSAGE);
            String id = JOptionPane.showInputDialog("Enter a host id", 1); boolean flag = false;
            
            while(! flag) {
                while(id == null || ! id.matches("^[0-9]+$")) {
                    id = JOptionPane.showInputDialog(null, "Enter a valid host id", "InfoBox: Enter id", JOptionPane.INFORMATION_MESSAGE);
                }

                Statement st = auth.getConnection().createStatement();
                ResultSet rs = st.executeQuery("select exists(select host_id from project.host where host_id=" + id +")");
                String exists = "";
                while(rs.next()) {
                    exists = rs.getString("exists");
                }
                rs.close();
                
                if(exists.equals("t")) {
                    flag = true;
                } else {
                    id = JOptionPane.showInputDialog("Enter a valid host id", 1);
                }

            }
            
            PropAdd pa = new PropAdd(bundle, auth.getConnection(), id);
            pa.setVisible(true);
        } catch(SQLException | ClassNotFoundException ex) {
            Logger.getLogger(hostProperties.class.getName()).log(Level.SEVERE, ex, null);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoMouseClicked

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
        // TODO add your handling code here:
        int select = jList1.getSelectedIndex();
    
        
        
        if (select == -1){
            JOptionPane.showMessageDialog(null, "Select a Property to View.", "InfoBox: Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Map<String, String> temp = properties.get(select);
            try {
                PropInfo pi = new PropInfo(bundle, temp, auth.getConnection()); 
                pi.setVisible(true);
            } catch(SQLException | ClassNotFoundException ex) {
                Logger.getLogger(EmployeeMain.class.getName()).log(Level.SEVERE, ex, null);
            }
        }
    }//GEN-LAST:event_InfoActionPerformed

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EditMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
        int select = jList1.getSelectedIndex();
    
        
        
        if (select == -1){
            JOptionPane.showMessageDialog(null, "Select a Property to Edit.", "InfoBox: Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            try {
                Map<String, String> temp = properties.get(select);
                PropEdit pe = new PropEdit(bundle, auth.getConnection(), temp);
                pe.setVisible(true);
            } catch(SQLException | ClassNotFoundException ex) {
                Logger.getLogger(EmployeeMain.class.getName()).log(Level.SEVERE, ex, null);
            }
            
        }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
        int select = jList1.getSelectedIndex();
    
        
        
        if (select == -1){
            JOptionPane.showMessageDialog(null, "Select a Property to Delete.", "InfoBox: Error", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Statement st = null;
            Map<String, String> temp = properties.get(select);
            try {
                String q = "delete from project.property WHERE property_id="+temp.get("property_id") + ";";
                st = auth.getConnection().createStatement();
                st.execute(q);
                st.close();
            } catch(SQLException | ClassNotFoundException ex) {
                Logger.getLogger(EmployeeMain.class.getName()).log(Level.SEVERE, ex, null);
            }
            fetch();
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMain().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Add;
    private javax.swing.JLabel Branch;
    private java.awt.Button Delete;
    private java.awt.Button Edit;
    private javax.swing.JLabel FrameClose;
    private java.awt.Button Info;
    private java.awt.Button LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}