//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal;

import br.edu.utfpr.luanemanuel.projetofinal.layout.MainMenu;
import br.edu.utfpr.luanemanuel.projetofinal.managers.CompanyManager;

public class NoteMain {
    
    public static final CompanyManager companyManager = new CompanyManager();
    
    public static void main(String[] args){
        new MainMenu().setVisible(true);
    }
}
