//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Company;
import br.edu.utfpr.luanemanuel.projetofinal.util.CodNumBelowException;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CompanyManager;
import javax.swing.JOptionPane;

public class CompanyRegister extends javax.swing.JFrame {

    public CompanyRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Cadastro de Empresa");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        codFormTextField = new javax.swing.JFormattedTextField();
        nameFormTextField = new javax.swing.JFormattedTextField();
        codLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Cadastramento de Empresa");

        codFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFormTextFieldActionPerformed(evt);
            }
        });

        nameFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        codLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codLabel.setText("Código");

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Nome");

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameFormTextField)
                    .addComponent(codFormTextField)
                    .addComponent(codLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
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
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFormTextFieldActionPerformed

    }//GEN-LAST:event_codFormTextFieldActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new RegistrationMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Company company = new Company();
        CompanyManager manager = NoteMain.companyManager;
        
        try{
            if(!nameFormTextField.getText().isEmpty() && !codFormTextField.getText().isEmpty()){
                company.setCod(Integer.parseInt(codFormTextField.getText()));
                company.setName(nameFormTextField.getText());
            
                if(manager.getCompany(company.getCod()) != null){
                    JOptionPane.showMessageDialog(null, "Empresa já cadastrada!");
                }else{
                    manager.addCompany(company);
                    int result = JOptionPane.showConfirmDialog(null, "Cadastro da empresa de código " + company.getCod() + " efetuado com sucesso! \nDeseja cadastrar mais?", "Empresa adicionada com sucesso", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        codFormTextField.setText("");
                        nameFormTextField.setText("");
                    }else if(result == JOptionPane.NO_OPTION){
                        new RegistrationMenu().setVisible(true);
                        dispose();
                    }                    
                }
            }else{
                JOptionPane.showMessageDialog(null, "Parece que está faltando algum dado! Por favor, revise os campos.");
            }
        }catch(CodNumBelowException codNumBelowException){
            JOptionPane.showMessageDialog(null, "Numeros negativos não são permitidos!");
        }catch(NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null, "Caractere invalido, por favor revise os campos!");
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField codFormTextField;
    private javax.swing.JLabel codLabel;
    private javax.swing.JFormattedTextField nameFormTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}