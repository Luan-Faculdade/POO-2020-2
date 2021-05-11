//Nome: Luan Emanuel da Silva - RA: 2143860

public class NoteMain {

    public static void main(String[] args) {
        Read read = new Read();
        Company company = new Company();
        int option=0;

        //Compania
        company.setCod(Integer.parseInt(read.ReadData("Insira o código da empresa: ")));
        company.setName(read.ReadData("Insira o nome da empresa: "));

        //Opção de cadastramento
        int i = 1;
        while (i == 1){
            System.out.println("Escolha uma opção de cadastramento:\n");
            System.out.println("1 - Funcionario");
            System.out.println("2 - Cliente\n");
            option = Integer.parseInt(read.ReadData("Escolha uma opção: "));
            switch (option){
                case 1:
                    //Funcionario
                    company.getEmployee().setCod(Integer.parseInt(read.ReadData("\nInsira o código do funcionario: ")));
                    company.getEmployee().setName(read.ReadData("Insira o nome do funcionario: "));
                    company.getEmployee().setFunction(read.ReadData("Insira a sua função: "));
                    company.getEmployee().setWage(Integer.parseInt(read.ReadData("Insira o salario: ")));
                    company.getEmployee().setCpf(Integer.parseInt(read.ReadData("Insira o cpf: ")));

                    //Endereço
                    company.getEmployee().getAddress().setUf(read.ReadData("Insira o estado em que reside: "));
                    company.getEmployee().getAddress().setCity(read.ReadData("Insira a cidade em que reside: "));
                    company.getEmployee().getAddress().setStreet(read.ReadData("Insira a rua em que reside: "));
                    company.getEmployee().getAddress().setNum(Integer.parseInt(read.ReadData("Insira o numero da casa em que reside: ")));

                    //Notebook
                    company.getEmployee().getNotebook().setCod(Integer.parseInt(read.ReadData("Insira o código do notebook: ")));
                    company.getEmployee().getNotebook().setName(read.ReadData("Insira o nome do notebook: "));

                    //Specs
                    company.getEmployee().getNotebook().getSpecs().setProcessorBrand(read.ReadData("Insira a marca do processador: "));
                    company.getEmployee().getNotebook().getSpecs().setProcessorModel(read.ReadData("Insira o modelo do processador: "));
                    company.getEmployee().getNotebook().getSpecs().setRamAmt(Integer.parseInt(read.ReadData("Insira a quantidade de ram em MB: ")));
                    company.getEmployee().getNotebook().getSpecs().setScreenSize(Integer.parseInt(read.ReadData("Insira as polegadas da tela: ")));

                    //NoteInfo
                    company.getEmployee().getNotebook().getInfo().setBrand(read.ReadData("Insira o marca do notebook: "));
                    company.getEmployee().getNotebook().getInfo().setModel(read.ReadData("Insira o modelo do notebook: "));

                    i=0;
                    break;
                case 2:
                    //Cliente
                    company.getCustomers().setCod(Integer.parseInt(read.ReadData("\nInsira o código do cliente: ")));
                    company.getCustomers().setName(read.ReadData("Insira o nome do cliente: "));
                    company.getCustomers().setRG(Long.parseLong(read.ReadData("Insira o RG do cliente: ")));
                    company.getCustomers().setCpf(Integer.parseInt(read.ReadData("Insira o cpf: ")));

                    //Endereço
                    company.getCustomers().getAddress().setUf(read.ReadData("Insira o estado em que reside: "));
                    company.getCustomers().getAddress().setCity(read.ReadData("Insira a cidade em que reside: "));
                    company.getCustomers().getAddress().setStreet(read.ReadData("Insira a rua em que reside: "));
                    company.getCustomers().getAddress().setNum(Integer.parseInt(read.ReadData("Insira o numero da casa em que reside: ")));

                    //Notebook
                    company.getCustomers().getNotebook().setCod(Integer.parseInt(read.ReadData("Insira o código do notebook: ")));
                    company.getCustomers().getNotebook().setName(read.ReadData("Insira o nome do notebook: "));

                    //Specs
                    company.getCustomers().getNotebook().getSpecs().setProcessorBrand(read.ReadData("Insira a marca do processador: "));
                    company.getCustomers().getNotebook().getSpecs().setProcessorModel(read.ReadData("Insira o modelo do processador: "));
                    company.getCustomers().getNotebook().getSpecs().setRamAmt(Integer.parseInt(read.ReadData("Insira a quantidade de ram em MB: ")));
                    company.getCustomers().getNotebook().getSpecs().setScreenSize(Integer.parseInt(read.ReadData("Insira as polegadas da tela: ")));

                    //NoteInfo
                    company.getCustomers().getNotebook().getInfo().setBrand(read.ReadData("Insira o marca do notebook: "));
                    company.getCustomers().getNotebook().getInfo().setModel(read.ReadData("Insira o modelo do notebook: "));

                    i=0;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;
            }
        }

        //Prints

        //Empresa
        System.out.println("\nCódigo da empresa: " + company.getCod());
        System.out.println("Nome da empresa: " + company.getName());
        switch (option){
            case 1:
                //Funcionario
                System.out.println("\nCódigo do funcionario: " + company.getEmployee().getCod());
                System.out.println("Nome do funcionario: " + company.getEmployee().getName());
                System.out.println("CPF do funcionario: " + company.getEmployee().getCpf());
                System.out.println("Função do funcionario: " + company.getEmployee().getFunction());
                System.out.println("Salario do funcionario: " + company.getEmployee().getWage());

                //Endereço
                System.out.println("\nEstado em que reside: " + company.getEmployee().getAddress().getUf());
                System.out.println("Cidade em que reside: " + company.getEmployee().getAddress().getCity());
                System.out.println("Rua em que reside: " + company.getEmployee().getAddress().getStreet());
                System.out.println("Numero da casa: " + company.getEmployee().getAddress().getNum());

                //Notebook
                System.out.println("\nCódigo do notebook: " + company.getEmployee().getNotebook().getCod());
                System.out.println("Nome do notebook: " + company.getEmployee().getNotebook().getName());

                //Specs
                System.out.println("\nQuantidade de Ram:" + company.getEmployee().getNotebook().getSpecs().getRamAmt());
                System.out.println("Tamanho da tela: " + company.getEmployee().getNotebook().getSpecs().getScreenSize());
                System.out.println("Marca do processador: " + company.getEmployee().getNotebook().getSpecs().getProcessorBrand());
                System.out.println("Modelo do processador: " + company.getEmployee().getNotebook().getSpecs().getProcessorModel());

                //NoteInfo
                System.out.println("\nMarca do notebook: " + company.getEmployee().getNotebook().getInfo().getBrand());
                System.out.println("Modelo do notebook: " + company.getEmployee().getNotebook().getInfo().getModel());

                //Interface
                company.getEmployee().getNotebook().printInitQty();

                //Polimorfismo
                company.getEmployee().printClass();
                break;
            case 2:
                //Cliente
                System.out.println("\nCódigo do cliente: " + company.getCustomers().getCod());
                System.out.println("Nome do cliente: " + company.getCustomers().getName());
                System.out.println("CPF do cliente: " + company.getCustomers().getCpf());
                System.out.println("RG do cliente: " + company.getCustomers().getRG());

                //Endereço
                System.out.println("\nEstado em que reside: " + company.getCustomers().getAddress().getUf());
                System.out.println("Cidade em que reside: " + company.getCustomers().getAddress().getCity());
                System.out.println("Rua em que reside: " + company.getCustomers().getAddress().getStreet());
                System.out.println("Numero da casa: " + company.getCustomers().getAddress().getNum());

                //Notebook
                System.out.println("\nCódigo do notebook: " + company.getCustomers().getNotebook().getCod());
                System.out.println("Nome do notebook: " + company.getCustomers().getNotebook().getName());

                //Specs
                System.out.println("\nQuantidade de Ram:" + company.getCustomers().getNotebook().getSpecs().getRamAmt());
                System.out.println("Tamanho da tela: " + company.getCustomers().getNotebook().getSpecs().getScreenSize());
                System.out.println("Marca do processador: " + company.getCustomers().getNotebook().getSpecs().getProcessorBrand());
                System.out.println("Modelo do processador: " + company.getCustomers().getNotebook().getSpecs().getProcessorModel());

                //NoteInfo
                System.out.println("\nMarca do notebook: " + company.getCustomers().getNotebook().getInfo().getBrand());
                System.out.println("Modelo do notebook: " + company.getCustomers().getNotebook().getInfo().getModel());

                //Interface
                company.getCustomers().getNotebook().printInitQty();

                //Polimorfismo
                company.getCustomers().printClass();
                break;
            default:
                System.out.println("Error na opção!");
                break;
        }
    }
}
