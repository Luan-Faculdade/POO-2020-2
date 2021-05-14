//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CustomerManager;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerSearch extends javax.swing.JFrame {
    
    int companyCod;

    public CustomerSearch(int companyCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consulta de Cliente");
        this.setResizable(false);
        this.companyCod = companyCod;                
        addCustomerinTable();
        setCompanyNameLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        customerScrollPane = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Cliente");

        selectButton.setText("Selecionar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        customerScrollPane.setViewportView(customerTable);

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyLabel.setText("Empresa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(companyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(companyLabel)
                .addGap(18, 18, 18)
                .addComponent(customerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        customerFinder();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new SearchMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        if(evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1){
            DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
            int selectedRow = customerTable.getSelectedRow();
            new CustomerEditor(companyCod,Integer.parseInt(model.getValueAt(selectedRow, 0).toString())).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_customerTableMouseClicked

    private void addCustomerinTable(){
        CustomerManager manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager();
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        
        for(Customers customer : manager.getCustomerList()){
            model.addRow(new Object[]{customer.getCod(),customer.getName()});
        }
    }
    
    private void customerFinder(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código do cliente", "Selecione o cliente", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int customerCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod) == null){
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    customerFinder();
                }else{
                    new CustomerEditor(companyCod, customerCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código do cliente deve ser formado de numeros!");
            customerFinder();
        }
    }
    
    private void setCompanyNameLabel(){
        
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";  
        }
        
        this.companyLabel.setText("Empresa: " + companyName);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyLabel;
    private javax.swing.JScrollPane customerScrollPane;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
