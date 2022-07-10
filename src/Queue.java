import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class Queue extends javax.swing.JFrame {
    int i=0,j=0,k=0;
    public Queue() {
        initComponents();
         this.setLocationRelativeTo(null);
        head.setText("x");
        tail.setText("x");
    }
    private void initComponents() {

        userget = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tail = new javax.swing.JTextField();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q0 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        head = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(815, 630));
        setMinimumSize(new java.awt.Dimension(805, 627));
        setPreferredSize(new java.awt.Dimension(805, 627));
        getContentPane().setLayout(null);

        userget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usergetActionPerformed(evt);
            }
        });
        userget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usergetKeyPressed(evt);
            }
        });
        getContentPane().add(userget);
        userget.setBounds(20, 90, 113, 46);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 22));
        jButton1.setText("Enqueue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(189, 90, 120, 46);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 22));
        jButton2.setText("Dequeue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 90, 120, 46);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 22));
        jButton3.setText("Clear Queue");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 90, 160, 46);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setText("tail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 200, 40, 28);

        tail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailActionPerformed(evt);
            }
        });
        getContentPane().add(tail);
        tail.setBounds(340, 190, 59, 47);

        q2.setBackground(new java.awt.Color(255, 255, 255));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setBorder(new javax.swing.border.MatteBorder(null));
        q2.setOpaque(true);
        getContentPane().add(q2);
        q2.setBounds(410, 320, 100, 56);

        q3.setBackground(new java.awt.Color(255, 255, 255));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setBorder(new javax.swing.border.MatteBorder(null));
        q3.setOpaque(true);
        getContentPane().add(q3);
        q3.setBounds(520, 320, 100, 56);

        q6.setBackground(new java.awt.Color(255, 255, 255));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setBorder(new javax.swing.border.MatteBorder(null));
        q6.setOpaque(true);
        getContentPane().add(q6);
        q6.setBounds(630, 460, 100, 56);

        q4.setBackground(new java.awt.Color(255, 255, 255));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setBorder(new javax.swing.border.MatteBorder(null));
        q4.setOpaque(true);
        getContentPane().add(q4);
        q4.setBounds(630, 320, 100, 56);

        q9.setBackground(new java.awt.Color(255, 255, 255));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setBorder(new javax.swing.border.MatteBorder(null));
        q9.setOpaque(true);
        getContentPane().add(q9);
        q9.setBounds(300, 460, 100, 56);

        q0.setBackground(new java.awt.Color(255, 255, 255));
        q0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q0.setBorder(new javax.swing.border.MatteBorder(null));
        q0.setOpaque(true);
        getContentPane().add(q0);
        q0.setBounds(190, 320, 100, 56);

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setBorder(new javax.swing.border.MatteBorder(null));
        q1.setOpaque(true);
        getContentPane().add(q1);
        q1.setBounds(300, 320, 100, 56);

        q8.setBackground(new java.awt.Color(255, 255, 255));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setBorder(new javax.swing.border.MatteBorder(null));
        q8.setOpaque(true);
        getContentPane().add(q8);
        q8.setBounds(410, 460, 100, 56);

        q7.setBackground(new java.awt.Color(255, 255, 255));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setBorder(new javax.swing.border.MatteBorder(null));
        q7.setOpaque(true);
        getContentPane().add(q7);
        q7.setBounds(520, 460, 100, 56);

        q10.setBackground(new java.awt.Color(255, 255, 255));
        q10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q10.setBorder(new javax.swing.border.MatteBorder(null));
        q10.setOpaque(true);
        getContentPane().add(q10);
        q10.setBounds(190, 460, 100, 56);

        q5.setBackground(new java.awt.Color(255, 255, 255));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setBorder(new javax.swing.border.MatteBorder(null));
        q5.setOpaque(true);
        getContentPane().add(q5);
        q5.setBounds(630, 390, 100, 56);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setText("head");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 200, 49, 28);

        head.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headActionPerformed(evt);
            }
        });
        getContentPane().add(head);
        head.setBounds(170, 190, 59, 47);

        jLabel14.setBackground(new java.awt.Color(0, 102, 0));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Queue (Array implementation)");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 800, 60);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("10");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 440, 18, 20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("9");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(320, 440, 9, 20);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("8");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(430, 440, 9, 20);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("7");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(540, 440, 9, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("6");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(740, 480, 9, 20);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("1");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(320, 300, 9, 20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("2");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(430, 300, 9, 20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(540, 300, 9, 20);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("4");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(650, 300, 9, 20);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("5");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(740, 400, 9, 20);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(210, 300, 9, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 22));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 570, 85, 35);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 22));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(690, 570, 75, 35);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
switch(j)
        {
            case 0: q0.setText("");
                   k++;
                   break;
            case 1: q1.setText("");
                   k++;
                   break;
            case 2: q2.setText("");
                   k++;
                   break;
            case 3: q3.setText("");
                  k++;
                   break;
            case 4: q4.setText("");
            k++;
                   break;
            case 5: q5.setText("");
            k++;
                   break;
            case 6: q6.setText("");
            k++;
                   break;
            case 7: q7.setText("");
            k++;
                   break;
            case 8: q8.setText("");
            k++;
                   break;
            case 9: q9.setText("");
            k++;
                   break;
            case 10: q10.setText("");
            k++;
                   break;
            default:break;
        }
head.setText(""+k);
j++;
    }

    private void tailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void usergetActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
     i=0;
     j=0;
     k=0;
      q0.setText("");
      q1.setText("");
      q2.setText("");
      q3.setText("");
      q4.setText("");
      q5.setText("");
      q6.setText("");
      q7.setText("");
      q8.setText("");
      q9.setText("");
      q10.setText("");
      head.setText("x");
      tail.setText("x");
    }

    private void headActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
if(i==0)head.setText(""+0);
       userget.requestFocus();
      try{ int user=Integer.parseInt(userget.getText());
        switch(i)
        {
            case 0: q0.setText(""+user);
                   break;
            case 1: q1.setText(""+user);
                   break;
            case 2: q2.setText(""+user);
                   break;
            case 3: q3.setText(""+user);
                   break;
            case 4: q4.setText(""+user);
                   break;
            case 5: q5.setText(""+user);
                   break;
            case 6: q6.setText(""+user);
                   break;
            case 7: q7.setText(""+user);
                   break;
            case 8: q8.setText(""+user);
                   break;
            case 9: q9.setText(""+user);
                   break;
            case 10: q10.setText(""+user);
                   break;
            default:break;
        }
        tail.setText(""+i);
        i++;
        userget.setText(""); }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,"Enter the value in the textfield");
      }
    }

    private void usergetKeyPressed(java.awt.event.KeyEvent evt) {
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
    if(i==0)head.setText(""+0);
       userget.requestFocus();
      try{ int user=Integer.parseInt(userget.getText());
        switch(i)
        {
            case 0: q0.setText(""+user);
                   break;
            case 1: q1.setText(""+user);
                   break;
            case 2: q2.setText(""+user);
                   break;
            case 3: q3.setText(""+user);
                   break;
            case 4: q4.setText(""+user);
                   break;
            case 5: q5.setText(""+user);
                   break;
            case 6: q6.setText(""+user);
                   break;
            case 7: q7.setText(""+user);
                   break;
            case 8: q8.setText(""+user);
                   break;
            case 9: q9.setText(""+user);
                   break;
            case 10: q10.setText(""+user);
                   break;
            default:break;
        }
        tail.setText(""+i);
        i++;
        userget.setText(""); }
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

    public static void main(String args[]) {



        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queue().setVisible(true);
            }
        });
    }


    private javax.swing.JTextField head;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel q0;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JTextField tail;
    private javax.swing.JTextField userget;

}
