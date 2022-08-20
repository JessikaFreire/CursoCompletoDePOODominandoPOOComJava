package Projeto07InterfacesEnums.src.model;

import Projeto07InterfacesEnums.src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Especialista em atender o telefone");
    }

    @Override
    public void falarIngles() {
        System.out.println("Possuo inglês fluente");
    }

}
