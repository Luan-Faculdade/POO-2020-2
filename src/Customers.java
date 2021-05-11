//Nome: Luan Emanuel da Silva - RA: 2143860

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
        System.out.println("Classe filha");
    }
}
