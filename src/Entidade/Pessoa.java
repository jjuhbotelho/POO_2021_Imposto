package Entidade;

public class Pessoa {

    private String nome;
    protected static double rendaAnual;

    public Pessoa(String nome,double rendaAnual){
        this.nome = nome;
        Pessoa.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }
    public static double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        Pessoa.rendaAnual = rendaAnual;
    }

    public String fichaPessoa () {
        return nome;
    }

}
