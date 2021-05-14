//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import javax.swing.JOptionPane;

public class SearchMenu extends javax.swing.JFrame {

    public SearchMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Menu de Consulta");
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        titleLabel = new javax.swing.JLabel();
        clientButton = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();
        notebookButton = new javax.swing.JButton();
        companyButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Menu de Consulta");

        clientButton.setText("Cliente");
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });

        employeeButton.setText("Funcionario");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        notebookButton.setText("Notebook");
        notebookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notebookButtonActionPerformed(evt);
            }
        });

        companyButton.setText("Empresa");
        companyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyButtonActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(returnButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(companyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(notebookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(employeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notebookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(returnButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void companyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyButtonActionPerformed
        new CompanySearch().setVisible(true);
        dispose();
    }//GEN-LAST:event_companyButtonActionPerformed

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        customerSearch();
    }//GEN-LAST:event_clientButtonActionPerformed

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        employeeSearch();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void notebookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notebookButtonActionPerformed
        notebookSearch();
    }//GEN-LAST:event_notebookButtonActionPerformed

    private void customerSearch(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código da empresa", "Selecione a empresa", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int companyCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod) == null){
                    JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
                    customerSearch();
                }else{
                    new CustomerSearch(companyCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código da compania deve ser formado de numeros!");
            customerSearch();
        }
    }
    
    private void employeeSearch(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código da empresa", "Selecione a empresa", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int companyCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod) == null){
                    JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
                    employeeSearch();
                }else{
                    new EmployeeSearch(companyCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código da compania deve ser formado de numeros!");
            employeeSearch();
        }
    }
    
    private void notebookSearch(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código da empresa", "Selecione a empresa", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int companyCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod) == null){
                    JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
                    notebookSearch();
                }else{
                    new NoteDestinySearchMenu(companyCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código da compania deve ser formado de numeros!");
            notebookSearch();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientButton;
    private javax.swing.JButton companyButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton notebookButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
