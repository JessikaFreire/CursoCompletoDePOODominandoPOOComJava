package Projeto05PolimorfismoOverrideEncapsulamento.src.model;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, double saldoInicial) {
        // Cria uma conta bancária
        super(agencia, conta, digito, saldoInicial);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato() {
    }
    
}
