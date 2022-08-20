package Projeto07InterfacesEnums.src.model;

import Projeto07InterfacesEnums.src.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarACama() {
        System.out.println("Especialista em arrumar a cama");

    }

    @Override
    public void limparQuarto() {
        System.out.println("Especialista em limpar o quarto");

    }

}
