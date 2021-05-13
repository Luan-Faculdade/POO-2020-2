//Nome: Luan Emanuel da Silva - RA: 2143860

import java.util.Scanner;

public class Read {

    public String ReadData(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);

        return scanner.nextLine();
    }
}
