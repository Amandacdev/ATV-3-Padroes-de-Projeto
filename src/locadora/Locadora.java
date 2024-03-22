package locadora;

public class Locadora {
    public static void main(String[]args){
        var dvd1 = new DvdInfantil("O irmão urso");
        var dvd2 = new DvdLancamento("Duna 2");
        var dvd3 = new DvdNormal("Harry");
        var dvd4 = new DvdLancamento("Fabrica de Chocolate");

        var cli1 = new Cliente("Amanda Cruz");
        cli1.adicionarAluguel( new Aluguel(dvd1,4));
        cli1.adicionarAluguel(new Aluguel(dvd2, 4));
        cli1.adicionarAluguel(new Aluguel(dvd3, 1));
        cli1.adicionarAluguel(new Aluguel(dvd4, 1));
        System.out.println(cli1.extrato());
    }
}