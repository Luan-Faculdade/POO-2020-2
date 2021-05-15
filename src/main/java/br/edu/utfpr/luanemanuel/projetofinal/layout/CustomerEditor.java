//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CustomerManager;
import javax.swing.JOptionPane;

public class CustomerEditor extends javax.swing.JFrame {
    
    private int companyCod;
    private int customerCod;
    private boolean isEditing;

    public CustomerEditor(int companyCod, int customerCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consultando um Cliente");        
        this.setResizable(false);
        this.companyCod = companyCod;
        this.customerCod = customerCod;
        this.isEditing = true;        
        setCompanyNameLabel();
        setCustomerNameLabel();
        setDataToUpdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        codFormTextField = new javax.swing.JFormattedTextField();
        nameFormTextField = new javax.swing.JFormattedTextField();
        codLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        companyCodLabel = new javax.swing.JLabel();
        cpfFormTextField = new javax.swing.JFormattedTextField();
        rgFormTextField = new javax.swing.JFormattedTextField();
        cpfLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        dadosLabel = new javax.swing.JLabel();
        dadosLabel1 = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        streetFormTextField = new javax.swing.JFormattedTextField();
        numLabel = new javax.swing.JLabel();
        ufLabel = new javax.swing.JLabel();
        numFormTextField = new javax.swing.JFormattedTextField();
        cityFormTextField = new javax.swing.JFormattedTextField();
        ufFormTextField = new javax.swing.JFormattedTextField();
        cityLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        clientLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Editar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Cliente");

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

        companyCodLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        companyCodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyCodLabel.setText("Empresa: ");

        cpfFormTextField.setEditable(false);
        cpfFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpfFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpfFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFormTextFieldActionPerformed(evt);
            }
        });

        rgFormTextField.setEditable(false);
        rgFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rgFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cpfLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpfLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfLabel.setText("CPF");

        rgLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rgLabel.setText("RG");

        dadosLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dadosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosLabel.setText("Dados");

        dadosLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dadosLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosLabel1.setText("Endereço");

        streetLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        streetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        streetLabel.setText("Rua");

        streetFormTextField.setEditable(false);
        streetFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        streetFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        streetFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetFormTextFieldActionPerformed(evt);
            }
        });

        numLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numLabel.setText("Número");

        ufLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ufLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ufLabel.setText("UF");

        numFormTextField.setEditable(false);
        numFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFormTextFieldActionPerformed(evt);
            }
        });

        cityFormTextField.setEditable(false);
        cityFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ufFormTextField.setEditable(false);
        ufFormTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ufFormTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ufFormTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufFormTextFieldActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLabel.setText("Cidade");

        deleteButton.setText("Deletar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clientLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel.setText("Cliente: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(streetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dadosLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codFormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(codLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameFormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cpfFormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(cpfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rgFormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(rgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addComponent(streetFormTextField)
                        .addComponent(companyCodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numFormTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(numLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cityFormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ufFormTextField)
                                        .addComponent(ufLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyCodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientLabel)
                .addGap(30, 30, 30)
                .addComponent(dadosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfLabel)
                    .addComponent(rgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dadosLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(streetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(streetFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(ufLabel)
                    .addComponent(cityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufFormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new CustomerSearch(companyCod).setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(isEditing){            
            nameFormTextField.setEditable(true);
            cpfFormTextField.setEditable(true);
            rgFormTextField.setEditable(true);
            cityFormTextField.setEditable(true);
            numFormTextField.setEditable(true);
            streetFormTextField.setEditable(true);
            ufFormTextField.setEditable(true);
            updateButton.setText("Atualizar");
            this.setTitle("Sistema de Cadastro - Editando um Cliente");
            isEditing = false;   
            setCustomerNameLabel();
        }else{
            Customers customer = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod);
            int option = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar? Está ação não pode ser desfeita!", "Confirmar atualização", JOptionPane.YES_NO_OPTION);

            if(option == JOptionPane.YES_OPTION){
                if(!nameFormTextField.getText().isEmpty() && !codFormTextField.getText().isEmpty()
                        && !cpfFormTextField.getText().isEmpty() && !rgFormTextField.getText().isEmpty()
                        && !streetFormTextField.getText().isEmpty() && !numFormTextField.getText().isEmpty()
                        && !cityFormTextField.getText().isEmpty() && !ufFormTextField.getText().isEmpty()) {
                    try {
                        int index = getCustomerIndex();
                        if (index != -1) {
                            customer.setName(nameFormTextField.getText());
                            customer.setCpf(Integer.parseInt(cpfFormTextField.getText()));
                            customer.setRG(Integer.parseInt(rgFormTextField.getText()));
                            customer.getAddress().setCity(cityFormTextField.getText());
                            customer.getAddress().setNum(Integer.parseInt(numFormTextField.getText()));
                            customer.getAddress().setStreet(streetFormTextField.getText());
                            customer.getAddress().setUf(ufFormTextField.getText());
                            NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomerList().set(index, customer);
                            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                            setDataToUpdate();
                            nameFormTextField.setEditable(false);
                            cpfFormTextField.setEditable(false);
                            rgFormTextField.setEditable(false);
                            cityFormTextField.setEditable(false);
                            numFormTextField.setEditable(false);
                            streetFormTextField.setEditable(false);
                            ufFormTextField.setEditable(false);
                            updateButton.setText("Editar");
                            this.setTitle("Sistema de Cadastro - Consultando um Cliente");
                            isEditing = true;
                            setCustomerNameLabel();
                        } else {
                            JOptionPane.showMessageDialog(null, "O cliente não foi encontrada na lista!");
                        }
                    } catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null, "Caractere invalido, por favor revise os campos!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Parece que está faltando algum dado! Por favor, revise os campos.");
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void codFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFormTextFieldActionPerformed

    }//GEN-LAST:event_codFormTextFieldActionPerformed

    private void cpfFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFormTextFieldActionPerformed
        
    }//GEN-LAST:event_cpfFormTextFieldActionPerformed

    private void numFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFormTextFieldActionPerformed
        
    }//GEN-LAST:event_numFormTextFieldActionPerformed

    private void ufFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufFormTextFieldActionPerformed
        
    }//GEN-LAST:event_ufFormTextFieldActionPerformed

    private void streetFormTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetFormTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetFormTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        CustomerManager manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager();
        
         int option = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar? Está ação não pode ser desfeita!", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            manager.delCustomer(customerCod);
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
            returnButtonActionPerformed(evt);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void setCompanyNameLabel(){
        
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";  
        }
        
        this.companyCodLabel.setText("Empresa: " + companyName);
    }
    
    private void setCustomerNameLabel(){
        
        String customerName = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getName();
        
        if(customerName.length() > 22){
            customerName = customerName.substring(0,22) + "...";  
        }
        
        if(!isEditing){
            this.clientLabel.setText("Editando o cliente: " + customerName);
        }else{   
            this.clientLabel.setText("Cliente: " + customerName);
        }
    }
    
    private int getCustomerIndex(){
        int index;
        CustomerManager manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager();
        
        if(!manager.getCustomerList().isEmpty()){
            for(int i = 0; i < manager.getCustomerList().size(); i++){
                if(manager.getCustomerList().get(i).getCod() == customerCod){
                    return i;
                }
            }
        }
        return -1;
    }
    
    private void setDataToUpdate(){
        Customers customer = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod);
                
        codFormTextField.setText(String.valueOf(customer.getCod()));
        nameFormTextField.setText(customer.getName());
        cpfFormTextField.setText(String.valueOf(customer.getCpf()));
        rgFormTextField.setText(String.valueOf(customer.getRG()));
        streetFormTextField.setText(customer.getAddress().getStreet());
        numFormTextField.setText(String.valueOf(customer.getAddress().getNum()));
        cityFormTextField.setText(customer.getAddress().getCity());
        ufFormTextField.setText(customer.getAddress().getUf());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cityFormTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JFormattedTextField codFormTextField;
    private javax.swing.JLabel codLabel;
    private javax.swing.JLabel companyCodLabel;
    private javax.swing.JFormattedTextField cpfFormTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel dadosLabel;
    private javax.swing.JLabel dadosLabel1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JFormattedTextField nameFormTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField numFormTextField;
    private javax.swing.JLabel numLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JFormattedTextField rgFormTextField;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JFormattedTextField streetFormTextField;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JFormattedTextField ufFormTextField;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

