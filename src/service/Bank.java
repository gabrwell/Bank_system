package service;

import model.Account;
import model.Client;
import model.CorrentAccount;
import model.PoupanceAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public CorrentAccount openCorrentAccount (Client titular, int agence, int numberAccount) {
        CorrentAccount newAccount = new CorrentAccount(titular, agence, numberAccount);
        this.accounts.add(newAccount);
        System.out.println("Corrent Account open: " + titular.getName());
        return newAccount;
    }

    public PoupanceAccount openPoupanceAccount (Client titular, int agence, int numberAccount) {
        PoupanceAccount newAccountPoupance = new PoupanceAccount(titular, agence, numberAccount);
        this.accounts.add(newAccountPoupance);
        System.out.println("Poupance account open: " + titular.getName());
        return newAccountPoupance;
    }

    public Account searchAcountInNumbers (int numberAccount) {
        for (Account account : this.accounts) {
            if (account.getNumberAccount() ==  numberAccount) {
                return account;
            }
        }
        return null;


    }

    public void listarAccounts() {
        System.out.println("=== List of the accounts in the bank:" + this.name + "===");

        for (Account account : this.accounts) {
            System.out.println(
                    "Number: " + account.getNumberAccount() +
                    ", Titular: " + account.getTitular().getName() +
                            (", Saldo: R$ %.2f" + account.getMoney())
            );
        }
    }
}
