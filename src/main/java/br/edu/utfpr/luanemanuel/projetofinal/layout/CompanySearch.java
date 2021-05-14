//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Company;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CompanyManager;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompanySearch extends javax.swing.JFrame {

    public CompanySearch() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consulta de Empresa");
        addCompanyinTable();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        companyScrollPane = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Empresa");

        selectButton.setText("Selecionar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        companyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        companyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyTableMouseClicked(evt);
            }
        });
        companyScrollPane.setViewportView(companyTable);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(companyScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        companyFinder();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new SearchMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void companyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyTableMouseClicked
        if(evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1){
            DefaultTableModel model = (DefaultTableModel) companyTable.getModel();
            int selectedRow = companyTable.getSelectedRow();
            new CompanyEditor(Integer.parseInt(model.getValueAt(selectedRow, 0).toString())).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_companyTableMouseClicked

    private void addCompanyinTable(){
        CompanyManager manager = NoteMain.companyManager;
        DefaultTableModel model = (DefaultTableModel) companyTable.getModel();
        
        for(Company company : manager.getCompanyList()){
            model.addRow(new Object[]{company.getCod(),company.getName()});
        }
    }
    
    private void companyFinder(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código da empresa", "Selecione a empresa", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int companyCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod) == null){
                    JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
                    companyFinder();
                }else{
                    new CompanyEditor(companyCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código da empresa deve ser formado de numeros!");
            companyFinder();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane companyScrollPane;
    private javax.swing.JTable companyTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
