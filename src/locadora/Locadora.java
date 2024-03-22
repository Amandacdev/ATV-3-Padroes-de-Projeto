package locadora;

public class Locadora {
    public static void main(String[]args){
        Classificacao infantil = new DvdInfantil();
        Classificacao normal = new DvdNormal();
        Classificacao lancamento = new DvdLancamento();

        var cli1 = new Cliente("Amanda Cruz");

        var dvd1 = new Dvd("O irmão urso",infantil);
        var dvd2 = new Dvd("Duna 2",lancamento);
        var dvd3 = new Dvd("Harry",normal);
        var dvd4 = new Dvd("Fabrica de Chocolate",lancamento);

        cli1.adicionarAluguel( new Aluguel(dvd1,4));
        cli1.adicionarAluguel(new Aluguel(dvd2, 4));
        cli1.adicionarAluguel(new Aluguel(dvd3, 1));
        cli1.adicionarAluguel(new Aluguel(dvd4, 1));

        //System.out.println(cli1.extrato());
        System.out.println(cli1.extratoHTML());

    }
}