package br.edu.uftpr.luanemanuel.projetofinal;

import br.edu.uftpr.luanemanuel.projetofinal.layout.RegistrationMenu;
import br.edu.uftpr.luanemanuel.projetofinal.managers.CompanyManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{

    private JPanel mainPanel;
    private JLabel titleLabel;
    private JButton createButoon;
    private JButton searchButton;
    private static final CompanyManager companyManager = new CompanyManager();

    public MainMenu(){
        createButoon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrationMenu().setVisible(true);
                setVisible(false);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cadastro de Notebooks");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JFrame frame = new MainMenu();
        frame.setContentPane(new MainMenu().mainPanel);
        frame.setVisible(true);
    }

    public static CompanyManager getCompanyManager() {
        return companyManager;
    }
}
