//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Company;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CompanyManager;
import javax.swing.JOptionPane;

public class CompanyEditor extends javax.swing.JFrame {
    
    private int companyCod;
    private boolean isEditing;

    public CompanyEditor(int companyCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consultando uma Empresa");        
        this.setResizable(false);
        this.companyCod = companyCod;
        this.isEditing = true;
        setDataToUpdate();
        setCompanyNameLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        codFormTextField = new javax.swing.JFormattedTextField();
        nameFormTextField = new javax.swing.JFormattedTextField();
        codLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Empresa");

        codFormTextField.setEditable(false);
        codFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFormTextFieldActionPerformed(evt);
            }
        });

        nameFormTextField.setEditable(false);
        nameFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        codLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codLabel.setText("Código");

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Nome");

        deleteButton.setText("Deletar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Editar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyLabel.setText("Empresa: ");

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codFormTextField)
                        .addComponent(nameFormTextField)
                        .addComponent(codLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(companyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(companyLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(codLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFormTextFieldActionPerformed

    }//GEN-LAST:event_codFormTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        CompanyManager manager = NoteMain.companyManager;
        
        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar? Está ação não pode ser desfeita!", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            manager.delCompany(companyCod);
            JOptionPane.showMessageDialog(null, "Empresa deletada com sucesso!");
            returnButtonActionPerformed(evt);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(isEditing){            
            nameFormTextField.setEditable(true);
            updateButton.setText("Atualizar");
            this.setTitle("Sistema de Cadastro - Editando uma Empresa");
            isEditing = false;   
            setCompanyNameLabel();
        }else{
            Company company = NoteMain.companyManager.getCompany(companyCod);
            int option = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar? Está ação não pode ser desfeita!", "Confirmar atualização", JOptionPane.YES_NO_OPTION);

            if(option == JOptionPane.YES_OPTION){
                try{
                    int index = getCompanyIndex();
                    if(index != -1){
                        company.setName(nameFormTextField.getText());
                        NoteMain.companyManager.getCompanyList().set(index, company);
                        JOptionPane.showMessageDialog(null, "Empresa atualizada com sucesso!"); 
                        setDataToUpdate();
                        nameFormTextField.setEditable(false);
                        updateButton.setText("Editar");
                        this.setTitle("Sistema de Cadastro - Consultando uma Empresa"); 
                        isEditing = true;
                        setCompanyNameLabel();
                    }else{
                       JOptionPane.showMessageDialog(null, "A empresa não foi encontrada na lista!"); 
                    }
                }catch(NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null, "Caractere invalido, por favor revise os campos!");
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new CompanySearch().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void setDataToUpdate(){
        Company company = NoteMain.companyManager.getCompany(companyCod);
                
        codFormTextField.setText(String.valueOf(company.getCod()));
        nameFormTextField.setText(company.getName());
    }
    
     private void setCompanyNameLabel(){
        
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";  
        }
        
        if(isEditing){
            this.companyLabel.setText("Empresa: " + companyName);
        }else{
            this.companyLabel.setText("Editando a empresa: " + companyName);
        }
     }
     
    private int getCompanyIndex(){
        int index;
        CompanyManager manager = NoteMain.companyManager;
        
        if(!manager.getCompanyList().isEmpty()){
            for(int i = 0; i < manager.getCompanyList().size(); i++){
                if(manager.getCompanyList().get(i).getCod() == companyCod){
                    return i;
                }
            }
        }
        return -1;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField codFormTextField;
    private javax.swing.JLabel codLabel;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JFormattedTextField nameFormTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}