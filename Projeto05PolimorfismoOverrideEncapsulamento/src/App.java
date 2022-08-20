package Projeto05PolimorfismoOverrideEncapsulamento.src;

import Projeto05PolimorfismoOverrideEncapsulamento.src.model.ContaCorrente;
import Projeto05PolimorfismoOverrideEncapsulamento.src.model.ContaPoupanca;
import Projeto05PolimorfismoOverrideEncapsulamento.src.model.Movimentacao;
import Projeto05PolimorfismoOverrideEncapsulamento.src.utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0);
        System.out.println("Saldo atual de R$ " + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$ " + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$ " + conta.getSaldo());
        System.out.println();
        System.out.println("-----------------------");


        ContaPoupanca conta2 = new ContaPoupanca("0001", "7542", 6, 200.0);

        conta2.transferir(100.0, conta);
        System.out.println("Saldo conta destino de R$ " + conta2.getSaldo());
        System.out.println();
        System.out.println("Saldo atual de R$ " + conta.getSaldo());
        System.out.println();
        System.out.println(conta2.getDataAbertura());

        //DataUtil util = new DataUtil();
       // var formato1 = util.converterDateParaDataEHora(conta2.getDataAbertura());
        var formato1 = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
        System.out.println(formato1);
        var formato2 = DataUtil.converterDateParaData(conta2.getDataAbertura());
        System.out.println(formato2);
        var formato3 = DataUtil.converterDateParaHora(conta2.getDataAbertura());
        System.out.println(formato3);


        Movimentacao movimentacao = new Movimentacao("Saque", 100.0);
        System.out.println(movimentacao);
        movimentacao.toString();


    }
}
