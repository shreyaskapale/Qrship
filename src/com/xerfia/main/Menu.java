package com.xerfia.main;
//XERFIA QrShip version : 1.0.0
//Developer : shreyas kapale
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.ArrayList;
import java.util.List;
public class Menu extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;

    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);

    public Menu() {
        initComponents();
        initWebcam();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        p_from = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p_f = new javax.swing.JTextField();
        p_to = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p_type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        p_arrival = new javax.swing.JLabel();
        add_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_fromActionPerformed(evt);
            }
        });
        jPanel4.add(p_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 410, 20));

        jLabel2.setText("Type :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel3.setText("From : ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jPanel4.add(p_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 410, 20));
        jPanel4.add(p_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 410, 20));

        jLabel4.setText("To :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        jPanel4.add(p_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 410, 20));

        jLabel5.setText("Fragile :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel6.setText("Qrship  : version 1.0");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, -1));

        jLabel7.setText("Open end Java project");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel1.setText("Tracking ID: ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        p_id.setToolTipText("");
        jPanel4.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 410, -1));

        jLabel8.setText("Date of Arrival : ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        p_arrival.setText("xxx");
        jPanel4.add(p_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 260, 20));

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 530, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_fromActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_buttonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel p_arrival;
    private javax.swing.JTextField p_f;
    private javax.swing.JTextField p_from;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_to;
    private javax.swing.JTextField p_type;
    // End of variables declaration//GEN-END:variables

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);

        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        executor.execute(this);
    }

    
    
 public static String getTime() {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now(); 
   
   return dtf.format(now);
     
  }  
    
public static List<String> package_list = new ArrayList<>();
public static String package_current;




    
    @Override
    public void run() {
        
        
     
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                //No result...
            }

           
            
            if (result != null) {
                
                String s = result.getText();
                String[] mypack = s.split(";");
                p_id.setText(mypack[0]);
                p_from.setText(mypack[1]);
                p_to.setText(mypack[2]);
                
                
               
            
                
                
                switch(mypack[3]){
                    case "E":
                        p_type.setText("Express");
                        break;
                    case "N":
                        p_type.setText("Normal");
                        break;
                    case "P":
                        p_type.setText("Prime");
                        break;
                    case "U":
                        p_type.setText("Urgent");
                        break;
                    default:
                        p_type.setText("not specified");
                        break;
                }
                
                
                package_current = s;
                
                
                p_arrival.setText(getTime());
                
                
                
                
                ///
                
          
                
                
                ///
                
                
                
                if(mypack[4].equals("1"))
                {
                    p_f.setText("Yes");
                }
                else{
                    p_f.setText("No");
                }
            }
        } while (true);
          
        
    }


    
    
    
        
    public class mouselisten extends Menu{
//  add_button.addActionListener(new ActionListener(){ 
//     public void actionPerformed(ActionEvent e){
//        //Button is pressed
//         package_list.add(package_current);
//         System.out.println(package_list);
//     }
// });   
        
 public void actionPerformed(ActionEvent e){
      if(e.getSource() == add_button){
         package_list.add(package_current);
         System.out.println(package_list);
      }   
        }
        
    }

                
    
    
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }
}

