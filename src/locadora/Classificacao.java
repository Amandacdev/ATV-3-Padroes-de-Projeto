package locadora;

public interface Classificacao {
    public String toString();
    public double calcularValor(int diasAlugados);

    public int getPontosDeAlugadorFrequente(int dias);

}