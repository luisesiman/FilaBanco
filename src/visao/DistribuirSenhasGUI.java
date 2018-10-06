package visao;

import controle.Controle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import modelo.Senha;
import util.Tipo;

/**
 *
 * @author Usuário
 */
public class DistribuirSenhasGUI extends javax.swing.JFrame {

    private Controle controle;
    private Senha senha;
    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public DistribuirSenhasGUI(Controle controle) {
        initComponents();
        this.controle = controle;
        buttonGroup1.add(jRadioButtonComum);
        buttonGroup1.add(jRadioButtonVIP);
        buttonGroup1.add(jRadioButtonPreferencial);
        jLabelHora.setText(format.format(new Date()));
        timer();
    }

    public void timer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelHora.setText(format.format(new Date()));
            }
        });
        timer.setRepeats(true);
        timer.start();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonComum = new javax.swing.JRadioButton();
        jRadioButtonVIP = new javax.swing.JRadioButton();
        jRadioButtonPreferencial = new javax.swing.JRadioButton();
        jLabelHora = new javax.swing.JLabel();
        jButtonRetirar = new javax.swing.JButton();
        jButtonChamar = new javax.swing.JButton();
        jButtonSenhaAtual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de senha:");

        jLabel2.setText("Horário Atual:");

        jRadioButtonComum.setText("Comum");

        jRadioButtonVIP.setText("VIP");

        jRadioButtonPreferencial.setText("Preferencial");

        jLabelHora.setText("00:00:00");

        jButtonRetirar.setText("Retirar");
        jButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarActionPerformed(evt);
            }
        });

        jButtonChamar.setText("Tela de chamada");
        jButtonChamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChamarActionPerformed(evt);
            }
        });

        jButtonSenhaAtual.setText("Tela Senha Atual");
        jButtonSenhaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSenhaAtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHora)
                            .addComponent(jRadioButtonPreferencial)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonComum)
                                .addGap(152, 152, 152)
                                .addComponent(jButtonRetirar))
                            .addComponent(jRadioButtonVIP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButtonChamar)
                        .addGap(112, 112, 112)
                        .addComponent(jButtonSenhaAtual)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButtonComum)
                    .addComponent(jButtonRetirar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonVIP)
                .addGap(6, 6, 6)
                .addComponent(jRadioButtonPreferencial)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChamar)
                    .addComponent(jButtonSenhaAtual))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChamarActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaChamarCliente();
        controle.fecharTelaDistribuirSenha();
    }//GEN-LAST:event_jButtonChamarActionPerformed

    private void jButtonSenhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSenhaAtualActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaSenhaAtual();
        controle.fecharTelaDistribuirSenha();
    }//GEN-LAST:event_jButtonSenhaAtualActionPerformed

    private void jButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarActionPerformed
        // TODO add your handling code here:
        int tipo;
        if (jRadioButtonComum.isSelected()) {
            tipo = Tipo.COMUM;
        } else if (jRadioButtonVIP.isSelected()) {
            tipo = Tipo.VIP;
        } else if (jRadioButtonPreferencial.isSelected()) {
            tipo = Tipo.PREFERENCIAL;
        } else {
            tipo = Tipo.COMUM;
        }
        senha = controle.emitirSenha(tipo, new Date());
        JOptionPane.showMessageDialog(this, "Sua senha é " + senha.getId() + "\n Retirada às " + format.format(senha.getHoraretirada()),
                "Senha retirada", JOptionPane.INFORMATION_MESSAGE);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButtonRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonChamar;
    private javax.swing.JButton jButtonRetirar;
    private javax.swing.JButton jButtonSenhaAtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JRadioButton jRadioButtonComum;
    private javax.swing.JRadioButton jRadioButtonPreferencial;
    private javax.swing.JRadioButton jRadioButtonVIP;
    // End of variables declaration//GEN-END:variables
}