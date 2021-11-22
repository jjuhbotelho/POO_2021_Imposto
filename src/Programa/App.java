package Programa;

import Entidade.Pessoa;
import Entidade.PessoaFisica;
import Entidade.PessoaJuridica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Informe o número de contribuintes: ");
        int contribuintes = sc.nextInt();

        for(int i = 1; i <= contribuintes; i++){

            System.out.println("Digite as informações do contribuinte #" + i + ":");
            System.out.print("O contribuinte é: Pessoa Física (1) ou Pessoa Jurídica (2)?  (1/2): ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();

            if(ch == '1'){
                System.out.print("Gastos com Saúde: ");
                double gastosSaude =  sc.nextDouble();
                Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastosSaude, PessoaFisica.impostoPessoaFisica(rendaAnual, gastosSaude));
                list.add(pessoaFisica);
            }
            else if(ch == '2'){
                System.out.print("Número de Funcionários: ");
                int funcionarios = sc.nextInt();
                Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, funcionarios, PessoaJuridica.impostoPessoaJuridica(funcionarios));
                list.add(pessoaJuridica);
            }
            else{
                System.out.println("Categoria Inválida.");
            }
        }

        System.out.println();
        System.out.println("Contribuintes: " + contribuintes + "\n ----------------------------");
        for(Pessoa pessoa : list){
            System.out.println(pessoa.fichaPessoa() + "\n ----------------------------");
        }
    }
}
