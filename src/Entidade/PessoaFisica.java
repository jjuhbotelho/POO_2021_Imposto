package Entidade;

public class PessoaFisica extends Pessoa{

        protected static double gastosSaude;
        protected static double impostoPessoaFisica;

        public PessoaFisica(String nome, double rendaAnual, double gastosSaude, double impostoPessoaFisica){
            super(nome, rendaAnual);
            this.gastosSaude = gastosSaude;
        }

        public static double getGastosSaude() {
            return gastosSaude;
        }

        public void setGastosSaude(double gastosSaude){
            this.gastosSaude= gastosSaude;
        }

        public static double impostoPessoaFisica(double rendaAnual, double gastosSaude) {
            if(rendaAnual < 20000.00 & gastosSaude != 0.00){
                return getRendaAnual() * 0.15 - getGastosSaude() * 0.50;
            }
            else if(rendaAnual >= 20000.00 & gastosSaude != 0.00){
                return getRendaAnual() * 0.25 - getGastosSaude() * 0.50;
            }
            else if(rendaAnual < 20000.00 & gastosSaude == 0.00){
                return getRendaAnual() * 0.15;
            }
            else if(rendaAnual >= 20000.00 & gastosSaude == 0.00){
                return getRendaAnual() * 0.25;
            }
            return impostoPessoaFisica;
        }

        @Override
        public String fichaPessoa () {
            return "Nome: " + getNome()
                    + "\nGastos com saúde: " + String.format("%.2f", gastosSaude)
                    + "\nImpostos: " + String.format("%.2f", PessoaFisica.impostoPessoaFisica(rendaAnual, gastosSaude));
        }
}
