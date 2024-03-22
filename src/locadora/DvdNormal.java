package locadora;

public class DvdNormal implements Dvd{
    public Classificacao tipo;
    public String título;
    
    public DvdNormal(String título) {
        this.título = título;
        this.tipo = Classificacao.NORMAL;
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
        //Regra de negócio: R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50.
        double valorTotal = 2.0 + (diasAlugados - 2.0)*1.5;
        if(valorTotal<2.0){
            return 2.0;
        }
        else{
            return valorTotal;}
    };    
}