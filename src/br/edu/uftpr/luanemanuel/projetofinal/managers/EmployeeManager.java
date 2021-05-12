//Nome: Luan Emanuel da Silva - RA: 2143860
package br.edu.uftpr.luanemanuel.projetofinal.managers;

import br.edu.uftpr.luanemanuel.projetofinal.data.Employee;
import br.edu.uftpr.luanemanuel.projetofinal.util.CodNumBelowException;
import br.edu.uftpr.luanemanuel.projetofinal.util.Read;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private final Read read = new Read();
    private final List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(){
        Employee employee = setEmployee();

        if(getEmployee(employee.getCod()) == null){
            employeeList.add(employee);
            System.out.println("\nCadastro do funcionario de COD " + employee.getCod() + " efetuado com sucesso!");
        }else{
            System.out.println("\nFuncionario já cadastrado!");
        }
    }

    public Employee getEmployee(int employeeCod){
        if(!employeeList.isEmpty()){
            for (Employee value : employeeList) {
                if (value.getCod() == employeeCod) {
                    return value;
                }
            }
        }
        return null;
    }

    public void delEmployee(){
        int cod = setCod();

        if(getEmployee(cod) != null){
            employeeList.remove(getEmployee(cod));
            System.out.println("\nFuncionario de COD " + cod + " deletado com sucesso!");
        }else{
            System.out.println("\nFuncionario de código " + cod + " não encontrado!");
        }
    }

    public void printAllEmployee(){
        System.out.println("\n--- Exibindo todas os Funcionario cadastrados ---");
        for(Employee value : employeeList){
            System.out.println("\nCódigo do funcionario: " + value.getCod());
            System.out.println("Nome do funcionario: " + value.getName());
            System.out.println("CPF do funcionario: " + value.getCpf());
            System.out.println("Função do funcionario: " + value.getFunction());
            System.out.println("Salario do funcionario: " + value.getWage());

            //Endereço
            System.out.println("Estado em que reside: " + value.getAddress().getUf());
            System.out.println("Cidade em que reside: " + value.getAddress().getCity());
            System.out.println("Rua em que reside: " + value.getAddress().getStreet());
            System.out.println("Numero da casa: " + value.getAddress().getNum());
        }
        System.out.println("\n--- Fim ---");
    }

    public void printEmployee(){
        int cod = setCod();

        if(getEmployee(cod) != null){
            Employee employee = getEmployee(cod);
            System.out.println("\nCódigo do funcionario: " + employee.getCod());
            System.out.println("Nome do funcionario: " + employee.getName());
            System.out.println("CPF do funcionario: " + employee.getCpf());
            System.out.println("Função do funcionario: " + employee.getFunction());
            System.out.println("Salario do funcionario: " + employee.getWage());

            //Endereço
            System.out.println("\nEstado em que reside: " + employee.getAddress().getUf());
            System.out.println("Cidade em que reside: " + employee.getAddress().getCity());
            System.out.println("Rua em que reside: " + employee.getAddress().getStreet());
            System.out.println("Numero da casa: " + employee.getAddress().getNum());
            employee.printClass();
        }else{
            System.out.println("Funcionario de código " + cod + " não encontrado!");
        }
    }

    public void updateEmployee(){
        boolean find = false;
        int cod = setCod();

        if(!employeeList.isEmpty()) {
            for(int i = 0; i < employeeList.size(); i++){
                if (employeeList.get(i).getCod() == cod) {
                    Employee employee = createNewUpdatedEmployee(employeeList.get(i));
                    employeeList.set(i, employee);
                    find = true;
                    System.out.println("\nFuncionário de COD " + cod + " atualizado com sucesso!");
                }
            }
        }else{
            System.out.println("\nNenhum funcionario cadastrado!");
        }

        if(!find){
            System.out.println("\nFuncionario de código " + cod + " não encontrado!");
        }
    }

    private Employee setEmployee(){
        Employee employee = new Employee();
        boolean executed = false;

        while(!executed){
            try{
                employee.setCod(Integer.parseInt(read.ReadData("\nInsira o código do funcionario: ")));
                employee.setName(read.ReadData("Insira o nome do funcionario: "));
                employee.setFunction(read.ReadData("Insira a sua função: "));
                employee.setWage(Integer.parseInt(read.ReadData("Insira o salario: ")));
                employee.setCpf(Integer.parseInt(read.ReadData("Insira o cpf: ")));

                //Endereço
                employee.getAddress().setUf(read.ReadData("Insira o estado em que reside: "));
                employee.getAddress().setCity(read.ReadData("Insira a cidade em que reside: "));
                employee.getAddress().setStreet(read.ReadData("Insira a rua em que reside: "));
                employee.getAddress().setNum(Integer.parseInt(read.ReadData("Insira o numero da casa em que reside: ")));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }catch(CodNumBelowException numBelowException){
                numBelowException.printBelowException();
            }
        }

        return employee;
    }

    private Employee createNewUpdatedEmployee(Employee employee){
        boolean executed = false;

        while(!executed){
            try{
                employee.setName(read.ReadData("\nInsira o novo nome do funcionario: "));
                employee.setFunction(read.ReadData("Insira a sua nova função: "));
                employee.setWage(Integer.parseInt(read.ReadData("Insira o novo salario: ")));
                employee.setCpf(Integer.parseInt(read.ReadData("Insira o novo cpf: ")));

                //Endereço
                employee.getAddress().setUf(read.ReadData("Insira o novo estado em que reside: "));
                employee.getAddress().setCity(read.ReadData("Insira a nova cidade em que reside: "));
                employee.getAddress().setStreet(read.ReadData("Insira a nova rua em que reside: "));
                employee.getAddress().setNum(Integer.parseInt(read.ReadData("Insira o novo numero da casa em que reside: ")));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return employee;
    }

    public int setCod(){
        boolean executed = false;
        int cod = -1;

        while(!executed){
            try{
                cod = Integer.parseInt(read.ReadData("\nInsira o código do funcionario: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return cod;
    }
}
