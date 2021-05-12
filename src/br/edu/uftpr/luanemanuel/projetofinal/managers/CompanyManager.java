//Nome: Luan Emanuel da Silva - RA: 2143860
package br.edu.uftpr.luanemanuel.projetofinal.managers;

import br.edu.uftpr.luanemanuel.projetofinal.data.Company;
import br.edu.uftpr.luanemanuel.projetofinal.util.CodNumBelowException;
import br.edu.uftpr.luanemanuel.projetofinal.util.Read;
import java.util.ArrayList;
import java.util.List;

public class CompanyManager {

    private final Read read = new Read();
    private final List<Company> companyList = new ArrayList<>();

    public void addCompany(){
        Company company = setCompanyCod();

        if(getCompany(company.getCod()) == null){
            companyList.add(company);
            System.out.println("\nCadastro da empresa de COD " + company.getCod() + " efetuado com sucesso!");
        }else{
            System.out.println("\nEmpresa já cadastrada!");
        }
    }

    public Company getCompany(int companyCod){
        if(!companyList.isEmpty()){
            for (Company value : companyList) {
                if (value.getCod() == companyCod) {
                    return value;
                }
            }
        }
        return null;
    }

    public void delCompany(){
        int cod = setCod();

        if(getCompany(cod) != null){
            companyList.remove(getCompany(cod));
            System.out.println("\nEmpresa de COD " + cod + " deletada com sucesso!");
        }else{
            System.out.println("\nEmpresa de código " + cod + " não encontrada!");
        }
    }

    public void printAllCompany(){
        System.out.println("\n--- Exibindo todas as empresas cadastradas ---");
        for(Company value : companyList){
            System.out.println("\nCódigo da empresa: " + value.getCod());
            System.out.println("Nome da empresa: " + value.getName());
        }
        System.out.println("\n--- Fim ---");
    }

    public void printCompany(){
        int cod = setCod();

        if(getCompany(cod) != null){
            Company company = getCompany(cod);
            System.out.println("\nCódigo da empresa: " + company.getCod());
            System.out.println("Nome da empresa: " + company.getName());
        }else{
            System.out.println("Empresa de código " + cod + " não encontrada!");
        }
    }

    public void updateCompany(){
        boolean find = false;
        int cod = setCod();

        if(!companyList.isEmpty()) {
            for(int i = 0; i < companyList.size(); i++){
                if (companyList.get(i).getCod() == cod) {
                    Company company = companyList.get(i);
                    company.setName(read.ReadData("\nInsira o novo nome da empresa: "));
                    companyList.set(i, company);
                    find = true;
                    System.out.println("\nEmpresa de COD " + cod + " atualizada com sucesso!");
                }
            }
        }else{
            System.out.println("\nNenhuma empresa cadastrada!");
        }

        if(!find){
            System.out.println("\nEmpresa de código " + cod + " não encontrada!");
        }
    }

    private Company setCompanyCod(){
        Company company = new Company();
        boolean executed = false;

        while(!executed){
            try{
                company.setCod(Integer.parseInt(read.ReadData("\nInsira o código da empresa: ")));
                company.setName(read.ReadData("Insira o nome da empresa: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }catch(CodNumBelowException numBelowException){
                numBelowException.printBelowException();
            }
        }
        return company;
    }

    public int setCod(){
        boolean executed = false;
        int cod = -1;

        while(!executed){
            try{
                cod = Integer.parseInt(read.ReadData("\nInsira o código da empresa: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return cod;
    }
}
