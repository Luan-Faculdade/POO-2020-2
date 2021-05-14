//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.layout;

import br.edu.utfpr.luanemanuel.projetofinal.NoteMain;
import br.edu.utfpr.luanemanuel.projetofinal.data.Employee;
import br.edu.utfpr.luanemanuel.projetofinal.managers.EmployeeManager;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeSearch extends javax.swing.JFrame {
    
    int companyCod;

    public EmployeeSearch(int companyCod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Cadastro - Consulta de Funcionário");
        this.setResizable(false);
        this.companyCod = companyCod;                
        addEmployeeinTable();
        setCompanyNameLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        employeeScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Consulta de Funcionário");

        selectButton.setText("Selecionar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        employeeScrollPane.setViewportView(employeeTable);

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
                    .addComponent(employeeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(employeeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        employeeFinder();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        new SearchMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        if(evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1){
            DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
            int selectedRow = employeeTable.getSelectedRow();
            new EmployeeEditor(companyCod,Integer.parseInt(model.getValueAt(selectedRow, 0).toString())).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_employeeTableMouseClicked

    private void addEmployeeinTable(){
        EmployeeManager manager = NoteMain.companyManager.getCompany(companyCod).getEmployeeManager();
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        
        for(Employee employee : manager.getEmployeeList()){
            model.addRow(new Object[]{employee.getCod(),employee.getName()});
        }
    }
    
    private void employeeFinder(){
        try{
            String input = JOptionPane.showInputDialog(null, "Insira o código do funcionário", "Selecione o funcionário", JOptionPane.QUESTION_MESSAGE);
            
            if(input != null){                
                int employeeCod = Integer.parseInt(input);
            
                if(NoteMain.companyManager.getCompany(companyCod).getEmployeeManager().getEmployee(employeeCod) == null){
                    JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
                    employeeFinder();
                }else{
                    new EmployeeEditor(companyCod, employeeCod).setVisible(true);
                    dispose();
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caractere invalido! O código do funcionário deve ser formado de numeros!");
            employeeFinder();
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
    private javax.swing.JScrollPane employeeScrollPane;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
