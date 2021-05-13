//Nome: Luan Emanuel da Silva - RA: 2143860

import java.util.List;

public class Company {

    private String name;
    private int cod;
    private final CustomerManager customerManager = new CustomerManager();
    private final EmployeeManager employeeManager = new EmployeeManager();

    public Company() {
    }

    public CustomerManager getCustomerManager() {
        return customerManager;
    }

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
