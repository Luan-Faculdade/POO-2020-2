//Nome: Luan Emanuel da Silva - RA: 2143860

public class Employee extends UserData {

    private String function;
    private int wage;

    public Employee() {
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    @Override
    public void printClass() {
        super.printClass();
        System.out.println("Classe mãe: UserData");
    }
}
