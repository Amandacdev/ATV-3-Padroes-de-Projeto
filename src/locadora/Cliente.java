package locadora;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

    public String getNome() {
        return nome;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarAluguel(Aluguel aluguel){
        dvdsAlugados.add(aluguel);
    }

    /*
    public String extrato() {
        for (Aluguel aluguel : dvdsAlugados) {
            return aluguel.getValorTotal(dvdsAlugados);
        }
        return "Sem alugueis registrados";
    }

     */

    public int pontosTotais(){
        for (Aluguel aluguel : dvdsAlugados) {
            //return "O cliente " + getNome() + " possui " + aluguel.getPontosTotaisDeAlugadorFrequente(dvdsAlugados) + " pontos.";
            return aluguel.getPontosTotaisDeAlugadorFrequente(dvdsAlugados);
        }
        return 0;
    }

    public double getValorTotal(){
        for (Aluguel aluguel : dvdsAlugados) {
            return aluguel.getValorTotal(dvdsAlugados);
        }
        return 0;
    }

    public String extratoHTML(){
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "Registro de Alugueis de" + getNome() + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            resultado += cada.dvd.getTítulo()  + ": R$ " + cada.dvd.getClassificacao().calcularValor(cada.diasAlugado)+ fimDeLinha;
        }

        resultado += "Valor total pago: R$ " +  getValorTotal() + fimDeLinha;
        resultado += "Voce acumulou " +
                pontosTotais() +
                " ponto(s) de alugador frequente";
        return resultado;
    }

}
