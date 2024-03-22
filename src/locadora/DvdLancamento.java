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
        double valorTotal = diasAlugados *3.0; 
        return valorTotal;
    };    
}