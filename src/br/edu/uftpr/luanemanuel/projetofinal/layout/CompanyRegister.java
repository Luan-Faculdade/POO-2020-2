package br.edu.uftpr.luanemanuel.projetofinal.layout;

import br.edu.uftpr.luanemanuel.projetofinal.MainMenu;
import br.edu.uftpr.luanemanuel.projetofinal.data.Company;
import br.edu.uftpr.luanemanuel.projetofinal.managers.CompanyManager;
import br.edu.uftpr.luanemanuel.projetofinal.util.CodNumBelowException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompanyRegister extends JFrame{
    private JPanel companyRegisterPanel;
    private JLabel titleLabel;
    private JLabel dataCodLabel;
    private JLabel nameLabel;
    private JFormattedTextField codTextField;
    private JFormattedTextField nameTextField;
    private JButton registerButton;
    private JButton returnButton;

    public CompanyRegister() {
        this.setContentPane(companyRegisterPanel);
        this.setTitle("Cadastramento de Empresa");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CompanyManager manager = MainMenu.getCompanyManager();
                Company company = new Company();
                try {
                    company.setCod(Integer.parseInt(codTextField.getText()));
                    company.setName(nameTextField.getText());

                    if(manager.getCompany(company.getCod()) != null){
                        JOptionPane.showMessageDialog(null, "Empresa já cadastrada!");
                    }else{
                        manager.addCompany(company);
                        int result = JOptionPane.showConfirmDialog(null, "Cadastro da empresa de código " + company.getCod() + " efetuado com sucesso! Deseja cadastrar mais?","Empresa adicionada!", JOptionPane.YES_NO_OPTION);
                        if(result == JOptionPane.YES_OPTION){
                            nameTextField.setText("");
                            codTextField.setText("");
                        }else if(result == JOptionPane.NO_OPTION){
                            dispose();
                        }
                    }
                } catch (CodNumBelowException codNumBelowException) {
                    JOptionPane.showMessageDialog(null, "Numeros negativo não são permitidos!");

                }catch (NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null, "É permitido apenas numeros!");
                }
            }
        });
    }
}
