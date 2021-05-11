//Nome: Luan Emanuel da Silva - RA: 2143860

public abstract class UserData {

    private String name;
    private int cpf;
    private int cod;
    private final Address address = new Address();
    private final NotebookManager notebookManager = new NotebookManager();

    public UserData() {
    }

    public NotebookManager getNotebookManager() {
        return notebookManager;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    public void printClass(){
        System.out.println("Classe: " + this);
    }
}
