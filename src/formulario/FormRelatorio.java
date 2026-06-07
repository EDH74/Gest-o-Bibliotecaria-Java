package formulario;

import classes.FichaConservacao;
import classes.Obra;
import java.util.ArrayList;

public class FormRelatorio extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormRelatorio.class.getName());

    
    private ArrayList<Obra> listaObrasDoMain;
    private ArrayList<FichaConservacao> listaFichasDoMain;
    
    public FormRelatorio(java.awt.Frame parent, boolean modal, ArrayList<Obra> listaObrasNoRelatorio) {
        super(parent, modal);
        initComponents();
        
        this.listaObrasDoMain = listaObrasNoRelatorio;
        
        this.inserirObrasNoComboB();
    }

    private void inserirObrasNoComboB(){
        cbObras.removeAllItems();
        
        for(Obra ob : this.listaObrasDoMain) {
            cbObras.addItem(ob.getTitulo());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbObras = new javax.swing.JComboBox<>();
        verRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbObras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        verRelatorio.setText("Ver Relátorio");
        verRelatorio.addActionListener(this::verRelatorioActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(cbObras, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(verRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbObras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRelatorioActionPerformed
        try {
            Obra obraSelecionada = (Obra) cbObras.getSelectedItem();
    
            FichaConservacao fichaDaObra = null;
        
            for (FichaConservacao fc : this.listaFichasDoMain) {
                if (fc.getObra().equals(obraSelecionada)) {
                    fichaDaObra = fc;
                    break;
                }
            }
    
   
            String textoRelatorio = fichaDaObra.retornarFichaConservacaoCompleta();
            jTextArea1.setText(textoRelatorio); 
    
            } catch (NullPointerException e) {
            jTextArea1.setText("Erro: Selecione uma obra válida ou verifique se a lista de fichas existe.");
    
            } catch (Exception e) {
                jTextArea1.setText("Ocorreu um erro inesperado: " + e.getMessage());
            }
    }//GEN-LAST:event_verRelatorioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbObras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton verRelatorio;
    // End of variables declaration//GEN-END:variables
}
