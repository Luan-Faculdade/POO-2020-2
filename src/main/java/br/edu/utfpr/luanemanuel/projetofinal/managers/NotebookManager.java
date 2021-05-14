//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.managers;

import br.edu.utfpr.luanemanuel.projetofinal.util.CodNumBelowException;
import br.edu.utfpr.luanemanuel.projetofinal.data.Notebook;
import br.edu.utfpr.luanemanuel.projetofinal.util.Read;
import java.util.ArrayList;
import java.util.List;

public class NotebookManager {

    private final Read read = new Read();
    private final List<Notebook> notebookList = new ArrayList<>();

    public void addNotebook(Notebook notebook){

        if(getNotebook(notebook.getCod()) == null){
            notebookList.add(notebook);
            System.out.println("\nCadastro do notebook de COD " + notebook.getCod() + " efetuado com sucesso!");
        }else{
            System.out.println("\nNotebook já cadastrado!");
        }
    }

    public Notebook getNotebook(int notebookCod){
        if(!notebookList.isEmpty()){
            for (Notebook value : notebookList) {
                if (value.getCod() == notebookCod) {
                    return value;
                }
            }
        }
        return null;
    }

    public void delNotebook(int cod){
        if(getNotebook(cod) != null){
            notebookList.remove(getNotebook(cod));
            System.out.println("\nNotebook de COD " + cod + " deletado com sucesso!");
        }else{
            System.out.println("\nNotebook de código " + cod + " não encontrado!");
        }
    }

    public void printAllNotebooks(){
        System.out.println("\n--- Exibindo todas os notebooks cadastrados ---");
        for(Notebook value : notebookList){
            //Notebook
            System.out.println("\nCódigo do notebook: " + value.getCod());
            System.out.println("Nome do notebook: " + value.getName());

            //Specs
            System.out.println("Quantidade de Ram:" + value.getSpecs().getRamAmt());
            System.out.println("Tamanho da tela: " + value.getSpecs().getScreenSize());
            System.out.println("Marca do processador: " + value.getSpecs().getProcessorBrand());
            System.out.println("Modelo do processador: " + value.getSpecs().getProcessorModel());

            //NoteInfo
            System.out.println("Marca do notebook: " + value.getInfo().getBrand());
            System.out.println("Modelo do notebook: " + value.getInfo().getModel());
        }
        System.out.println("\n--- Fim ---");
    }

    public void printNotebook(){
        int cod = setCod();

        if(getNotebook(cod) != null){
            Notebook notebook = getNotebook(cod);
            //Notebook
            System.out.println("\nCódigo do notebook: " + notebook.getCod());
            System.out.println("Nome do notebook: " + notebook.getName());

            //Specs
            System.out.println("Quantidade de Ram:" + notebook.getSpecs().getRamAmt());
            System.out.println("Tamanho da tela: " + notebook.getSpecs().getScreenSize());
            System.out.println("Marca do processador: " + notebook.getSpecs().getProcessorBrand());
            System.out.println("Modelo do processador: " + notebook.getSpecs().getProcessorModel());

            //NoteInfo
            System.out.println("Marca do notebook: " + notebook.getInfo().getBrand());
            System.out.println("Modelo do notebook: " + notebook.getInfo().getModel());
            notebook.printClassData();
        }else{
            System.out.println("Notebook de código " + cod + " não encontrado!");
        }
    }

    public void updateNotebook(){
        boolean find = false;
        int cod = setCod();

        if(!notebookList.isEmpty()) {
            for(int i = 0; i < notebookList.size(); i++){
                if (notebookList.get(i).getCod() == cod) {
                    Notebook notebook = createNewUpdatedNotebook(notebookList.get(i));
                    notebookList.set(i, notebook);
                    find = true;
                    System.out.println("\nNotebook de COD " + cod + " atualizado com sucesso!");
                }
            }
        }else{
            System.out.println("\nNenhum notebook cadastrado!");
        }

        if(!find){
            System.out.println("\nNotebook de código " + cod + " não encontrado!");
        }
    }

    private Notebook setNotebook(){
        Notebook notebook = new Notebook();
        boolean executed = false;

        while(!executed){
            try{
                //Notebook
                notebook.setCod(Integer.parseInt(read.ReadData("Insira o código do notebook: ")));
                notebook.setName(read.ReadData("Insira o nome do notebook: "));

                //Specs
                notebook.getSpecs().setProcessorBrand(read.ReadData("Insira a marca do processador: "));
                notebook.getSpecs().setProcessorModel(read.ReadData("Insira o modelo do processador: "));
                notebook.getSpecs().setRamAmt(Integer.parseInt(read.ReadData("Insira a quantidade de ram em MB: ")));
                notebook.getSpecs().setScreenSize(Integer.parseInt(read.ReadData("Insira as polegadas da tela: ")));

                //NoteInfo
                notebook.getInfo().setBrand(read.ReadData("Insira o marca do notebook: "));
                notebook.getInfo().setModel(read.ReadData("Insira o modelo do notebook: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }catch(CodNumBelowException numBelowException){
                numBelowException.printBelowException();
            }
        }

        return notebook;
    }

    private Notebook createNewUpdatedNotebook(Notebook notebook){
        boolean executed = false;

        while(!executed){
            try{
                //Notebook
                notebook.setName(read.ReadData("\nInsira o nome do notebook: "));

                //Specs
                notebook.getSpecs().setProcessorBrand(read.ReadData("Insira a marca do processador: "));
                notebook.getSpecs().setProcessorModel(read.ReadData("Insira o modelo do processador: "));
                notebook.getSpecs().setRamAmt(Integer.parseInt(read.ReadData("Insira a quantidade de ram em MB: ")));
                notebook.getSpecs().setScreenSize(Integer.parseInt(read.ReadData("Insira as polegadas da tela: ")));

                //NoteInfo
                notebook.getInfo().setBrand(read.ReadData("Insira o marca do notebook: "));
                notebook.getInfo().setModel(read.ReadData("Insira o modelo do notebook: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return notebook;
    }

    private int setCod(){
        boolean executed = false;
        int cod = -1;

        while(!executed){
            try{
                cod = Integer.parseInt(read.ReadData("\nInsira o código do notebook: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return cod;
    }

    public List<Notebook> getNotebookList() {
        return notebookList;
    }
}
