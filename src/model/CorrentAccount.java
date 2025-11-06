package model;

import contracts.ITributavel;

public class CorrentAccount extends Account implements ITributavel {

    private double saleEspecial;

    public CorrentAccount(int agence, int numberAccount, Client titular, double saleEspecial) {
        super(agence, numberAccount, titular);
        this.saleEspecial = saleEspecial;
    }

    public CorrentAccount(Client titular, int agence, int numberAccount) {
    }

    @Override
    public void sacar(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("The value requers to be positive");
        } if((this.money + this.saleEspecial) < value ) {
            throw new IllegalArgumentException("Insuficient money");

        }
        this.money -= value;
        System.out.println("Saque: " + value);

    }

    @Override
    public void imprimirExtrato() {

        System.out.println("==== Extract of the Corrent Account: ");
        System.out.println("Titular: " + titular.getName());
        System.out.println("Agence: " + this.agence);
        System.out.println("Account: " + this.numberAccount );
        System.out.printf("Money: R$ %.2f" + this.money);

        System.out.printf("Sale especial: " + this.saleEspecial);
    }

    @Override
    public double getValueImpost() {
        double taxaFixa = 20.0;
        double taxaChequeEspecial = this.saleEspecial * 0.001;
        return taxaFixa + taxaChequeEspecial;
    }
}
