package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarAluguel(Aluguel aluguel){
        dvdsAlugados.add(aluguel);
    }

    public String extrato(){
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        
        String resultado = "Registro de Alugueis de " + nome + ":\n";

        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += aluguel.valorAluguel();
            resultado += "Filme: " + aluguel.dvd.getTítulo() + " | Dias: " + aluguel.diasAlugado + " |Total: R$" +aluguel.valorAluguel() + "\n";
            pontosDeAlugadorFrequente += aluguel.pontosDeAlugadorFrequente();
        }
        resultado += "Valor total: R$" + valorTotal +"\nVocê acumulou " + pontosDeAlugadorFrequente +" pontos de alugador frequente.";
        return resultado;
    }
}