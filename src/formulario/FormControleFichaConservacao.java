package formulario;
import classes.*;
import java.io.EOFException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormControleFichaConservacao extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormControleFichaConservacao.class.getName());
    private ArrayList<Funcionario> auxList;
    private ArrayList<Bibliotecaria> bibliotecariaList;
    private ArrayList<FichaConservacao> listaFicha;
    private ArrayList<Obra> listaObras;
    private ArrayList<Categoria> categoriaList;
    
    FormMain principal;
    
    public FormControleFichaConservacao(java.awt.Frame parent, boolean modal, ArrayList<Funcionario> auxList,
            ArrayList<Bibliotecaria> bibliotecariaList, ArrayList<Obra> listaObras, ArrayList<FichaConservacao> listaFicha,
            ArrayList<Categoria> categoriaList) {
        super(parent, modal);
        this.auxList = auxList;
        this.bibliotecariaList = bibliotecariaList;
        this.listaObras = listaObras;
        this.listaFicha = listaFicha;
        this.categoriaList = categoriaList;
        initComponents();
        principal = (FormMain) this.getParent();
        
        updateComboFuncionarios();
        updateComboObra();
        updateComboCategoria();
    }
    
    public void updateComboObra(){
        comboBoxObras.removeAllItems();
        
        for (Obra o : listaObras){
            comboBoxObras.addItem(o.getTitulo() + "-" + o.getIsbn());
        }
    }
    
    
    public void updateComboFuncionarios(){
        if(auxRadio.isSelected()){
            comboBoxFuncionarios.removeAllItems();
            for (Funcionario f : auxList){
                comboBoxFuncionarios.addItem(f.getNome());
            }
        }else if(bibliotecarioRadio.isSelected()){
            comboBoxFuncionarios.removeAllItems();
            for (Funcionario f : bibliotecariaList){
                comboBoxFuncionarios.addItem(f.getNome());
            }
        }
    }
    
    public void updateComboCategoria(){
        comboBoxCategoria.removeAllItems();
        
        for (Categoria c : categoriaList){
            comboBoxCategoria.addItem(c.getNome());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionariosGroup = new javax.swing.ButtonGroup();
        cadastrarIntervencao = new javax.swing.JButton();
        comboBoxObras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxFuncionarios = new javax.swing.JComboBox<>();
        excluirIntervencao = new javax.swing.JButton();
        modificaInfo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        auxRadio = new javax.swing.JRadioButton();
        bibliotecarioRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cadastrarIntervencao.setText("Adicionar Intervenção");
        cadastrarIntervencao.addActionListener(this::cadastrarIntervencaoActionPerformed);

        comboBoxObras.addActionListener(this::comboBoxObrasActionPerformed);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obras ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Funcionario");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboBoxFuncionarios.addActionListener(this::comboBoxFuncionariosActionPerformed);

        excluirIntervencao.setText("Excluir Intervenção");
        excluirIntervencao.addActionListener(this::excluirIntervencaoActionPerformed);

        modificaInfo.setText("Modificar Informações");
        modificaInfo.addActionListener(this::modificaInfoActionPerformed);

        jButton4.setText("Lista Intervenções cadastrada na obra");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        funcionariosGroup.add(auxRadio);
        auxRadio.setSelected(true);
        auxRadio.setText("Auxiliar");
        auxRadio.addActionListener(this::auxRadioActionPerformed);

        funcionariosGroup.add(bibliotecarioRadio);
        bibliotecarioRadio.setText("Bibliotecario (a)");
        bibliotecarioRadio.addActionListener(this::bibliotecarioRadioActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jLabel3.setText("Categoria");

        comboBoxCategoria.addActionListener(this::comboBoxCategoriaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cadastrarIntervencao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(excluirIntervencao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(auxRadio)
                                        .addGap(32, 32, 32)
                                        .addComponent(bibliotecarioRadio))
                                    .addComponent(comboBoxFuncionarios, 0, 245, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarIntervencao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirIntervencao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(comboBoxObras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(auxRadio)
                            .addComponent(bibliotecarioRadio))
                        .addGap(7, 7, 7)
                        .addComponent(comboBoxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFuncionariosActionPerformed

    private void modificaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaInfoActionPerformed
        String obraSelecionada = (String) comboBoxObras.getSelectedItem();
        String[] isbn = obraSelecionada.split("-");
        Obra obra = principal.acharObra(isbn[1]);  //Pega a obra 
        FichaConservacao fichaExistente = principal.acharFichaConservacao(obra);  //pega a ficha de conservação da obra
        if(fichaExistente != null){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da intervenção a ser alterada"));
            Intervencao inter = fichaExistente.acharIntervencao(id);
            if (inter != null){
                String nome = JOptionPane.showInputDialog("Digite o nome da intervenção: ");
                String relato = JOptionPane.showInputDialog("Digite o Relato de dessa atividade: ");
                String nomeColaborador = (String) comboBoxFuncionarios.getSelectedItem();
                String cat = (String) comboBoxCategoria.getSelectedItem();
                Categoria categoria = principal.acharCategoria(cat);
                
                inter.setNome(nome);
                inter.setRelato(relato);
                inter.setColaborador(nomeColaborador);
                inter.setCategoria(categoria);
            } else{
                taSaida.setText("Id passado inválido, tente novamente!");
                return;
            } 
        } else{
            taSaida.setText("Obra não possui ficha existente");
            return;
        }
    }//GEN-LAST:event_modificaInfoActionPerformed

    private void bibliotecarioRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecarioRadioActionPerformed
       
    }//GEN-LAST:event_bibliotecarioRadioActionPerformed

    private void comboBoxObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxObrasActionPerformed

    private void auxRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxRadioActionPerformed
        
    }//GEN-LAST:event_auxRadioActionPerformed

    private void cadastrarIntervencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarIntervencaoActionPerformed
        String obraSelecionada = (String) comboBoxObras.getSelectedItem();
        String[] isbn = obraSelecionada.split("-");
        Obra obra = principal.acharObra(isbn[1]);
        FichaConservacao fichaExistente = principal.acharFichaConservacao(obra);
        FichaConservacao ficha = new FichaConservacao(obra);
        String[] acoes = {"Restauro", "Encardenacao", "Higienizacao"};
        
        try{
            if (fichaExistente == null){
                String nome = JOptionPane.showInputDialog("Digite o nome da intervenção: ");
                String data = JOptionPane.showInputDialog("Digite a data: ");
                Object acao = JOptionPane.showInputDialog(null, "Selecione o cargo do funcionário:", "Escolha o Cargo", JOptionPane.QUESTION_MESSAGE ,null, acoes, acoes[1]);
                String relato = JOptionPane.showInputDialog("Digite o Relato de dessa atividade: ");
                String nomeColaborador = (String) comboBoxFuncionarios.getSelectedItem();

                String cat = (String) comboBoxCategoria.getSelectedItem();
                Categoria categoria = principal.acharCategoria(cat);

                ficha.inserirIntervencao(obra, nome, data, acao.toString(), relato, nomeColaborador, categoria);
                listaFicha.add(ficha);
            } else{
                String nome = JOptionPane.showInputDialog("Digite o nome da intervenção: ");
                String data = JOptionPane.showInputDialog("Digite a data: ");
                Object acao = JOptionPane.showInputDialog(null, "Selecione o cargo do funcionário:", "Escolha o Cargo", JOptionPane.QUESTION_MESSAGE ,null, acoes, acoes[1]);
                String relato = JOptionPane.showInputDialog("Digite o Relato de dessa atividade: ");
                String nomeColaborador = (String) comboBoxFuncionarios.getSelectedItem();
                String cat = (String) comboBoxCategoria.getSelectedItem();
                Categoria categoria = principal.acharCategoria(cat);
                
                fichaExistente.inserirIntervencao(obra, nome, data, acao.toString(), relato, nomeColaborador, categoria);
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Erro: " + e.getMessage());
        }
        
        principal.atualizarIdFichas();
        
    }//GEN-LAST:event_cadastrarIntervencaoActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
       
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
            String obraSelecionada = (String) comboBoxObras.getSelectedItem();
            String[] isbn = obraSelecionada.split("-");
            Obra obra = principal.acharObra(isbn[1]);
            FichaConservacao fichaExistente = principal.acharFichaConservacao(obra);


            taSaida.setText("Todas Intervenções existentes da Obra " + isbn[0] + ":\n" );
            taSaida.append(fichaExistente.retornarTodasIntervencoes());
       }
       catch(Exception ue ){
           taSaida.setText("Erro " + ue.getMessage());
       } 
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void excluirIntervencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirIntervencaoActionPerformed
        try {
        
        int idDigitado = Integer.parseInt(JOptionPane.showInputDialog("ID da Intervenção"));
        
        // 2. Descobre qual obra está selecionada na ComboBox da tela
        String obraSelecionada = (String) comboBoxObras.getSelectedItem();
        if (obraSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma obra selecionada.");
            return;
        }
        String[] isbn = obraSelecionada.split("-");
        Obra obra = principal.acharObra(isbn[1]);
        
        // 3. Busca a Ficha de Conservação real que pertence a essa obra
        FichaConservacao fichaExistente = principal.acharFichaConservacao(obra);
        
        if (fichaExistente != null) {
            // 4. Usa a ficha da obra para procurar a intervenção pelo ID
            Intervencao inte = fichaExistente.acharIntervencao(idDigitado);
            
            if (inte != null) {
                // 5. Deleta o objeto usando o seu método corrigido (da imagem)
                fichaExistente.excluirPeloId(inte); 
                
                JOptionPane.showMessageDialog(this, "Intervenção excluída com sucesso!");
                
                // 6. Atualiza a caixa de texto na tela para mostrar a lista atualizada
                taSaida.setText("Todas Intervenções existentes da Obra " + isbn[0] + ":\n" );
                taSaida.append(fichaExistente.retornarFichaConservacaoCompleta());
            } else {
                JOptionPane.showMessageDialog(this, "Intervenção com o ID " + idDigitado + " não foi encontrada nesta obra.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Esta obra não possui nenhuma ficha de conservação ou intervenções cadastradas.");
        }
        

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido! Digite apenas números.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
        }
    }//GEN-LAST:event_excluirIntervencaoActionPerformed

                               

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton auxRadio;
    private javax.swing.JRadioButton bibliotecarioRadio;
    private javax.swing.JButton cadastrarIntervencao;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JComboBox<String> comboBoxFuncionarios;
    private javax.swing.JComboBox<String> comboBoxObras;
    private javax.swing.JButton excluirIntervencao;
    private javax.swing.ButtonGroup funcionariosGroup;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificaInfo;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
