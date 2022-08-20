package Projeto02EvoluindoComClasses;

public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com Java");

        // Instanciando uma classe, construindo um objeto.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println("--------------------------------");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ciclano");
        pessoa2.setIdade(23);

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println("--------------------------------");

        Carro meuCarro = new Carro();
        meuCarro.setAno(2019);
        meuCarro.setModelo("Honda Civic");
        meuCarro.setCor("Pata");

        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getCor());
        System.out.println("--------------------------------");

        Carro novoCarro = new Carro("Fiat Toro", 2020, "Branca");

        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getCor());
        System.out.println("--------------------------------");

    }
}