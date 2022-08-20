package Projeto07InterfacesEnums.src.model;

import Projeto07InterfacesEnums.src.interfaces.ICamareira;
import Projeto07InterfacesEnums.src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Experiência em atender o telefone");
    }

    @Override
    public void falarIngles() {
        System.out.println("Possuo inglês fluente");
    }

    @Override
    public void arrumarACama() {
        System.out.println("Experiência em arrumar a cama");

    }

    @Override
    public void limparQuarto() {
        System.out.println("Experiência em limpar o quarto");

    }
    
}
