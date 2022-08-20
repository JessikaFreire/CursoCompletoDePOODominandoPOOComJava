package Projeto01TrabalhandoComClassesEInstânciaDeObjetos;

public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com Java");

        // Instanciando uma classe, construindo um objeto.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulano";
        pessoa1.idade = 21;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println("--------------------------------");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ciclano";
        pessoa2.idade = 23;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println("--------------------------------");

        Carro meuCarro = new Carro();
        meuCarro.ano = 2021;
        meuCarro.modelo = "Jeep";
        meuCarro.cor = "Preto";

        System.out.println(meuCarro.ano);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.cor);
        System.out.println("--------------------------------");

    }
}