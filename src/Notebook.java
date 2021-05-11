//Nome: Luan Emanuel da Silva - RA: 2143860

public class Notebook {

    private int cod;
    private String name;
    private Specs specs = new Specs();
    private NoteInfo info = new NoteInfo();

    public Notebook() {
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public NoteInfo getInfo() {
        return info;
    }

    public void setInfo(NoteInfo info) {
        this.info = info;
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
}
