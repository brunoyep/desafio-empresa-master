import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class ProgramaEmpresa {

    public static void main(String[] args) throws Exception {
        
        List<Empresa> listEmpresa = new ArrayList<Empresa>();

        emp.setNome(nome);
        emp.setCPNJ(CNPJ);
        emp.setEndereco(endereco);
            for (int contador = 0; contador < listEmpresas.size(); contador++) {
            Empresa EmpresaTemporaria = (Empresa) listEmpresas.get(contador);
            if empresatemporaria.getnome().equals(nome) && empresatemporaria.getcnpj().equals(cnpj) ) {
            System.out.println("A empresa ou CNPJ ja existe");
    }
    else{


        listaEmpresas.add(emp);
            for (int contador2 = 0; contador2 < listEmpresas.size(); contador2++) {
        EmpresaTemporaria = (Empresa) listEmpresas.get(contador2);
        System.out.println ("empresa adicionada com sucesso");
        System.out.println("Nome: " + EmpresaTemporaria.getNome());
        System.out.println("CNPJ: " + EmpresaTemporaria.getCNPJ());
        System.out.println("Endereco: "+ EmpresaTemporaria.getEndereco());

}

        //Empresa emp = new Empresa();
        // emp.setNome("minha empresa");
        // emp.setFaturamento(10000000);
        
        // listaEmpresa.add(emp);
        
        // Empresa empresa1 = new Empresa();
        // empresa1.setNome("Empresa Bancaria");
        // empresa1.setCnpj("12.333.333/0001-99");
        // Scanner leitor = new Scanner(System.in);

        int opcao;

        do{
        
        System.out.println("Bem vindo!!!");
        System.out.println("-------------");
        System.out.println("1 - Criar empresa");
        System.out.println("2 - Criar uma pessoa");
        System.out.println("3 - Contratar pessoa");
        System.out.println("4 - Demitir pessoa");
        System.out.println("0 - Sair");

        switch(opcao){
            case 1:
            break;
            case 2:
            switch{
                case 1:
                System.out.println("Funcionario possui carro? 1 - Sim 2 - nao");
                break;
                default:
                System.out.println("opcao invalida");
                break;
            }


            }
            break;
            case 3:
            break;
            case 4:
            break;
            case 0:
            System.out.println("Opcao invalida");
            break;
            



        }

        }while (opcao =! 0)

        Empresa empresa1 = new Empresa();
        empresa1.setNome("Empresa Bancaria");
        empresa1.setCnpj("12.345.678/0001-99");
        empresa1.setDataFundacao(new Date());
        empresa1.setFaturamento(99999);
        empresa1.setEndereco("Rua do Limoeiro, 50");

        empresa1.imprimirResumo();

        Funcionario funcionario1 = new Funcionario(); // Herda de pessoa
        funcionario1.setNome("José Marques");
        funcionario1.setMatricula("01234");
        funcionario1.setEndereco("Rua da chuva, 99");
        funcionario1.setSalario(10000.00);

        empresa1.contratacao(funcionario1);

        Carro carro1 = new Carro();
        carro1.setAno(2000);
        carro1.setModelo("ABC");
        carro1.setPlaca("XVC-9900");
        carro1.setValor(120000.00);

        funcionario1.setCarro(carro1);

        // Pessoa pessoa = funcionario1; // Funcionario
        // System.out.println(pessoa.getNome());
        // System.out.println(funcionario1.getNome());

        // Funcionario func = (Funcionario) pessoa;
        // System.out.println(func.getSalario());

        // Pessoa pessoaAleatorio = new Pessoa();
        // pessoaAleatorio.setNome("Charles");

        // Carro carro2 = new Carro();
        // carro2.setModelo("Ferrari");

        adicionarCarro(carro1, funcionario1);
        // adicionarCarro(carro2, pessoaAleatorio);

        for (int contador = 0; contador < empresa1.getListaFuncionarios().size(); contador++) {
            Funcionario elemento = empresa1.getListaFuncionarios().get(contador);

            System.out.println("---- Dados dos Funcionarios ----");
            System.out.println(elemento.getNome());
            System.out.println(elemento.getSalario());
            System.out.println(elemento.getCarro().getModelo() + " - " + elemento.getCarro().getAno());
        }

    }

    public static void adicionarCarro(Carro carro, Pessoa pessoa) {
        pessoa.setCarro(carro);
    }
}
