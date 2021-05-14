//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.data.Employee;
import br.edu.utfpr.luanemanuel.projetofinal.data.Notebook;
import br.edu.utfpr.luanemanuel.projetofinal.managers.EmployeeManager;
import br.edu.utfpr.luanemanuel.projetofinal.managers.NotebookManager;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NotebookSearch extends javax.swing.JFrame {
    
    private int companyCod;
    private boolean isCustomer;
    private int employeeCod;
    private int customerCod;

    public NotebookSearch(int companyCod, boolean isCustomer, int customerCod, int employeeCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consulta de Notebook");
        this.setResizable(false);
        this.companyCod = companyCod;     
        this.isCustomer = isCustomer;
        this.customerCod = customerCod;
        this.employeeCod = employeeCod;
        addNotebookinTable();
        setCompanyNameLabel();
        setDestinyLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        notebookScrollPane = new javax.swing.JScrollPane();
        notebookTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();
        destinyLabel = new javax.swing.JLabel();

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

        notebookTable.setModel(new javax.swing.table.DefaultTableModel(
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
        notebookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notebookTableMouseClicked(evt);
            }
        });
        notebookScrollPane.setViewportView(notebookTable);

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyLabel.setText("Empresa:");

        destinyLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        destinyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destinyLabel.setText("Destino: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notebookScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(companyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destinyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(companyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinyLabel)
                .addGap(18, 18, 18)
                .addComponent(notebookScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        notebookFinder();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new SearchMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void notebookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notebookTableMouseClicked
        if(evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1){
            DefaultTableModel model = (DefaultTableModel) notebookTable.getModel();
            int selectedRow = notebookTable.getSelectedRow();
            if(isCustomer){
                new NotebookEditor(companyCod,isCustomer, customerCod, 0, Integer.parseInt(model.getValueAt(selectedRow, 0).toString())).setVisible(true);
            }else{
                new NotebookEditor(companyCod,isCustomer, 0, employeeCod, Integer.parseInt(model.getValueAt(selectedRow, 0).toString())).setVisible(true);
            }
            dispose();
        }
    }//GEN-LAST:event_notebookTableMouseClicked

    private void addNotebookinTable(){
        NotebookManager manager;
        
        if(isCustomer){
            manager = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager();
        }else{
            manager = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager();
        }
        
        if(manager != null){            
        DefaultTableModel model = (DefaultTableModel) notebookTable.getModel();
            for(Notebook notebook : manager.getNotebookList()){
                model.addRow(new Object[]{notebook.getCod(),notebook.getName()});
            }
        }
    }
    
    private void notebookFinder(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código do notebook", "Selecione o notebook", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int notebookCod = Integer.parseInt(input);
                
                if(isCustomer){
                     if(NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getNotebookManager().getNotebook(notebookCod) == null){
                        JOptionPane.showMessageDialog(null, "Notebook não encontrado!");
                        notebookFinder();
                    }else{
                        new NotebookEditor(companyCod, isCustomer, customerCod, 0, notebookCod).setVisible(true);
                        dispose();
                    }
                }else{
                    if(NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getNotebookManager().getNotebook(notebookCod) == null){
                        JOptionPane.showMessageDialog(null, "Notebook não encontrado!");
                        notebookFinder();
                    }else{
                        new NotebookEditor(companyCod, isCustomer, 0, employeeCod, notebookCod).setVisible(true);
                        dispose();
                    }
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código do funcionário deve ser formado de numeros!");
            notebookFinder();
        }
    }
    
    private void setCompanyNameLabel(){
        
        String companyName = NoteMain.companyManager.getCompany(companyCod).getName();
        
        if(companyName.length() > 22){
            companyName = companyName.substring(0,22) + "...";  
        }
        
        this.companyLabel.setText("Empresa: " + companyName);
    }
    
    private void setDestinyLabel(){
        
        //true - Cliente / false - Funcionario
        if(isCustomer){
            String customerName = NoteMain.companyManager.getCompany(companyCod).getCustomerManager().getCustomers(customerCod).getName();
            if(customerName.length() > 22){
                customerName = customerName.substring(0,22) + "...";
            }
            this.destinyLabel.setText("Cliente: " + customerName);
        }else{
            String employeeName = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod).getName();
            if(employeeName.length() > 22){
                employeeName = employeeName.substring(0,22) + "...";
            }            
            this.destinyLabel.setText("Funcionário: " + employeeName);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyLabel;
    private javax.swing.JLabel destinyLabel;
    private javax.swing.JScrollPane notebookScrollPane;
    private javax.swing.JTable notebookTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
