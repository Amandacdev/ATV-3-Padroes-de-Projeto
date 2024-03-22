package locadora;

public class DvdLancamento implements Dvd{
    public Classificacao tipo;
    public String título;
    
    public DvdLancamento(String título) {
        this.título = título;
        this.tipo = Classificacao.LANCAMENTO;
    }
  
    public String getTítulo() {
        return título;
    }

    public Classificacao getTipo(){
        return tipo;
    }
     
    public String toString(){
        return "O filme " + título + " é " + tipo + ".";
    }
    
    @Override
    public double calcularValor(int diasAlugados){
        //Regra de negócio: R$ 3.00 por dia
        return diasAlugados *3.0;
    }

    //Regra de negócio: Ao alugar um dvd do tipo lançamento por 2 dias ou menos, o cliente ganha um ponto.
    public int getPontosDeAlugadorFrequente(int dias){
        if(dias <= 2){
            return 1;}
        return 0;
    }
}