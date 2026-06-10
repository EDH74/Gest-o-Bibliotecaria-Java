package formulario;

import classes.Emprestimo;
import classes.Leitor;
import classes.Obra;
import java.util.ArrayList;


public class FormEmprestimo extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormEmprestimo.class.getName());
    
    private ArrayList<Obra> listaObrasDoMain;
    private ArrayList<Leitor> listaLeitoresDoMain;
    private ArrayList<Emprestimo> listaEmprestimosDoMain;

    
    public FormEmprestimo(java.awt.Frame parent, boolean modal, ArrayList<Leitor> listaLeitores, ArrayList<Obra> listaObrasNoEmprestimo) {
        super(parent, modal);
        initComponents();
        
        this.listaObrasDoMain = listaObrasNoEmprestimo;
        this.listaLeitoresDoMain = listaLeitores;
        
        this.inserirObrasCB();
        this.inserirLeitoresCB();
    }
    
    public void inserirObrasCB(){
        cbObras.removeAllItems();
        
        for(Obra ob : this.listaObrasDoMain) {
            cbObras.addItem(ob.getTitulo() + " - " + ob.getIsbn());
        }
    }
    
    public void inserirLeitoresCB(){
        cbLeitores.removeAllItems();
        
        for (Leitor lt : this.listaLeitoresDoMain){
            cbLeitores.addItem(lt.getNome());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarEmprestimo = new javax.swing.JButton();
        excluirEmprestimo = new javax.swing.JButton();
        alterarInfoEmprestimo = new javax.swing.JButton();
        imprimirEmprestimo = new javax.swing.JButton();
        cbLeitores = new javax.swing.JComboBox<>();
        cbObras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        registrarEmprestimo.setText("Registrar Empréstimo");
        registrarEmprestimo.addActionListener(this::registrarEmprestimoActionPerformed);

        excluirEmprestimo.setText("Excluir Empréstimo");
        excluirEmprestimo.addActionListener(this::excluirEmprestimoActionPerformed);

        alterarInfoEmprestimo.setText("Alterar Informações do Empréstimo");
        alterarInfoEmprestimo.addActionListener(this::alterarInfoEmprestimoActionPerformed);

        imprimirEmprestimo.setText("Imprimir Empréstimo");
        imprimirEmprestimo.addActionListener(this::imprimirEmprestimoActionPerformed);

        cbLeitores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbObras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Obras");

        jLabel2.setText("Leitores");

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alterarInfoEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrarEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbObras, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imprimirEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(excluirEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbLeitores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(imprimirEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarInfoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbObras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmprestimoActionPerformed
        
    }//GEN-LAST:event_registrarEmprestimoActionPerformed

    private void alterarInfoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarInfoEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarInfoEmprestimoActionPerformed

    private void imprimirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirEmprestimoActionPerformed

    private void excluirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirEmprestimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarInfoEmprestimo;
    private javax.swing.JComboBox<String> cbLeitores;
    private javax.swing.JComboBox<String> cbObras;
    private javax.swing.JButton excluirEmprestimo;
    private javax.swing.JButton imprimirEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarEmprestimo;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
