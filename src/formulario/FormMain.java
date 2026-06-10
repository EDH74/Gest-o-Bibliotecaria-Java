/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;
import java.util.ArrayList;
import classes.*;


/**
 *
 * @author eduar
 */
public class FormMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMain.class.getName());

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        this.autoCategoria();
        this.testUser();
        this.testObras();
        
        listaLeitores.add(new Leitor("457.218.903-12", "Ana Silva"));
        listaLeitores.add(new Leitor("281.495.302-85", "Bruno Souza"));
        listaLeitores.add(new Leitor("743.159.620-44", "Carlos Oliveira"));
        listaLeitores.add(new Leitor("109.682.354-91", "Daniela Lima"));
        listaLeitores.add(new Leitor("852.361.479-06", "Eduardo Costa"));
        listaLeitores.add(new Leitor("369.147.258-52", "Fernanda Rodrigues"));
        listaLeitores.add(new Leitor("602.481.739-13", "Gabriel Almeida"));
        listaLeitores.add(new Leitor("914.738.251-67", "Juliana Pereira"));
        listaLeitores.add(new Leitor("523.691.487-30", "Lucas Martins"));
        listaLeitores.add(new Leitor("147.258.369-88", "Mariana Santos"));
    }
    
    final private ArrayList<Funcionario> auxList = new ArrayList();
    final private ArrayList<Bibliotecaria> bibliotecariaList = new ArrayList();
    final private ArrayList<Obra> listaObras = new ArrayList();
    final private ArrayList<Categoria> categoriaList = new ArrayList();
    final private ArrayList<FichaConservacao> listaFicha = new ArrayList();
    final private ArrayList<Leitor> listaLeitores = new ArrayList();
    final private ArrayList<Emprestimo> listaEmprestimos = new ArrayList();
    
    public void autoCategoria(){
      if(categoriaList != null && !categoriaList.isEmpty()) return;
      
        Categoria ct1 = new Categoria("Restauração de páginas");
        Categoria ct2 = new Categoria("Capa Dura");
        Categoria ct3 = new Categoria("Tratamento de Fungo");
        Categoria ct4 = new Categoria("Catalogação Física");
        Categoria ct5 = new Categoria("Outros");
        categoriaList.add(ct1);
        categoriaList.add(ct2);
        categoriaList.add(ct3);
        categoriaList.add(ct4);
        categoriaList.add(ct5);
    }
    
    private void testUser(){
        ArrayList<String> tel = new ArrayList();
        tel.add("298498498");
        
        Funcionario f1 = new Funcionario(1, "Eduardo", tel, "Dia");
        Funcionario f2 = new Funcionario(2, "Rafael", tel, "noite");
        auxList.add(f1);
        auxList.add(f2);
        
        Bibliotecaria b1 = new Bibliotecaria("1231651", "T.i");
        Bibliotecaria b2 = new Bibliotecaria("31651", "Construtor");
        bibliotecariaList.add(b1);
        bibliotecariaList.add(b2);
    }
    
    private void testObras(){
        ArrayList<Autor> listAutor = new ArrayList();
        Autor aut1 = new Autor("Nome1", "Brasil");
        Autor aut2 = new Autor("Nome2", "JP");
        
        Obra ob1 = new Obra("Titulo: Lupin", "ISBN: 8582", "02/01/2025", "Editora1");
        Obra ob2 = new Obra("Titulo: Harry Poter", "ISBN: 8514", "01/01/2024", "Editora2");
        
        listaObras.add(ob1);
        listaObras.add(ob2);
    }
    
    
    //Funções de Busca
    public Funcionario acharAux(int codInterno){
        for (Funcionario i : auxList){
            if (i.getCodInterno() == codInterno){   //Busca Funcionario Auxiliar
                return i;
            }
        }
        return null;
    }
    
    
    public Bibliotecaria acharBibliotecaria(String crb){
        for (Bibliotecaria c : bibliotecariaList){
            if(c.getCrb().equals(crb)){   //Busca bibliotecaria
                return c;
            }
        }
        return null;        
    }
    
    
    public Obra acharObra(String isbn){
        for (Obra i : listaObras){
            if (i.getIsbn().equals(isbn)){   //Busca Obra
                return i;
            }
        }
        return null;
    }
    
    public Categoria acharCategoria(String nome){
        for (Categoria i : categoriaList){
            if (i.getNome().equals(nome)){   //Busca Categoria por nome
                return i;
            }
        }
        return null;
    }
    
    public Categoria acharCategoria(int cod){
        for (Categoria i : categoriaList){
            if (cod == i.getCode()){   //Busca Categoria por id
                return i;
            }
        }
        return null;
    }
    
    
    public FichaConservacao acharFichaConservacao(Obra obra){
        for (FichaConservacao i : listaFicha){
            if (i.getObra() == obra){
                return i;
            }
        }
        return null;
    }
    
    //Funções de show
    public String showObras(){
        String msg = "Todas as Obras: ";
        
        for (Obra o : listaObras){
            msg += "\n " + o.toString();   //Mostra todas as obras cadastrada na lista
        }
        return msg;
    }
    
    
    public String showAux(){
        String msg = "Todas os auxiliares: ";
        
        for (Funcionario f : auxList){
            msg += "\n " + f.toString();   //Mostra todas os funcionario auxiliares cadastrada na lista
        }
        return msg;
    }
    
    
    public String showBibliotecarias(){
        String msg = "Todas as Bibliotecarias (o): ";

        for (Funcionario b : bibliotecariaList){
            msg += "\n " + b.toString();   //Mostra todas as bibliotecarias cadastrada na lista
        }
        return msg;
    }
    
    public String showCategorias(){
        String msg = "Todas as Categorias cadastradas: ";
        for (Categoria c : categoriaList){
            msg += "\n " + c.toString();   //Mostra todas as bibliotecarias cadastrada na lista
        }
        return msg;
    }
    

    //Função Ficha de Conservação
    public void atualizarIdFichas() {
        int cont = 1;
        
        for (FichaConservacao i : listaFicha){
            i.setCodigoFicha(cont);
            cont ++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        botaoAbrirAcervo = new javax.swing.JButton();
        CadastroFichas = new javax.swing.JButton();
        VerRelatorios = new javax.swing.JButton();
        VerRelatorios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Painel de administrador ");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        botaoAbrirAcervo.setText("Acervo de Obras");
        botaoAbrirAcervo.addActionListener(this::botaoAbrirAcervoActionPerformed);

        CadastroFichas.setText("Gerenciamento de Fichas de Conservação");
        CadastroFichas.addActionListener(this::CadastroFichasActionPerformed);

        VerRelatorios.setText("Ver Relatórios");
        VerRelatorios.addActionListener(this::VerRelatoriosActionPerformed);

        VerRelatorios1.setText("Resgistrar Empréstimos");
        VerRelatorios1.addActionListener(this::VerRelatorios1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastroFichas, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(botaoAbrirAcervo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerRelatorios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbrirAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerRelatorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormColaboradores telaColaboradores = new FormColaboradores(this, true, this.auxList, this.bibliotecariaList);
        telaColaboradores.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoAbrirAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirAcervoActionPerformed
        FormAcervo telaAcervo = new FormAcervo(this, true, listaObras);
        telaAcervo.setVisible(true);
    }//GEN-LAST:event_botaoAbrirAcervoActionPerformed

    private void CadastroFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFichasActionPerformed
        FormControleFichaConservacao controleFichaConservacao = new FormControleFichaConservacao(this, true, auxList, bibliotecariaList, listaObras, listaFicha, categoriaList);
        controleFichaConservacao.setVisible(true);
     
    }//GEN-LAST:event_CadastroFichasActionPerformed

    private void VerRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRelatoriosActionPerformed
        FormRelatorio telaRelatorio = new FormRelatorio(this, true, this.listaObras, this.listaFicha);
        
        telaRelatorio.setLocationRelativeTo(this);
        
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_VerRelatoriosActionPerformed

    private void VerRelatorios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRelatorios1ActionPerformed
        FormEmprestimo telaEmprestimo = new FormEmprestimo(this, true, this.listaLeitores, this.listaObras);
        
        telaEmprestimo.setLocationRelativeTo(this);
        telaEmprestimo.setVisible(true);
    }//GEN-LAST:event_VerRelatorios1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMain().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroFichas;
    private javax.swing.JButton VerRelatorios;
    private javax.swing.JButton VerRelatorios1;
    private javax.swing.JButton botaoAbrirAcervo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
