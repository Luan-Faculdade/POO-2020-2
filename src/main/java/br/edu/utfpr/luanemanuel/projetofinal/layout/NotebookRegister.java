//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.data.Employee;
import br.edu.utfpr.luanemanuel.projetofinal.data.Notebook;
import br.edu.utfpr.luanemanuel.projetofinal.managers.NotebookManager;
import br.edu.utfpr.luanemanuel.projetofinal.util.CodNumBelowException;
import javax.swing.JOptionPane;

public class NotebookRegister extends javax.swing.JFrame {
    
    private int companyCod;
    private boolean isCustomer;
    private int customerCod;
    private int employeeCod;

    public NotebookRegister(int companyCod, boolean isCustomer, int customerCod, int employeeCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Cadastro de Notebooks");
        this.setResizable(false);
        this.companyCod = companyCod;
        this.isCustomer = isCustomer;
        this.customerCod = customerCod;
        this.employeeCod = employeeCod;
        
        setCompanyNameLabel();        
        setDestinyLabel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Cadastramento de Notebook");

        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
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

        codTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pBrandTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pModelTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nBrandTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nModelTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ramTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(noteInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        NotebookManager notebookManager;
        Notebook notebook = new Notebook();
        if(isCustomer){            
            notebookManager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager();
        }else{
            notebookManager = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager();
        }
        
        try{
           if(!codTextField.getText().isEmpty() && !nameTextField.getText().isEmpty()
                   && !pBrandTextField.getText().isEmpty() && !pModelTextField.getText().isEmpty()
                   && !ramTextField.getText().isEmpty() && !screenTextField.getText().isEmpty()
                   && !nBrandTextField.getText().isEmpty() && !nModelTextField.getText().isEmpty()){
               
               notebook.setCod(Integer.parseInt(codTextField.getText()));
               notebook.setName(nameTextField.getText());
               notebook.getSpecs().setProcessorBrand(pBrandTextField.getText());
               notebook.getSpecs().setProcessorModel(pModelTextField.getText());
               notebook.getSpecs().setRamAmt(Integer.parseInt(ramTextField.getText()));
               notebook.getSpecs().setScreenSize(Integer.parseInt(screenTextField.getText()));
               notebook.getInfo().setBrand(nBrandTextField.getText());
               notebook.getInfo().setModel(nModelTextField.getText());
               
               if(notebookManager.getNotebook(notebook.getCod()) != null){
                   JOptionPane.showMessageDialog(null, "Notebook já cadastrado!");
               }else{
                   notebookManager.addNotebook(notebook);
                   int result = JOptionPane.showConfirmDialog(null, "Cadastro do notebook de código " + notebook.getCod() + " efetuado com sucesso! \nDeseja cadastrar mais?", "Notebook adicionado com sucesso", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        codTextField.setText("");
                        nameTextField.setText("");
                        pBrandTextField.setText("");
                        pModelTextField.setText("");
                        ramTextField.setText("");
                        screenTextField.setText("");
                        nBrandTextField.setText("");
                        nModelTextField.setText("");
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

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new RegistrationMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLabel;
    private javax.swing.JFormattedTextField codTextField;
    private javax.swing.JLabel companyCodLabel;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel destinyLabel;
    private javax.swing.JLabel nBrandLabel;
    private javax.swing.JFormattedTextField nBrandTextField;
    private javax.swing.JLabel nModelLabel;
    private javax.swing.JFormattedTextField nModelTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField nameTextField;
    private javax.swing.JLabel noteInfoLabel;
    private javax.swing.JLabel pBrandLabel;
    private javax.swing.JFormattedTextField pBrandTextField;
    private javax.swing.JLabel pModelLabel;
    private javax.swing.JFormattedTextField pModelTextField;
    private javax.swing.JLabel processorLabel;
    private javax.swing.JLabel ramLabel;
    private javax.swing.JFormattedTextField ramTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JFormattedTextField screenTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
