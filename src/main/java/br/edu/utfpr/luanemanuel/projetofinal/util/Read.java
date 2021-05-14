//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.util;

import java.util.Scanner;

public class Read {

    public String ReadData(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);

        return scanner.nextLine();
    }
}
