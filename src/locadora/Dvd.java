package locadora;

public class Dvd{
    private String título;
    private Classificacao classificacao;

    public Dvd(String título, Classificacao classificacao){
        this.título = título;
        this.classificacao = classificacao;
    }

    public String getTítulo(){
        return título;
    }
    public Classificacao getClassificacao(){
        return classificacao;
    }
}