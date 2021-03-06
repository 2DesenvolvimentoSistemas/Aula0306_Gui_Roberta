
package view;

import javax.swing.JOptionPane;
import model.design.Conversor;

/**
 *
 * @author ROBERTA
 */
public class ConversorGui extends javax.swing.JFrame {

    /**
     * Creates new form ConversorGui
     */
    public ConversorGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgOpcoes = new javax.swing.ButtonGroup();
        pnlConversor = new javax.swing.JPanel();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnlOpcoes = new javax.swing.JPanel();
        rbtCelFah = new javax.swing.JRadioButton();
        rbtFahCel = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de tempertura");
        setBackground(new java.awt.Color(255, 204, 255));

        lblTemperatura.setText("Temperatura em °C: ");

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(153, 0, 153));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pnlOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        btgOpcoes.add(rbtCelFah);
        rbtCelFah.setSelected(true);
        rbtCelFah.setText("°C para °F");
        rbtCelFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCelFahActionPerformed(evt);
            }
        });

        btgOpcoes.add(rbtFahCel);
        rbtFahCel.setText("°F para °C");
        rbtFahCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFahCelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtCelFah)
                .addContainerGap())
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtFahCel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(rbtCelFah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtFahCel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConversorLayout = new javax.swing.GroupLayout(pnlConversor);
        pnlConversor.setLayout(pnlConversorLayout);
        pnlConversorLayout.setHorizontalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular)
                        .addGap(54, 54, 54)
                        .addComponent(btnLimpar))
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblTemperatura)
                        .addGap(18, 18, 18)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlConversorLayout.setVerticalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemperatura)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpar))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        
        //declacao de variaveis
        double cel, fah;
        
        //criacao e instancia do objeto da classe conversor
        Conversor c = new Conversor();
        
        //estrutura de desicao
        if(rbtCelFah.isSelected()){
            try{
                //entrada
                cel = Double.parseDouble(txtTemperatura.getText());
                
                //saida
                lblResultado.setText(c.celFah(cel) + "°F");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Ops",0);
            }
        }else{
            try{
                //entrada
                fah = Double.parseDouble(txtTemperatura.getText());
                
                //saida
                lblResultado.setText(c.fahCel(fah) + "°C");
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ops!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
//        limpando o campo 
            txtTemperatura.setText(null);
            lblResultado.setText(null);
            
//            colocando o cursor no text view
                txtTemperatura.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbtCelFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCelFahActionPerformed
        // TODO add your handling code here:
        lblTemperatura.setText("Temperatura em °C: ");
        btnLimparActionPerformed(evt);
    }//GEN-LAST:event_rbtCelFahActionPerformed

    private void rbtFahCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFahCelActionPerformed
        // TODO add your handling code here:
        lblTemperatura.setText("Temperatura em °F: ");
        btnLimparActionPerformed(evt);
    }//GEN-LAST:event_rbtFahCelActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgOpcoes;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JPanel pnlConversor;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JRadioButton rbtCelFah;
    private javax.swing.JRadioButton rbtFahCel;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
