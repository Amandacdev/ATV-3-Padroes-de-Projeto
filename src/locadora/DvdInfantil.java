package locadora;

public class DvdInfantil implements Classificacao {
    @Override
    public double calcularValor(int diasAlugados){
        //Regra de negócio: R$1.50 por 3 dias, dia adicioal acrescenta R$1.50
        double valorTotal = 1.5 + (diasAlugados - 3.0)*1.5;
        if(valorTotal<1.5){
            return 1.5;
        }
        else{
            return valorTotal;} 
    }

    public int getPontosDeAlugadorFrequente(int diasAlugados){

        return 0;
    }

}