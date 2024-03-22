package locadora;

public class DvdLancamento implements Classificacao{
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