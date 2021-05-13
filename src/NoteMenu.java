//Nome: Luan Emanuel da Silva - RA: 2143860

public class NoteMenu {

    private final Read read = new Read();
    private final CompanyManager companyManager = new CompanyManager();

    public void generateMenu(){
        boolean end = false;
        Company company;
        Customers customers;
        Employee employee;
        int option;

        while(!end){
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Deletar");
            System.out.println("4 - Imprimir");
            System.out.println("0 - Sair");

            option = setOption();

            switch(option){
                case 1:
                    System.out.println("\n--- Menu/Adicionar ---");
                    System.out.println("1 - Empresa");
                    System.out.println("2 - Cliente");
                    System.out.println("3 - Funcionario");
                    System.out.println("4 - Notebook");
                    System.out.println("0 - Voltar");

                    option = setOption();

                    switch (option){
                        case 1:
                            companyManager.addCompany();
                            break;
                        case 2:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getCustomerManager().addCustomer();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 3:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getEmployeeManager().addEmployee();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 4:
                            System.out.println("\n--- Menu/Adicionar/Notebook ---");
                            System.out.println("1 - Cliente");
                            System.out.println("2 - Funcionario");
                            System.out.println("0 - Voltar");


                            option = setOption();
                            switch (option){
                                case 1:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        customers = company.getCustomerManager().getCustomers(company.getCustomerManager().setCod());
                                        if(customers != null){
                                            customers.getNotebookManager().addNotebook();
                                        }else{
                                            System.out.println("\nCliente não encontrado");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 2:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        employee = company.getEmployeeManager().getEmployee(company.getEmployeeManager().setCod());
                                        if(employee != null){
                                            employee.getNotebookManager().addNotebook();
                                        }else{
                                            System.out.println("\nFuncionario não encontrada!");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nVoltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("\nVoltando ao menu inicial");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n--- Menu/Atualizar ---");
                    System.out.println("1 - Empresa");
                    System.out.println("2 - Cliente");
                    System.out.println("3 - Funcionario");
                    System.out.println("4 - Notebook");
                    System.out.println("0 - Voltar");

                    option = setOption();

                    switch (option){
                        case 1:
                            companyManager.updateCompany();
                            break;
                        case 2:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getCustomerManager().updateCustomer();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 3:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getEmployeeManager().updateEmployee();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 4:
                            System.out.println("\n--- Menu/Atualizar/Notebook ---");
                            System.out.println("1 - Cliente");
                            System.out.println("2 - Funcionario");
                            System.out.println("0 - Voltar");

                            option = setOption();
                            switch (option){
                                case 1:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        customers = company.getCustomerManager().getCustomers(company.getCustomerManager().setCod());
                                        if(customers != null){
                                            customers.getNotebookManager().updateNotebook();
                                        }else{
                                            System.out.println("\nCliente não encontrado!");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 2:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        employee = company.getEmployeeManager().getEmployee(company.getEmployeeManager().setCod());
                                        if(employee != null){
                                            employee.getNotebookManager().updateNotebook();
                                        }else{
                                            System.out.println("\nFuncionario não encontrado!");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nVoltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("\nVoltando ao menu inicial");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n--- Menu/Deletar ---");
                    System.out.println("1 - Empresa");
                    System.out.println("2 - Cliente");
                    System.out.println("3 - Funcionario");
                    System.out.println("4 - Notebook");
                    System.out.println("0 - Voltar");

                    option = setOption();

                    switch (option){
                        case 1:
                            companyManager.delCompany();
                            break;
                        case 2:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getCustomerManager().delCustomer();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 3:
                            company = companyManager.getCompany(companyManager.setCod());
                            if(company != null){
                                company.getEmployeeManager().delEmployee();
                            }else{
                                System.out.println("\nEmpresa não encontrada!");
                            }
                            break;
                        case 4:
                            System.out.println("\n--- Menu/Deletar/Notebook ---");
                            System.out.println("1 - Cliente");
                            System.out.println("2 - Funcionario");
                            System.out.println("0 - Voltar");

                            option = setOption();
                            switch (option){
                                case 1:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        customers = company.getCustomerManager().getCustomers(company.getCustomerManager().setCod());
                                        if(customers != null){
                                            customers.getNotebookManager().delNotebook();
                                        }else{
                                            System.out.println("\nCliente não encontrado!");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 2:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        employee = company.getEmployeeManager().getEmployee(company.getEmployeeManager().setCod());
                                        if(employee != null){
                                            employee.getNotebookManager().delNotebook();
                                        }else{
                                            System.out.println("\nFuncionario não encontrado!");
                                        }
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nVoltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("\nVoltando ao menu inicial");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\n--- Menu/Imprimir ---");
                    System.out.println("1 - Todos");
                    System.out.println("2 - Apenas Um");
                    System.out.println("0 - Voltar");

                    option = setOption();

                    switch(option){
                        case 1:
                            System.out.println("\n--- Menu/Imprimir/Todos ---");
                            System.out.println("1 - Empresa");
                            System.out.println("2 - Cliente");
                            System.out.println("3 - Funcionario");
                            System.out.println("4 - Notebook");
                            System.out.println("0 - Voltar");

                            option = setOption();

                            switch (option){
                                case 1:
                                    companyManager.printAllCompany();
                                    break;
                                case 2:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        company.getCustomerManager().printAllCustomer();
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 3:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        company.getEmployeeManager().printAllEmployee();
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("\n--- Menu - Imprimir -- Notebook ---");
                                    System.out.println("1 - Cliente");
                                    System.out.println("2 - Funcionario");
                                    System.out.println("0 - Voltar");

                                    option = setOption();
                                    switch (option){
                                        case 1:
                                            company = companyManager.getCompany(companyManager.setCod());
                                            if(company != null){
                                                customers = company.getCustomerManager().getCustomers(company.getCustomerManager().setCod());
                                                if(customers != null){
                                                    customers.getNotebookManager().printAllNotebooks();
                                                }else{
                                                    System.out.println("\nCliente não encontrado!");
                                                }
                                            }else{
                                                System.out.println("\nEmpresa não encontrada!");
                                            }
                                            break;
                                        case 2:
                                            company = companyManager.getCompany(companyManager.setCod());
                                            if(company != null){
                                                employee = company.getEmployeeManager().getEmployee(company.getEmployeeManager().setCod());
                                                if(employee != null){
                                                    employee.getNotebookManager().printAllNotebooks();
                                                }else{
                                                    System.out.println("\nFuncionario não encontrado!");
                                                }
                                            }else{
                                                System.out.println("\nEmpresa não encontrada!");
                                            }
                                            break;
                                        case 0:
                                            System.out.println("\nVoltando ao menu inicial");
                                            break;
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nVoltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("\n--- Menu/Imprimir/Apenas Um ---");
                            System.out.println("1 - Empresa");
                            System.out.println("2 - Cliente");
                            System.out.println("3 - Funcionario");
                            System.out.println("4 - Notebook");
                            System.out.println("0 - Voltar");

                            option = setOption();

                            switch (option){
                                case 1:
                                    companyManager.printCompany();
                                    break;
                                case 2:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        company.getCustomerManager().printCustomer();
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 3:
                                    company = companyManager.getCompany(companyManager.setCod());
                                    if(company != null){
                                        company.getEmployeeManager().printEmployee();
                                    }else{
                                        System.out.println("\nEmpresa não encontrada!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("\n--- Menu/Imprimir/Notebook ---");
                                    System.out.println("1 - Cliente");
                                    System.out.println("2 - Funcionario");
                                    System.out.println("0 - Voltar");

                                    option = setOption();
                                    switch (option){
                                        case 1:
                                            company = companyManager.getCompany(companyManager.setCod());
                                            if(company != null){
                                                customers = company.getCustomerManager().getCustomers(company.getCustomerManager().setCod());
                                                if(customers != null){
                                                    customers.getNotebookManager().printNotebook();
                                                }else{
                                                    System.out.println("\nCliente não encontrado!");
                                                }
                                            }else{
                                                System.out.println("\nEmpresa não encontrada!");
                                            }
                                            break;
                                        case 2:
                                            company = companyManager.getCompany(companyManager.setCod());
                                            if(company != null){
                                                employee = company.getEmployeeManager().getEmployee(company.getEmployeeManager().setCod());
                                                if(employee != null){
                                                    employee.getNotebookManager().printNotebook();
                                                }else{
                                                    System.out.println("\nFuncionario não encontrado!");
                                                }
                                            }else{
                                                System.out.println("\nEmpresa não encontrada!");
                                            }
                                            break;
                                        case 0:
                                            System.out.println("\nVoltando ao menu inicial");
                                            break;
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nVoltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("\nVoltando ao menu inicial");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("\nSaindo!");
                    end = true;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
    }

    private int setOption(){
        int option = 0;
        boolean executed = false;

        while(!executed){
            try{
                option = Integer.parseInt(read.ReadData("\nInsira a opção desejada: "));
                executed = true;
            }catch(NumberFormatException numberFormatException){
                System.out.println("\nO formato inserido não se trata de um numero!");
                System.out.println("Erro: '" + numberFormatException.getLocalizedMessage() + "'\n");
            }
        }
        return option;
    }

}
