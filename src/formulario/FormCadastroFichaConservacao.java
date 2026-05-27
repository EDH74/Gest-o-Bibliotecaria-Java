package formulario;
import java.util.ArrayList;
import classes.*;
import java.lang.classfile.TypeAnnotation;

/**
 *
 * @author eduar
 */
public class FormCadastroFichaConservacao extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCadastroFichaConservacao.class.getName());
    private ArrayList<Obra> listaObra;
    private ArrayList<Funcionario> auxList;
    private ArrayList<Bibliotecaria> bibliotecariaList;
    private ArrayList<FichaConservacao> listaFichas;
    FormMain principal;
    
    public FormCadastroFichaConservacao(java.awt.Frame parent, boolean modal, ArrayList<Obra> listaObra, ArrayList<Funcionario> auxList, ArrayList<Bibliotecaria> bibliotecariaList, ArrayList<FichaConservacao> listaFichas) {
        this.listaObra = listaObra;
        this.auxList = auxList;
        this.bibliotecariaList = bibliotecariaList;
        this.listaFichas = listaFichas;
        
        super(parent, modal);
        initComponents();
        principal = (FormMain) this.getParent();
        
        this.atualizarCombo();
    }
    
    public void atualizarCombo(){
        auxiliar.addActionListener(e -> {
           comboBox.removeAllItems();
           for (Funcionario a : auxList){
                comboBox.addItem(a.getNome());
            }
        });
        
        bibliotecario.addActionListener(e -> {
           comboBox.removeAllItems();
           for (Bibliotecaria b : bibliotecariaList){
                comboBox.addItem(b.getNome());
            }
        });
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        adicionarFicha = new javax.swing.JButton();
        auxiliar = new javax.swing.JRadioButton();
        bibliotecario = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        alterarDados = new javax.swing.JButton();
        mostrarFichas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        adicionarFicha.setText("Criar Ficha de Conservação");
        adicionarFicha.addActionListener(this::adicionarFichaActionPerformed);

        buttonGroup1.add(auxiliar);
        auxiliar.setText("Auxiliar");

        buttonGroup1.add(bibliotecario);
        bibliotecario.setText("Bibliotecario");
        bibliotecario.addActionListener(this::bibliotecarioActionPerformed);

        jLabel1.setText("Quem vai realizar a operação ?");

        alterarDados.setText("Alterar dados");
        alterarDados.addActionListener(this::alterarDadosActionPerformed);

        mostrarFichas.setText("Ver Lista de fichas cadastrado");

        jButton1.setText("Excluir dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mostrarFichas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(alterarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bibliotecario)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auxiliar)
                    .addComponent(bibliotecario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarFichaActionPerformed

    private void alterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarDadosActionPerformed

    private void bibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bibliotecarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarFicha;
    private javax.swing.JButton alterarDados;
    private javax.swing.JRadioButton auxiliar;
    private javax.swing.JRadioButton bibliotecario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mostrarFichas;
    // End of variables declaration//GEN-END:variables
}
