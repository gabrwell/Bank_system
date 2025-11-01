package model;

public abstract class Account {

    protected int agence;
    protected int numberAccount;
    protected double money;
    protected Client titular;

    public Account () {

    }

    public Account(int agence, int numberAccount, Client titular) {
        this.agence = agence;
        this.numberAccount = numberAccount;
        this.titular = titular;
        this.money = 0.0;
    }

    public void sacar(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("The value requers to be positive");
        }
        if (this.money < value) {
            throw new IllegalArgumentException("Money insuficient");
        }
        this.money -= value;
        System.out.println("You can grab money!! -->: " + value);

    }


    public void deposit(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("The money gotta to be positive");
        }
        this.money += value;
        System.out.println("Deposit for: ");
    }

    public void transfer(double value, Account accountDestiny) {

        this.sacar(value);
        accountDestiny.deposit(value);
        System.out.println("Your transfer: " + value + "to the account>" + accountDestiny);

    }

    public int getAgence() {
        return agence;
    }

    public void setAgence(int agence) {
        this.agence = agence;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }



    public Client getTitular() {
        return titular;
    }

    public void setTitular(Client titular) {
        this.titular = titular;
    }

    public abstract void imprimirExtrato();
}
