package br.edu.uftpr.luanemanuel.projetofinal.layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationMenu extends JFrame{

    private JPanel registrationPanel;
    private JLabel titleLabel;
    private JButton registerCompanyButton;
    private JButton registerClientButton;
    private JButton registerNotebookButton;
    private JButton registerEmployeeButton;
    private JButton returnButton;

    public RegistrationMenu(){

        this.setContentPane(registrationPanel);
        this.setTitle("Menu de Cadastramento");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        registerCompanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CompanyRegister().setVisible(true);
            }
        });
    }
}
