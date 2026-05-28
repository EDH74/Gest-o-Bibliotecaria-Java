package formulario;
import classes.*;
import java.util.ArrayList;


public class FormControleFichaConservacao extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormControleFichaConservacao.class.getName());
    private ArrayList<Funcionario> auxList;
    private ArrayList<Bibliotecaria> bibliotecariaList;
    private ArrayList<Obra> listaObras;
    private ArrayList<FichaConservacao> fichaConservacaoList;
    FormMain principal;
    
    public FormControleFichaConservacao(java.awt.Frame parent, boolean modal, ArrayList<Funcionario> auxList, ArrayList<Bibliotecaria> bibliotecariaList, ArrayList<Obra> listaObras, ArrayList<FichaConservacao> fichaConservacaoList) {
        this.auxList = auxList;
        this.bibliotecariaList = bibliotecariaList;
        this.listaObras = listaObras;
        this.fichaConservacaoList = fichaConservacaoList;
        
      
        
        super(parent, modal);
        initComponents();
        principal = (FormMain) this.getParent();
        
        updateComboObras();
    }
    
    public void updateComboObras(){
        comboBoxObras.removeAllItems();
        
        for (Obra o : listaObras){
            comboBoxObras.addItem(o.getTitulo());
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionariosGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        comboBoxObras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxFuncionarios = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        auxRadio = new javax.swing.JRadioButton();
        bibliotecarioRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Adicionar Intervenção");

        comboBoxObras.addActionListener(this::comboBoxObrasActionPerformed);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obras ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Funcionario");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboBoxFuncionarios.addActionListener(this::comboBoxFuncionariosActionPerformed);

        jButton2.setText("Excluir Intervenção");

        jButton3.setText("Modificar Informações");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Lista Intervenções cadastrada na obra");

        funcionariosGroup.add(auxRadio);
        auxRadio.setText("Auxiliar");

        funcionariosGroup.add(bibliotecarioRadio);
        bibliotecarioRadio.setText("Bibliotecario (a)");
        bibliotecarioRadio.addActionListener(this::bibliotecarioRadioActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(auxRadio)
                                .addGap(32, 32, 32)
                                .addComponent(bibliotecarioRadio))
                            .addComponent(comboBoxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(comboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(auxRadio)
                            .addComponent(bibliotecarioRadio))
                        .addGap(7, 7, 7)
                        .addComponent(comboBoxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFuncionariosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bibliotecarioRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecarioRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bibliotecarioRadioActionPerformed

    private void comboBoxObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxObrasActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton auxRadio;
    private javax.swing.JRadioButton bibliotecarioRadio;
    private javax.swing.JComboBox<String> comboBoxFuncionarios;
    private javax.swing.JComboBox<String> comboBoxObras;
    private javax.swing.ButtonGroup funcionariosGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
