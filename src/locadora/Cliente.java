package locadora;
import java.util.ArrayList;
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

    public String extrato() {
        for (Aluguel aluguel : dvdsAlugados) {
            return aluguel.getValorTotal(dvdsAlugados);
        }
        return "Sem alugueis registrados";
    }

    public String pontosTotais(){
        for (Aluguel aluguel : dvdsAlugados) {
            return "O cliente " + getNome() + " possui " + aluguel.getPontosTotaisDeAlugadorFrequente(dvdsAlugados) + " pontos.";
        }
        return "Registro não localizado";
    }
}
