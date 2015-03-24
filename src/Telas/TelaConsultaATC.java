package Telas;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * @author Enge
 */
public class TelaConsultaATC extends javax.swing.JFrame {
    /**
     * Creates new form TelaInicial
     */
    public TelaConsultaATC() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 250));

        jTextField1.setRequestFocusEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIGITE O CODIGO DO PRODUTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String atual = jTextField1.getText().toUpperCase();
             ArrayList<String> lista = new ArrayList<>();
             
         lista.add("920000006532"); lista.add("420000002678"); lista.add("470000000820");     
         lista.add("0508J6114018"); lista.add("0508G3232010"); lista.add("0508K6249013");
         lista.add("0508K6250011"); lista.add("0508I5004011"); lista.add("920000002190");             
         lista.add("0502G9286015"); lista.add("000000000000"); lista.add("000000000001");
         lista.add("920000000345"); lista.add("0508J6114018"); lista.add("0502M9907016");
         lista.add("470000002990"); lista.add("04RUL8799000"); lista.add("920000006832");
         lista.add("470000001134"); lista.add("470000001133"); lista.add("470000002070");
         lista.add("0407F0185018"); lista.add("9211G4350001"); lista.add("0507K0697012");
         lista.add("0502L4162001"); lista.add("0502F0788013"); lista.add("470000003366");
         lista.add("0502M6819000"); lista.add("470000002044"); lista.add("I50238837013");
         lista.add("0502G9481012"); lista.add("I50282763011"); lista.add("0502L7960006");
         lista.add("0502H1232016"); lista.add("920000012364"); lista.add("0507K3129015");
         lista.add("300000001160"); lista.add("300000001161"); lista.add("2010J5006014");
         lista.add("420000002900"); lista.add("9290M9108009"); lista.add("9290M5761000");
         lista.add("9290I4520008"); lista.add("9290I4521004"); lista.add("470000001913");
         lista.add("0507I1419010"); lista.add("0507H6277017"); lista.add("0507F4994011");
         lista.add("0507I2408012"); lista.add("0511G3230017"); lista.add("0511F9046011");
         lista.add("3901I7556001"); lista.add("3901M1051014"); lista.add("470000000572");
         lista.add("470000002577"); lista.add("0507L1126003"); lista.add("470000001711");
         lista.add("920000000534"); lista.add("0508I5003015"); lista.add("920000006832");
         lista.add("0508L5295014"); lista.add("0508L3935016"); lista.add("470000001546");
         lista.add("470000001618"); lista.add("201RL8582010"); lista.add("201RM6330010");
         lista.add("201RM3803011"); lista.add("0507L6940019"); lista.add("0507N1304012");
         lista.add("920000006535"); lista.add("920000006541");
                 if (lista.contains(atual)) {
           switch (atual) {
                 case "470000001134": case "470000001133": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\TM-T88V");
                    } catch (IOException ex){} 
                    dispose(); 
           }
           switch (atual) {
                 case "0508L5295014": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\QWPRINTER6000");
                    } catch (IOException ex){} 
                    dispose(); 
           }
           switch (atual) {
                 case "920000006541": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\futronic");
                    } catch (IOException ex){} 
                    dispose(); 
           }
           switch (atual) {
                 case "201RL8582010": case "201RM6330010": case "201RM3803011":
                     case "0507L6940019": case "0507N1304012": case "0507K0697012":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\KUBUS");
                    } catch (IOException ex){} 
                    dispose(); 
           }
           switch (atual) {
                 case "470000001546": case "470000001618":
                   dispose(); 
                     new TelaBurroughs().setVisible(true);
                     }
           switch (atual) {
                 case "0508I5003015": 
                     dispose(); 
                     new TelaLeituraZpm().setVisible(true);
                     }
            switch (atual) {
                 case "0508L3935016": 
                     dispose(); 
                     new TelaEcfItautec().setVisible(true);
                     }
           
           switch (atual) {
                 case "0507I1419010": case "0507H6277017": case "0507F4994011":
                 case "0507I2408012": case "0511G3230017": case "0511F9046011":
                 case "470000001913": case "920000012364": case "0507K3129015":
                   try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\GravaPLUS");
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\TEC55");
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\project1");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
          
            switch (atual) {
                 case "920000006532": case "420000002678": case "470000000820":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\DIEBOLD");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "420000002900": case "9290I4520008": case "9290I4521004":
                     try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\ZPM");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
           
                   switch (atual) {
                 case "300000001160": case "300000001161": case "2010J5006014":
                    dispose(); 
                     new TelaContrFiscalItautec().setVisible(true);
                     }
             switch (atual) {
                 case "470000002577":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\PINPAD910");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
             switch (atual) {
                 case "470000002990": 
                    try {
                        
                        JOptionPane.showMessageDialog(null,"FAVOR UTILIZAR A COM9");
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\TORRE");
                                                             
                       
                    } catch (IOException ex){} 
                   
                    dispose(); 
                   }
            switch (atual) {
                 case "0502G9286015": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\MAGELLAN");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "0502M9907016": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\MGLOSP");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "0502M6819000": case "470000002044":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\Aladdin");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
             switch (atual) {
                 case "I50238837013": case "0502G9481012": case "I50282763011":
                 case "0502L7960006": case "0502H1232016":    
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\HyperII");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "0502L4162001": case "0502F0788013": case "470000003366":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\metroset2");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
             switch (atual) {
                 case "0407F0185018": case "9211G4350001": case "920000006535": 
              
                    dispose(); 
                     new TelaMsDos().setVisible(true);
                   }
            switch (atual) {
                case "470000002070": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\Hiper");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "04RUL8799000": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\CUSTOM");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
           switch (atual) {
                case "920000006832": case "470000001711":
                    dispose(); 
                     new TelaEcfEpson().setVisible(true);
                     }             
             switch (atual) {
                case "920000000345":case "0508J6114018":  
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\TMFlashWriter");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
             switch (atual) {
                 case "0508G3232010": case "920000000534":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\TMFlashWriter1");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
              switch (atual) {
                 case "3901I7556001": case "3901M1051014": case "470000000572":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\LSCAN");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "0508J6114018": case "0508G3232010": case "0508K6249013":
                 case "0508K6250011": case "0508I5004011": case "920000002190": 
                 case "9290M9108009": case "9290M5761000":    
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\Demolog2");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
                  
            } else {
            dispose();
            new TelaFinal().setVisible(true);
                    }
    }//GEN-LAST:event_jTextField1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                int TelaInicial = 0;
                System.exit(TelaInicial);
                new TelaConsultaATC().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
////
  

}