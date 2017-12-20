/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jp
 */
public class Node_Design extends javax.swing.JFrame {

    Random r = new Random();
    private static final long serialVersionUID = 2L;
    public Save action;
    public String source;
    int port;
    public int energy;
    public String dis;
    public SaveR mrx;
    Get receive;
    String mpcrPath, id;

    /**
     * Creates new form Node_Design
     */
    public Node_Design() throws UnknownHostException {
        initComponents();
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
        jTextField3.setEditable(false);
        init();

    }

    private void init() {
        // TODO Auto-generated method stub
        action = new Save();
        source = action.getSource();
        setTitle(source);
        energy = action.getEnergy();
        jTextField3.setText("" + energy);
        jLabel5.setText(source);
        port = action.getPort();
        receive = new Get(this, port, action);

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        file_browse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        send1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Node");
        setMinimumSize(new java.awt.Dimension(830, 580));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 90, 90, 0);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 170, 180, 30);

        file_browse.setBackground(new java.awt.Color(204, 204, 204));
        file_browse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        file_browse.setText("Select Data");
        file_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_browseActionPerformed(evt);
            }
        });
        getContentPane().add(file_browse);
        file_browse.setBounds(20, 400, 160, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 450, 440, 210);

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(280, 680, 100, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(380, 170, 340, 100);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(560, 480, 340, 210);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(400, 330, 250, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(720, 80, 120, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Destination ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 30, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 80, 70, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Connect to Destination");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 240, 200, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Security Key");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 320, 30);

        send1.setBackground(new java.awt.Color(204, 204, 204));
        send1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        send1.setText("Send To");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });
        getContentPane().add(send1);
        send1.setBounds(110, 680, 100, 30);

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel3.setText("Enter Destination Node");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 330, 240, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 400, 250, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Receive Data");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 430, 200, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Information Passing");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 30, 420, 40);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 100, 200, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setText("Replicas Node");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(673, 10, 140, 27);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1607253.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -70, 930, 790);

        setSize(new java.awt.Dimension(919, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void file_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_browseActionPerformed

     JFileChooser Chooser = new JFileChooser();
        Chooser.setMultiSelectionEnabled(true);
        Chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = Chooser.showDialog(this, "Open");
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = null;
            file = Chooser.getSelectedFile();
            jTextField4.setText(file.toString());
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                int content;
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content);
                    jTextArea1.append("" + (char) content);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Node_Design.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Node_Design.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }//GEN-LAST:event_file_browseActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(null);
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new Node_Design().setVisible(true);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Node_Design.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dis = jTextField1.getText();
            try {
                Integer.parseInt(dis);
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null, f + "\n" + "Security Key Invalid", "Error", 2);
             }
            if (dis.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Security Key..!!!");
            } else {
                mrx = new SaveR(this);
                new SaveT(source, dis, port);
                
            }
               id=jTextField3.getText();
               Connection con=DataB.getConnection();
               Statement st=con.createStatement();
               int i=st.executeUpdate("insert into nodes values ('"+id+"','"+dis+"','"+source+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Node_Design.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed

        if (jTextArea2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please connect destination node!!");
            
        } else if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the Destination");
        } else {
            Vector<String> path = new Vector<String>();
            path.add(source);
            action.routing(mrx, path, jTextField2.getText());
            JOptionPane.showMessageDialog(null, "Connected Source and Destination");
        }
      
        mpcrPath = receive.allPaths.get(receive.allPaths.firstKey());
        String text = jTextArea1.getText();

        if (text.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the Message.");
        } else {
            Vector<String> path = action.getPath(mpcrPath);
            action.sendData(mrx, path, text);
            JOptionPane.showMessageDialog(null, "Data Sending.....");
            JOptionPane.showMessageDialog(null, "Data Sent Successfully.....");
        }
    }//GEN-LAST:event_send1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new  replicas().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Node_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Node_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Node_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Node_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Node_Design().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Node_Design.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton file_browse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton send1;
    // End of variables declaration//GEN-END:variables
    //public DefaultTableModel dft;
    //private javax.swing.JTable tblRoute;
}