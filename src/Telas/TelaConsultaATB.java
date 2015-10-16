package Telas;

import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Enge
 */
public class TelaConsultaATB extends javax.swing.JFrame {
    /**
     * Creates new form TelaInicial
     */
    public TelaConsultaATB() {
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
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
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
        lista.add("2010G8351010"); lista.add("2010G6419013"); lista.add("2010L4280010");
        lista.add("2010M2651014"); lista.add("2010J2400013"); lista.add("2010H2419010");
        lista.add("2010H0221019"); lista.add("2010G3949018"); lista.add("2010D4845016");
        lista.add("300000000090"); lista.add("300000002991"); lista.add("580149037005");
        lista.add("I40949266004"); lista.add("2010D0934014"); lista.add("2010D4634010");
        lista.add("5801F6388000"); lista.add("9290L5833016"); lista.add("201086686011");
        lista.add("2010F4160010"); lista.add("2010I1150010"); lista.add("201RL8113010");
        lista.add("300000003300"); lista.add("2030A1374012"); lista.add("2010E1618011");
        lista.add("2010G6419013"); lista.add("2010E2128013"); lista.add("2010F5079010");
        lista.add("00RUJ7769005"); lista.add("420000003516"); lista.add("04ROL5641009");
        lista.add("04RON1618005"); lista.add("420000007947"); lista.add("300000002384");
        lista.add("04ROL4629002"); lista.add("300000003551"); lista.add("300000003550");
        lista.add("300000002378"); lista.add("2010E2888010"); lista.add("580148985007");
        lista.add("2010D4846012"); lista.add("2010J2378018"); lista.add("2010J2381019");
        lista.add("2010E1617015"); lista.add("4309M7773001"); lista.add("2010F0846015");
        lista.add("2010J2382015"); lista.add("2010J2377011"); lista.add("2010J2403012");
        lista.add("2010F3600016"); lista.add("2010J2388013"); lista.add("2010I4469018");
        lista.add("2010M4569013"); lista.add("2010F9946016"); lista.add("300000003130");
        lista.add("2010H0518011"); lista.add("5801A5482002"); lista.add("58ROM3245006");
        lista.add("04ROM4846006"); lista.add("2010E2735015"); lista.add("300000000216");
        lista.add("2010A2076018"); lista.add("2010D0035016"); lista.add("201RJ9917010");
        lista.add("0410D0354009"); lista.add("201RL8154019"); lista.add("420000007381");
        lista.add("300000004177"); lista.add("2010L0947010"); lista.add("300000000663");
        lista.add("2010D4847019"); lista.add("00RUJ7768015"); lista.add("420000004813");
        lista.add("0411G3634013"); lista.add("0411G3635010"); lista.add("2010F5078014");
        lista.add("300000004220"); lista.add("300000001894"); lista.add("2010J4775014");
        lista.add("201RM4321010"); lista.add("300000004789"); lista.add("300000002294");
        lista.add("300000005526"); lista.add("2010H3383010"); lista.add("2010L1353017");
        lista.add("2010G8028012"); lista.add("2010l7659010"); lista.add("2010k9294017");
        lista.add("920000006538"); lista.add("I40187506017"); lista.add("I40187850010");
        lista.add("300000004711"); lista.add("300000004705"); lista.add("cassete");
        
        if (lista.contains(atual)) {
            switch (atual) {
                case "0411G3634013": case "0411G3635010": case "2010F5078014" :
                case "2010F5079010": case "2010F0846015": case "2010J2388013": case "2010E2735015":
                    try {
                        Runtime.getRuntime().exec("C:\\JIG\\Jig_cass.bat cmd.exe /c");
                    } catch (IOException ex) {}
                       dispose();  
                     }
             switch (atual) {
                case "300000004705": 
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\PrinterIttUsb");
                    } catch (IOException ex) {}
                       dispose();  
                     }
            switch (atual) {
                case "2010G8351010":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\PB20TH.EXE /p");
                    } catch (IOException ex) {}
                       dispose();  
                     }
            switch (atual) {
                case "300000001894": case "2010J4775014": case "201RM4321010":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\MIT_BB4");
                    } catch (IOException ex) {}
                       dispose();  
                     }
             switch (atual) {
                case "420000007381":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\camera");
                    } catch (IOException ex) {}
                       dispose();  
                     }
           switch (atual) {
                case "300000004177": case "300000004789": case "300000002294":
                case "300000005526":        
                    dispose(); 
                     new TelaImpr().setVisible(true);
                     }
           switch (atual) {
                case "cassete": 
                     
                    dispose(); 
                     new TelaCassete().setVisible(true);
                     }
             switch (atual) {
                case "0410D0354009": case "2010L0947010":case "300000000663":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\PB20TH.EXE /d1 ");
                    } catch (IOException ex) {}
                       dispose();  
                     }
             switch (atual) {
                 case "2010L4280010": case "2010D4845016":  case "2010M2651014":
                 case "2010G3949018": case "2010J2400013":  case "300000000090":
                 case "2010H2419010": case "300000002991":  case "2010H0221019":
                 case "2010E2888010": case "2010D4846012":  case "2010J2378018": 
                 case "2010J2381019": case "2010D4847019":  case "2010E1618011": 
                 case "2010E1617015": case "4309M7773001":  case "2010J2382015": 
                 case "2010J2377011": case "2010J2403012":  case "2010F3600016":
                 case "2010I4469018":    
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\NMDTest");
                    } catch (IOException ex){} 
                    dispose(); 
                   }                  
            switch (atual) {
                 case "04ROL5641009": case "04RON1618005": case "420000007947":
                 case "300000002384": case "04ROL4629002": case "300000003551":
                 case "300000003550": case "300000002378": case "300000003130":
                 case "300000004711": 
                         dispose(); 
                     new TelaSagem().setVisible(true);
                        
                    dispose(); 
                   }
             switch (atual) {
                 case "580149037005": case "201086686011":  case "I40949266004":
                 case "580148985007": case "9290L5833016":  case "I40187506017":
                 case "I40187850010":    
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\MDDMTEST.EXE ");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            
             switch (atual) {
                 case "420000004813":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\SANKIO");
                    } catch (IOException ex){} 
                    dispose(); 
                   }
            switch (atual) {
                 case "201RL8154019": case "2010H3383010": case "2010M4569013":  case "2010L1353017":
                 case "2010l7659010": case "2010g8028012": case "2010k9294017":    
                    
                    dispose(); 
                     new TelaSlockFinger().setVisible(true);
                   }
            
             switch (atual) {
                case "2010D0934014": case "2010F4160010": case "2010D4634010": case "2030A1374012": 
                case "5801F6388000": case "2010G6419013": case "2010E2128013": case "420000003516": 
                case "5801A5482002": case "58ROM3245006": case "04ROM4846006": case "920000006538":
                  
                    dispose();
                    new TelaMsDos().setVisible(true);
                   }
              switch (atual) {
                case "2010H0518011": case "300000000216": case "2010A2076018": case "2010D0035016":
                case "201RJ9917010": case "300000004220":   
                 
                    dispose();
                    new TelaJigNac().setVisible(true);
                   }
             switch (atual) {
                case "2010I1150010":  case "201RL8113010":  case "300000003300":
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\teste\\jig_testes.exe");
                    } catch (IOException ex) {} 
                    dispose(); 
                   }
             switch (atual) {
                case "2010F9946016":  
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start C:\\JIG\\MIT_BB4");
                    } catch (IOException ex) {} 
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
                new TelaConsultaATB().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

  

}