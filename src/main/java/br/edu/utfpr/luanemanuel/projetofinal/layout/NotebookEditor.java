//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.data.Employee;
import br.edu.utfpr.luanemanuel.projetofinal.data.Notebook;
import br.edu.utfpr.luanemanuel.projetofinal.managers.NotebookManager;
import javax.swing.JOptionPane;

public class NotebookEditor extends javax.swing.JFrame {
    
    private int companyCod;
    private boolean isCustomer;
    private int customerCod;
    private int employeeCod;
    private int notebookCod;
    private boolean isEditing;

    public NotebookEditor(int companyCod, boolean isCustomer, int customerCod, int employeeCod, int notebookCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consultando um Notebook");
        this.setResizable(false);
        this.companyCod = companyCod;
        this.isCustomer = isCustomer;
        this.customerCod = customerCod;
        this.employeeCod = employeeCod;
        this.notebookCod = notebookCod;
        this.isEditing = true;
        
        setCompanyNameLabel();        
        setDestinyLabel();
        setNotebookNameLabel();
        setDataToUpdate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        companyCodLabel = new javax.swing.JLabel();
        codTextField = new javax.swing.JFormattedTextField();
        nameTextField = new javax.swing.JFormattedTextField();
        pBrandTextField = new javax.swing.JFormattedTextField();
        pModelTextField = new javax.swing.JFormattedTextField();
        nBrandTextField = new javax.swing.JFormattedTextField();
        nModelTextField = new javax.swing.JFormattedTextField();
        ramTextField = new javax.swing.JFormattedTextField();
        screenTextField = new javax.swing.JFormattedTextField();
        dataLabel = new javax.swing.JLabel();
        processorLabel = new javax.swing.JLabel();
        noteInfoLabel = new javax.swing.JLabel();
        codLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        pBrandLabel = new javax.swing.JLabel();
        pModelLabel = new javax.swing.JLabel();
        ramLabel = new javax.swing.JLabel();
        screenLabel = new javax.swing.JLabel();
        nBrandLabel = new javax.swing.JLabel();
        nModelLabel = new javax.swing.JLabel();
        destinyLabel = new javax.swing.JLabel();
        notebookLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Notebook");

        updateButton.setText("Editar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        companyCodLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        companyCodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyCodLabel.setText("Empresa: ");

        codTextField.setEditable(false);
        codTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameTextField.setEditable(false);
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pBrandTextField.setEditable(false);
        pBrandTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pModelTextField.setEditable(false);
        pModelTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nBrandTextField.setEditable(false);
        nBrandTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nModelTextField.setEditable(false);
        nModelTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ramTextField.setEditable(false);
        ramTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        screenTextField.setEditable(false);
        screenTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dataLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataLabel.setText("Dados");

        processorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        processorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processorLabel.setText("Informações do Processador");

        noteInfoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        noteInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noteInfoLabel.setText("Informações do Notebook");

        codLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codLabel.setText("Código");

        nameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Nome");

        pBrandLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pBrandLabel.setText("Marca");

        pModelLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pModelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pModelLabel.setText("Modelo");

        ramLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ramLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ramLabel.setText("Quantidade de RAM");

        screenLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        screenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenLabel.setText("Tamanho da Tela");

        nBrandLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nBrandLabel.setText("Marca");

        nModelLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nModelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nModelLabel.setText("Modelo");

        destinyLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        destinyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destinyLabel.setText("Destino: ");

        notebookLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        notebookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notebookLabel.setText("Notebook:");

        deleteButton.setText("Deletar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(notebookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noteInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pBrandTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pModelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(pModelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ramTextField)
                                    .addComponent(ramLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(screenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(screenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nBrandLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(nBrandTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nModelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(nModelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(destinyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(codLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(companyCodLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyCodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notebookLabel)
                .addGap(18, 18, 18)
                .addComponent(dataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(processorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBrandLabel)
                    .addComponent(pModelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ramLabel)
                    .addComponent(screenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ramTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(noteInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nBrandLabel)
                    .addComponent(nModelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(isEditing){            
            nameTextField.setEditable(true);
            pBrandTextField.setEditable(true);
            pModelTextField.setEditable(true);
            ramTextField.setEditable(true);
            screenTextField.setEditable(true);
            nModelTextField.setEditable(true);
            nBrandTextField.setEditable(true);
            updateButton.setText("Atualizar");
            this.setTitle("Sistema de Cadastro - Editando um Notebook");
            isEditing = false;   
            setNotebookNameLabel();
        }else{
            Notebook notebook;
            
            if(isCustomer){
                notebook = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager().getNotebook(notebookCod);
            }else{
                notebook = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager().getNotebook(notebookCod);
            }
            
            if(notebook!=null){
                int option = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar? Está ação não pode ser desfeita!", "Confirmar atualização", JOptionPane.YES_NO_OPTION);

                if(option == JOptionPane.YES_OPTION){
                    try{
                        int index = getNotebookIndex();
                        if(index != -1){
                            notebook.setName(nameTextField.getText());
                            notebook.getSpecs().setProcessorBrand(pBrandTextField.getText());
                            notebook.getSpecs().setProcessorModel(pModelTextField.getText());
                            notebook.getSpecs().setRamAmt(Integer.parseInt(ramTextField.getText()));
                            notebook.getSpecs().setScreenSize(Integer.parseInt(screenTextField.getText()));
                            notebook.getInfo().setBrand(nBrandTextField.getText());
                            notebook.getInfo().setModel(nModelTextField.getText());
                            
                            if(isCustomer){
                                NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager().getNotebookList().set(index, notebook);
                            }else{
                                NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager().getNotebookList().set(index, notebook);
                            }
                            
                            JOptionPane.showMessageDialog(null, "Notebook atualizado com sucesso!"); 
                            setDataToUpdate();
                            nameTextField.setEditable(false);
                            pBrandTextField.setEditable(false);
                            pModelTextField.setEditable(false);
                            ramTextField.setEditable(false);
                            screenTextField.setEditable(false);
                            nModelTextField.setEditable(false);
                            nBrandTextField.setEditable(false);
                            updateButton.setText("Editar");
                            this.setTitle("Sistema de Cadastro - Consultando um Notebook"); 
                            isEditing = true;
                            setNotebookNameLabel();
                        }else{
                           JOptionPane.showMessageDialog(null, "O notebook não foi encontrada na lista!"); 
                        }
                    }catch(NumberFormatException numberFormatException){
                        JOptionPane.showMessageDialog(null, "Caractere invalido, por favor revise os campos!");
                    }
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new NotebookSearch(companyCod, isCustomer, customerCod, employeeCod).setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        NotebookManager manager;
        
        if(isCustomer){
            manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager();
        }else{
            manager = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager();
        }
        
        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar? Está ação não pode ser desfeita!", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            manager.delNotebook(notebookCod);
            JOptionPane.showMessageDialog(null, "Notebook deletado com sucesso!");
            returnButtonActionPerformed(evt);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void setCompanyNameLabel(){
        
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";
        }
        
        this.companyCodLabel.setText(this.companyCodLabel.getText() + companyName);
    }
    
    private void setDestinyLabel(){
        
        //true - Cliente / false - Funcionario
        if(isCustomer){
            Customers customer = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod);
            String customerName = customer.getName();
            if(customerName.length() > 22){
                customerName = customerName.substring(0,22) + "...";
            }
            this.destinyLabel.setText("Cliente: " + customerName);
        }else{
            Employee employee = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod);
            String employeeName = employee.getName();
            if(employeeName.length() > 22){
                employeeName = employeeName.substring(0,22) + "...";
            }            
            this.destinyLabel.setText("Funcionário: " + employeeName);
        }
    }
    
    private void setNotebookNameLabel(){
        
        String notebookName;
        
        if(isCustomer){
             notebookName = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager().getNotebook(notebookCod).getName();
        }else{
             notebookName = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager().getNotebook(notebookCod).getName();
        }
        
        if(notebookName != null){
            if(notebookName.length() > 22){
                notebookName = notebookName.substring(0,22) + "...";  
            }

            if(!isEditing){
                this.notebookLabel.setText("Editando o notebook: " + notebookName);
            }else{   
                this.notebookLabel.setText("Notebook: " + notebookName);
            }
        }
    }
    
    private int getNotebookIndex(){
        int index;
        NotebookManager manager;
        
        if(isCustomer){
            manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager();
        }else{
            manager = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager();
        }
        
        if(manager != null){
            if(!manager.getNotebookList().isEmpty()){
                for(int i = 0; i < manager.getNotebookList().size(); i++){
                    if(manager.getNotebookList().get(i).getCod() == notebookCod){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    private void setDataToUpdate(){
        Notebook notebook;
        
        if(isCustomer){
            notebook = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager().getNotebook(notebookCod);
        }else{
            notebook = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager().getNotebook(notebookCod); 
        }
        
        if(notebook != null){
            codTextField.setText(String.valueOf(notebook.getCod()));
            nameTextField.setText(notebook.getName());
            pBrandTextField.setText(notebook.getSpecs().getProcessorBrand());
            pModelTextField.setText(notebook.getSpecs().getProcessorModel());
            ramTextField.setText(String.valueOf(notebook.getSpecs().getRamAmt()));
            screenTextField.setText(String.valueOf(notebook.getSpecs().getScreenSize()));
            nBrandTextField.setText(notebook.getInfo().getBrand());
            nModelTextField.setText(notebook.getInfo().getModel());
        }
                
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLabel;
    private javax.swing.JFormattedTextField codTextField;
    private javax.swing.JLabel companyCodLabel;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel destinyLabel;
    private javax.swing.JLabel nBrandLabel;
    private javax.swing.JFormattedTextField nBrandTextField;
    private javax.swing.JLabel nModelLabel;
    private javax.swing.JFormattedTextField nModelTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField nameTextField;
    private javax.swing.JLabel noteInfoLabel;
    private javax.swing.JLabel notebookLabel;
    private javax.swing.JLabel pBrandLabel;
    private javax.swing.JFormattedTextField pBrandTextField;
    private javax.swing.JLabel pModelLabel;
    private javax.swing.JFormattedTextField pModelTextField;
    private javax.swing.JLabel processorLabel;
    private javax.swing.JLabel ramLabel;
    private javax.swing.JFormattedTextField ramTextField;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JFormattedTextField screenTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
