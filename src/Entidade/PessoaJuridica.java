package Entidade;

public class PessoaJuridica extends Pessoa{

    protected int funcionarios;
    protected double impostoPessoaJuridica;
    public PessoaJuridica(String nome, double rendaAnual, int funcionarios, double impostoPessoaJuridica){
        super(nome, rendaAnual);
        this.funcionarios= funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios){
        this.funcionarios= funcionarios;
    }

    public static double impostoPessoaJuridica(int funcionarios){
        if(funcionarios > 10){
            return getRendaAnual() * 0.14;
        }
        else{
            return getRendaAnual() * 0.16;
        }
    }

    @Override
    public String fichaPessoa () {
        return "Nome: " + getNome()
                + "\nQuantidade de funcionários: " + String.format("%d", funcionarios)
                + "\nImpostos: " + String.format("%.2f", PessoaJuridica.impostoPessoaJuridica(funcionarios));
    }
}
