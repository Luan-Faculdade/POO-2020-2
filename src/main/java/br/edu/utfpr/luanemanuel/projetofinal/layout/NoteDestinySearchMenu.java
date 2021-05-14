//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.data.Employee;
import javax.swing.JOptionPane;

public class NoteDestinySearchMenu extends javax.swing.JFrame {
    
    private int companyCod;

    public NoteDestinySearchMenu(int companyCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Menu Notebook");
        this.companyCod = companyCod;
        setCompanyLabel();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        codTextLabel = new javax.swing.JFormattedTextField();
        codLabel = new javax.swing.JLabel();
        destinyComboBox = new javax.swing.JComboBox<>();
        companyLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Notebook");

        selectButton.setText("Selecionar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        codTextLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        codLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codLabel.setText("Código do Cliente");
        codLabel.setFocusable(false);
        codLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        destinyComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        destinyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário" }));
        destinyComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        destinyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinyComboBoxActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyLabel.setText("Empresa: ");

        questionLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Selecione para quem deseja consultar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(companyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyLabel)
                .addGap(18, 18, 18)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destinyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(codLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnButton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        boolean isCustomer = true;
        
        if(destinyComboBox.getSelectedIndex() == 0){
            isCustomer = true;
        }else if(destinyComboBox.getSelectedIndex() == 1){
            isCustomer = false;
        }
        
        try{
            if(!codTextLabel.getText().isEmpty()){
                    if(isCustomer){            
                    Customers customer = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(Integer.parseInt(codTextLabel.getText()));
                
                    if(customer != null){
                        new NotebookSearch(companyCod, isCustomer, customer.getCod(), 0).setVisible(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                }else{
                    Employee employee = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(Integer.parseInt(codTextLabel.getText()));
                
                    if(employee != null){
                        new NotebookSearch(companyCod, isCustomer, 0, employee.getCod()).setVisible(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Parece que está faltando algum dado! Por favor, revise os campos.");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido, por favor revise os campos!");
        }
        
    }//GEN-LAST:event_selectButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new SearchMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void destinyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinyComboBoxActionPerformed
       if(destinyComboBox.getSelectedIndex() == 0){
            codLabel.setText("Código do Cliente");
        }else if(destinyComboBox.getSelectedIndex() == 1){
            codLabel.setText("Código do Funcionário");
        }
    }//GEN-LAST:event_destinyComboBoxActionPerformed

    private void setCompanyLabel(){
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";
        }
        
        this.companyLabel.setText(this.companyLabel.getText() + companyName);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLabel;
    private javax.swing.JFormattedTextField codTextLabel;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JComboBox<String> destinyComboBox;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
