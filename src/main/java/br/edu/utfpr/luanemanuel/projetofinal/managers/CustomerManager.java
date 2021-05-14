//Nome: Luan Emanuel da Silva - RA: 2143860

package br.edu.utfpr.luanemanuel.projetofinal.managers;

import br.edu.utfpr.luanemanuel.projetofinal.util.CodNumBelowException;
import br.edu.utfpr.luanemanuel.projetofinal.data.Customers;
import br.edu.utfpr.luanemanuel.projetofinal.util.Read;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    private final Read read = new Read();
    private final List<Customers> customerList = new ArrayList<>();

    public void addCustomer(Customers customers){

        if(getCustomers(customers.getCod()) == null){
            customerList.add(customers);
            System.out.println("\nCadastro do cliente de COD " + customers.getCod() + " efetuado com sucesso!");
        }else{
            System.out.println("\nCliente já cadastrado!");
        }
    }

    public Customers getCustomers(int customerCod){
        if(!customerList.isEmpty()){
            for (Customers value : customerList) {
                if (value.getCod() == customerCod) {
                    return value;
                }
            }
        }
        return null;
    }

    public void delCustomer(int cod){
        if(getCustomers(cod) != null){
            customerList.remove(getCustomers(cod));
            System.out.println("\nCliente de COD " + cod + " deletado com sucesso!");
        }else{
            System.out.println("\nCliente de código " + cod + " não encontrado!");
        }
    }

    public void printAllCustomer(){
        System.out.println("\n--- Exibindo todas os clientes cadastrados ---");
        for(Customers value : customerList){
            System.out.println("\nCódigo do cliente: " + value.getCod());
            System.out.println("Nome do cliente: " + value.getName());
            System.out.println("CPF do cliente: " + value.getCpf());
            System.out.println("RG do cliente: " + value.getRG());

            //Endereço
            System.out.println("Estado em que reside: " + value.getAddress().getUf());
            System.out.println("Cidade em que reside: " + value.getAddress().getCity());
            System.out.println("Rua em que reside: " + value.getAddress().getStreet());
            System.out.println("Numero da casa: " + value.getAddress().getNum());
        }
        System.out.println("\n--- Fim ---");
    }

    public void printCustomer(){
        int cod = setCod();

        if(getCustomers(cod) != null){
            Customers customers = getCustomers(cod);
            System.out.println("\nCódigo do cliente: " + customers.getCod());
            System.out.println("Nome do cliente: " + customers.getName());
            System.out.println("CPF do cliente: " + customers.getCpf());
            System.out.println("RG do cliente: " + customers.getRG());

            //Endereço
            System.out.println("\nEstado em que reside: " + customers.getAddress().getUf());
            System.out.println("Cidade em que reside: " + customers.getAddress().getCity());
            System.out.println("Rua em que reside: " + customers.getAddress().getStreet());
            System.out.println("Numero da casa: " + customers.getAddress().getNum());
            customers.printClass();
        }else{
            System.out.println("Cliente de código " + cod + " não encontrado!");
        }
    }

    public void updateCustomer(){
        boolean find = false;
        int cod = setCod();

        if(!customerList.isEmpty()) {
            for(int i = 0; i < customerList.size(); i++){
                if (customerList.get(i).getCod() == cod) {
                    Customers customers = createNewUpdatedCustomer(customerList.get(i));
                    customerList.set(i, customers);
                    find = true;
                    System.out.println("\nCliente de COD " + cod + " atualizado com sucesso!");
                }
            }
        }else{
            System.out.println("\nNenhum cliente cadastrado!");
        }

        if(!find){
            System.out.println("\nCliente de código " + cod + " não encontrado!");
        }
    }

    private Customers setCustomer(){
        Customers customers = new Customers();
        boolean executed = false;

        while(!executed){
            try{
                customers.setCod(Integer.parseInt(read.ReadData("\nInsira o código do cliente: ")));
                customers.setName(read.ReadData("Insira o nome do cliente: "));
                customers.setRG(Long.parseLong(read.ReadData("Insira o RG do cliente: ")));
                customers.setCpf(Integer.parseInt(read.ReadData("Insira o cpf: ")));

                //Endereço
                customers.getAddress().setUf(read.ReadData("Insira o estado em que reside: "));
                customers.getAddress().setCity(read.ReadData("Insira a cidade em que reside: "));
                customers.getAddress().setStreet(read.ReadData("Insira a rua em que reside: "));
                customers.getAddress().setNum(Integer.parseInt(read.ReadData("Insira o numero da casa em que reside: ")));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }catch(CodNumBelowException numBelowException){
                numBelowException.printBelowException();
            }
        }

        return customers;
    }

    private Customers createNewUpdatedCustomer(Customers customers){
        boolean executed = false;

        while(!executed){
            try{
                customers.setName(read.ReadData("\nInsira o novo nome do cliente: "));
                customers.setRG(Long.parseLong(read.ReadData("Insira o novo RG do cliente: ")));
                customers.setCpf(Integer.parseInt(read.ReadData("Insira o novo cpf: ")));

                //Endereço
                customers.getAddress().setUf(read.ReadData("Insira o novo estado em que reside: "));
                customers.getAddress().setCity(read.ReadData("Insira a nova cidade em que reside: "));
                customers.getAddress().setStreet(read.ReadData("Insira a nova rua em que reside: "));
                customers.getAddress().setNum(Integer.parseInt(read.ReadData("Insira o novo numero da casa em que reside: ")));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return customers;
    }

    public int setCod(){
        boolean executed = false;
        int cod = -1;

        while(!executed){
            try{
                cod = Integer.parseInt(read.ReadData("\nInsira o código do cliente: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return cod;
    }

    public List<Customers> getCustomerList() {
        return customerList;
    }
}
