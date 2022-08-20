package Projeto08StreamsSolid.src;

import java.util.ArrayList;

import Projeto08StreamsSolid.src.model.Camareira;
import Projeto08StreamsSolid.src.model.Cliente;
import Projeto08StreamsSolid.src.model.EnumTipo;
import Projeto08StreamsSolid.src.model.Gerente;
import Projeto08StreamsSolid.src.model.Quarto;
import Projeto08StreamsSolid.src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();

        Cliente cliente1 = new Cliente("Manoel da Silva", "551999999999", "12345678901", 42);
        Cliente cliente2 = new Cliente("Fulano de Tal", "551999999999", "12345678901", 21);
        Cliente cliente3 = new Cliente("Ciclano Rodrigues", "551999999999", "12345678901", 36);
        Cliente cliente4 = new Cliente("Beltrano Rodrigues", "551999999999", "12345678901", 56);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        // Retorna a quantidade de elementos em uma stream (coleção)
        clientes.stream().count();
        clientes.size();

        clientes.stream()
        .limit(2)
        .forEach(c -> System.out.println(c.getNome()));
        System.err.println();

        clientes.stream().skip(2)
        .forEach(c -> System.out.println(c.getNome()));
        System.err.println();


        //var resultado3 =  clientes.stream().sorted();

        //clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream()
        .filter(c -> c.getIdade() > 25)
        .forEach(c -> System.out.println(c.getNome()));
        System.err.println();

        clientes.stream()
        .filter(c -> c.getNome().contains("Rodrigues"))
        .forEach(c -> System.out.println(c.getNome()));
        System.err.println();

        clientes.stream()
        .filter(c -> c.getNome().startsWith("B"))
        .forEach(c -> System.out.println(c.getNome()));
        System.err.println();

        clientes.stream().map(c -> c.getNome());
        clientes.stream().map(Cliente::getNome);




        /* Recepcionista recepcionista1 = new Recepcionista("Valéria", "551911111111", "98765432109");
        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();
        System.out.println();


        Camareira camareira1 = new Camareira("Joana", "551922222222", "012345678900");
        camareira1.arrumarACama();
        camareira1.limparQuarto();
        System.out.println();


        //Recepcionista indisponível
        Gerente gerente1 = new Gerente("Fabricio", "5519333333333", "0012345678");
        gerente1.atenderOTelefone();
        gerente1.falarIngles();
        System.out.println();


        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor()); */
    }
}
