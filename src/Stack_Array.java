
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajaryan
 */

public class Stack_Array extends javax.swing.JFrame {

    /**
     * Creates new form Stack_Array
     */
    int i=0;
    public Stack_Array() {

        initComponents();
         this.setLocationRelativeTo(null);
                top.setText("x");
    }

    private void initComponents() {

        userget = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        top = new javax.swing.JTextField();
        sl4 = new javax.swing.JLabel();
        sl3 = new javax.swing.JLabel();
        sl2 = new javax.swing.JLabel();
        sl1 = new javax.swing.JLabel();
        sl0 = new javax.swing.JLabel();
        sl6 = new javax.swing.JLabel();
        sl5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 635));
        getContentPane().setLayout(null);

        userget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usergetKeyPressed(evt);
            }
        });
        getContentPane().add(userget);
        userget.setBounds(20, 80, 113, 46);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 22)); 
        jButton1.setText("Push");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 80, 79, 46);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 22)); 
        jButton2.setText("Pop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 80, 80, 46);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 22)); 
        jButton3.setText("Clear stack");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 80, 139, 46);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel1.setText("top");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 170, 33, 28);

        top.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topActionPerformed(evt);
            }
        });
        getContentPane().add(top);
        top.setBounds(200, 160, 59, 47);

        sl4.setBackground(new java.awt.Color(255, 255, 255));
        sl4.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl4.setText("  ");
        sl4.setBorder(new javax.swing.border.MatteBorder(null));
        sl4.setOpaque(true);
        getContentPane().add(sl4);
        sl4.setBounds(310, 310, 175, 56);

        sl3.setBackground(new java.awt.Color(255, 255, 255));
        sl3.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl3.setText("  ");
        sl3.setBorder(new javax.swing.border.MatteBorder(null));
        sl3.setOpaque(true);
        getContentPane().add(sl3);
        sl3.setBounds(310, 370, 175, 56);

        sl2.setBackground(new java.awt.Color(255, 255, 255));
        sl2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl2.setText(" ");
        sl2.setBorder(new javax.swing.border.MatteBorder(null));
        sl2.setOpaque(true);
        getContentPane().add(sl2);
        sl2.setBounds(310, 430, 175, 56);

        sl1.setBackground(new java.awt.Color(255, 255, 255));
        sl1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl1.setText(" ");
        sl1.setBorder(new javax.swing.border.MatteBorder(null));
        sl1.setOpaque(true);
        getContentPane().add(sl1);
        sl1.setBounds(310, 490, 175, 56);

        sl0.setBackground(new java.awt.Color(255, 255, 255));
        sl0.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl0.setText(" ");
        sl0.setBorder(new javax.swing.border.MatteBorder(null));
        sl0.setOpaque(true);
        getContentPane().add(sl0);
        sl0.setBounds(310, 550, 175, 56);

        sl6.setBackground(new java.awt.Color(255, 255, 255));
        sl6.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl6.setText("  ");
        sl6.setBorder(new javax.swing.border.MatteBorder(null));
        sl6.setOpaque(true);
        getContentPane().add(sl6);
        sl6.setBounds(310, 190, 175, 56);

        sl5.setBackground(new java.awt.Color(255, 255, 255));
        sl5.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        sl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sl5.setText(" ");
        sl5.setBorder(new javax.swing.border.MatteBorder(null));
        sl5.setOpaque(true);
        getContentPane().add(sl5);
        sl5.setBounds(310, 250, 175, 56);

        jLabel10.setText("6");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(520, 210, 20, 20);

        jLabel11.setText("5");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(520, 270, 9, 20);

        jLabel12.setText("4");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 330, 9, 20);

        jLabel13.setText("3");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 390, 9, 20);

        jLabel14.setText("2");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 450, 9, 20);

        jLabel15.setText("1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(520, 510, 9, 20);

        jLabel16.setText("0");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(520, 570, 9, 20);

        jLabel17.setBackground(new java.awt.Color(0, 102, 51));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("Stack (Array implementation)");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 800, 70);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 22)); 
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 580, 85, 35);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 22)); 
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(680, 580, 75, 35);

        pack();
    }

    private void topActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
if(i>0)
{
        --i;
switch(i)
{
    case 0: sl0.setText("");
            top.setText("x");
            break;
    case 1: sl1.setText("");
            top.setText(""+(i-1));
            break;
    case 6: sl6.setText("");
            top.setText(""+(i-1));
            break;
    case 2: sl2.setText("");
            top.setText(""+(i-1));
            break;
    case 3: sl3.setText("");
            top.setText(""+(i-1));
            break;
    case 4: sl4.setText("");
            top.setText(""+(i-1));
            break;
    case 5: sl5.setText("");
            top.setText(""+(i-1));
            break;
}

if(i<=0)
{
    top.setText("x");
}}
else      {
          JOptionPane.showMessageDialog(null,"The stack is empty");
      }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
       userget.requestFocus();
       try{
           int user=Integer.parseInt(userget.getText());
       
        switch(i)
        {
            case 0: sl0.setText(""+user);
                   break;
            case 1: sl1.setText(""+user);
                   break;
            case 2: sl2.setText(""+user);
                   break;
            case 3: sl3.setText(""+user);
                   break;
            case 4: sl4.setText(""+user);
                   break;
            case 5: sl5.setText(""+user);
                   break;
            case 6: sl6.setText(""+user);
                   break;  
            default:break;             
        }
        top.setText(""+i);
        i++;
        userget.setText("");
    }
    catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,"Enter the value in the textfield");
      }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      i=0;
      sl0.setText("");
      sl1.setText("");
      sl2.setText("");
      sl3.setText("");
      sl4.setText("");
      sl5.setText("");
      sl6.setText("");
      top.setText("x");

    }

    private void usergetKeyPressed(java.awt.event.KeyEvent evt) {
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
    
       userget.requestFocus();
       try{
           int user=Integer.parseInt(userget.getText());
       
        switch(i)
        {
            case 0: sl0.setText(""+user);
                   break;
            case 1: sl1.setText(""+user);
                   break;
            case 2: sl2.setText(""+user);
                   break;
            case 3: sl3.setText(""+user);
                   break;
            case 4: sl4.setText(""+user);
                   break;
            case 5: sl5.setText(""+user);
                   break;
            case 6: sl6.setText(""+user);
                   break;  
            default:break;             
        }
        top.setText(""+i);
        i++;
        userget.setText("");
    }
    catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,"Enter the value in the textfield");
      }
}
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
this.dispose();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http:
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stack_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stack_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stack_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stack_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stack_Array().setVisible(true);
            }
        });
    }

    
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel sl0;
    private javax.swing.JLabel sl1;
    private javax.swing.JLabel sl2;
    private javax.swing.JLabel sl3;
    private javax.swing.JLabel sl4;
    private javax.swing.JLabel sl5;
    private javax.swing.JLabel sl6;
    private javax.swing.JTextField top;
    private javax.swing.JTextField userget;
    
}
