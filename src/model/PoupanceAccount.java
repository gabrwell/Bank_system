package model;

public class PoupanceAccount extends Account{

    private static final double TAXA_RENDIMENT = 0.005;

    public PoupanceAccount () {

    }

    public PoupanceAccount(int agence, int numberAccount, Client titular) {
        super(agence, numberAccount, titular);
    }

    public void aplicarRendiment () {
        double rendiment = this.money * TAXA_RENDIMENT;
        System.out.printf("Rendiment of: R$ %.2f " + rendiment);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("==== Extract of the Poupance Account: ");
        System.out.println("Titular: " + titular.getName());
        System.out.println("Agence: " + this.agence);
        System.out.println("Account: " + this.numberAccount );
        System.out.printf("Money: R$ %.2f" + this.money);

    }
}
