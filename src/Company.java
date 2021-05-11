//Nome: Luan Emanuel da Silva - RA: 2143860

public class Company {

    private String name;
    private int cod;
    private final Employee employee = new Employee();
    private final Customers customers = new Customers();

    public Company() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public Customers getCustomers() {
        return customers;
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

    public void setCod(int cod) {
        this.cod = cod;
    }
}
