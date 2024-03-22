package locadora;

public class Aluguel {
    public Dvd dvd;
    public int diasAlugado;

    public Aluguel(Dvd dvd, int diasAlugado){
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }

    public Double valorAluguel(){
        return dvd.calcularValor(diasAlugado);
    }

    public int pontosDeAlugadorFrequente(){
        //Regra de negócio: Ao alugar um dvd do tipo lançamento por 2 dias ou menos, o cliente ganha um ponto. 
        if(dvd.getTipo().equals(Classificacao.LANCAMENTO) && diasAlugado <= 2){
            return 1;
        } else{
            return 0;
        }
    };

    public String toString(){
        return "O filme " + dvd.getTítulo() + " foi alugado por " + diasAlugado + " dias.";
    }
}
