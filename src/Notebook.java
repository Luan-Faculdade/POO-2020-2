//Nome: Luan Emanuel da Silva - RA: 2143860

public class Notebook implements IRegistered{

    private int cod;
    private String name;
    private final Specs specs = new Specs();
    private final NoteInfo info = new NoteInfo();

    public Notebook() {
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

    public void setCod(int cod) throws CodNumBelowException {
        if(cod >=0){
            this.cod = cod;
        }else{
            throw new CodNumBelowException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printClassData() {
        System.out.println("\nA classe " + this + " possui os seguintes dados em suas variaveis:");
        System.out.println("Código do notebook: " + this.cod);
        System.out.println("Nome do notebook: " + this.name + "\n");
    }
}
