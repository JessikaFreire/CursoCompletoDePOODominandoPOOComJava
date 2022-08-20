package Projeto07InterfacesEnums.src;

import Projeto07InterfacesEnums.src.model.Camareira;
import Projeto07InterfacesEnums.src.model.Cliente;
import Projeto07InterfacesEnums.src.model.EnumTipo;
import Projeto07InterfacesEnums.src.model.Gerente;
import Projeto07InterfacesEnums.src.model.Quarto;
import Projeto07InterfacesEnums.src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();

        Cliente cliente1 = new Cliente("Manoel da Silva", "551999999999", "12345678901");

        Recepcionista recepcionista1 = new Recepcionista("Valéria", "551911111111", "98765432109");
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
        System.out.println(quarto2.getTipo().getValor());
    }
}
