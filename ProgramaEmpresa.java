import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaEmpresa {  

    public static void main(String[] args) { 

    List<Empresa> listEmpresas = new ArrayList<Empresa>(); 
    List<Funcionario> listFuncionarios = new ArrayList<Funcionario>();
    List<Carro> listCarros = new ArrayList<Carro>();
    Boolean menu = true;
    Scanner leitor = new Scanner(System.in);
    

    do {

        System.out.println("Bem vindo!!!");
        System.out.println("1 - Criar nova empresa");
        System.out.println("2 - Criar pessoa");
        System.out.println("3 - Contratar");
        System.out.println("4 - Demitir");
        System.out.println("0 - Sair");
        System.out.print("Digite a opcao: ");

    int opcaoSelecionada = leitor.nextInt();
    switch (opcaoSelecionada) {
        
        case 1:
        Empresa emp = new Empresa();
        System.out.println("Digite o nome da empresa: ");
        String nome = leitor.next().trim().toLowerCase();
        System.out.println("Digite o CNPJ: ");
        String cnpj = leitor.next().trim();
        System.out.println("Digite o endereco: ");
        String endereco = leitor.next().trim().toLowerCase();
        emp.setNome(nome);
        emp.setCnpj(cnpj);
        emp.setEndereco(endereco);

        if (listEmpresas.size() == 0) {
            listEmpresas.add(emp);
            System.out.println("Empresa adicionada.");
            System.out.println("Empresa: " + emp.getNome()); 
            System.out.println("CNPJ: " + emp.getCnpj()); 
            System.out.println("Endereco: " + emp.getEndereco()); 
            
            menu = true;
            } else {
            for (int contador = 0; contador < listEmpresas.size(); contador++) {
            Empresa EmpresaTemporaria = (Empresa) listEmpresas.get(contador);
            emp.setNome(nome);
            emp.setCnpj(cnpj);
            emp.setEndereco(endereco);   
                if (EmpresaTemporaria.getNome().equals(nome) && EmpresaTemporaria.getCnpj().equals(cnpj) ) {
                    System.out.println("Empresa ja existe no cadastro"); 
                } else {
                    
                    System.out.println("Empresa adicionada!");
                    System.out.println("Empresa: " + emp.getNome()); 
                    System.out.println("CNPJ: " + emp.getCnpj()); 
                    System.out.println("Endereco]: " + emp.getEndereco()); 
                    
                    menu = true;
                    
                }
            }
                    listEmpresas.add(emp);
        }
        
    
        break;
        case 2:
        Funcionario fun = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        String nomeFuncionario = leitor.next().trim().toLowerCase();
        System.out.println("Digite a data de nascimento: ");
        Date nascimento = leitor.next().trim();
        System.out.println("Digite a matricula: ");
        String matricula = leitor.next().trim().toLowerCase();
        fun.setNome(nomeFuncionario);
        fun.setNascimento(nascimento);
        fun.setMatricula(matricula);

        if (listFuncionarios.size() == 0) {
            listFuncionarios.add(fun);
            System.out.println("Funcionario adicionado.");
            System.out.println("Funcionario: " + fun.getNome()); 
            System.out.println("CNPJ: " + fun.getNascimento()); 
            System.out.println("Endereco: " + fun.getMatricula()); 
            
            menu = true;
            } else {
            for (int contador = 0; contador < listFuncionarios.size(); contador++) {
            Funcionario funcionarioTemporario = (Funcionario) listFuncionarios.get(contador);
            fun.setNome(nome);
            fun.setNascimento(nascimento);
            fun.setMatricula(matricula);   
                if (funcionarioTemporario.getNome().equals(nome) && funcionarioTemporario.getNascimento().equals(cnpj) ) {
                    System.out.println("Funcionario ja existe"); 
                } else {
                    
                    System.out.println("Funcionario Adicionado!");
                    System.out.println("Nome: " + fun.getNome()); 
                    System.out.println("Nascimento: " + fun.getNascimento()); 
                    System.out.println("Matricula: " + fun.getMatricula()); 
                    
                    menu = true;
                    
                }
            }
                    listEmpresas.add(emp);
        }
        break;

        case 3:
        menu = true;
        break;

        case 4:
        menu = true;
        break;

        case 0:
        menu = false;
        break;
    
        default:
        System.out.println("opcao invalida");
        menu = false;
            break;
    }

} while (menu == true);

leitor.close();
 }
}
