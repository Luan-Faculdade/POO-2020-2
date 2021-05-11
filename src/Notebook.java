//Nome: Luan Emanuel da Silva - RA: 2143860

public class Notebook implements IRegistered{

    private int cod;
    private int initQty = 0;
    private String name;
    private final Specs specs = new Specs();
    private final NoteInfo info = new NoteInfo();

    public Notebook() {
        initQty++;
    }

    public Specs getSpecs() {
        return specs;
    }

    public NoteInfo getInfo() {
        return info;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInitQty() {
        System.out.println("\nA classe notebook foi inicializada " + initQty + " vez(es)\n");
    }
}
