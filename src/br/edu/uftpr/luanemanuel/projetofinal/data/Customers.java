//Nome: Luan Emanuel da Silva - RA: 2143860
package br.edu.uftpr.luanemanuel.projetofinal.data;

import br.edu.uftpr.luanemanuel.projetofinal.util.UserData;

public class Customers extends UserData {

    private long RG;

    public Customers() {
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    @Override
    public void printClass() {
        super.printClass();
        System.out.println("Classe mãe: br.uftpr.luanemanuel.projetofinal.UserData");
    }
}
