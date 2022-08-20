package Projeto06Collections.src.model;

import java.util.Date;

import Projeto06Collections.src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, double saldoInicial) {
        // Cria uma conta bancária
        super(agencia, conta, digito, saldoInicial);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------- Extrato Bancário -----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        System.out.println("Gerado em " + DataUtil.converterDateParaDataEHora(new Date()));
        System.out.println();

        // Para cada movimentação dentro de movimentaçções
        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao);
            System.out.println();

        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println();


    }

}
