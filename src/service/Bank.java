package service;

import model.Account;
import model.Client;
import model.CorrentAccount;
import model.PoupanceAccount;
import persistance.IRepositorio;
import persistance.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private IRepositorio<Account> accountIRepositorio;

    private IRepositorio<Client> clientIRepositorio;

    public Bank(String name) {
        this.name = name;

        this.accountIRepositorio = new RepositorioMemoria<>();
        this.clientIRepositorio = new RepositorioMemoria<>();
    }

    public void adiconarCliente(Client cliente) {
        this.clientIRepositorio.save(cliente);
    }

    public CorrentAccount openCorrentAccount (Client titular, int agence, int numberAccount) {
        CorrentAccount newAccount = new CorrentAccount(titular, agence, numberAccount);
        this.accountIRepositorio.save(newAccount);
        System.out.println("Corrent Account open: " + titular.getName());
        return newAccount;
    }

    public PoupanceAccount openPoupanceAccount (Client titular, int agence, int numberAccount) {
        PoupanceAccount newAccountPoupance = new PoupanceAccount(titular, agence, numberAccount);
        this.accountIRepositorio.save(newAccountPoupance);
        System.out.println("Poupance account open: " + titular.getName());
        return newAccountPoupance;
    }

    public Account searchAcountInNumbers (int numberAccount) {
        List<Account> allAccounts = this.accountIRepositorio.listAll();

        for (Account account : allAccounts ) {
            if (account.getNumberAccount() ==  numberAccount) {
                return account;
            }
        }
        return null;


    }

    public void listarAccounts() {
        System.out.println("=== List of the accounts in the bank:" + this.name + "===");

        List<Account> accounts = this.accountIRepositorio.listAll();

        for (Account account : accounts) {
            System.out.println(
                    "Number: " + account.getNumberAccount() +
                    ", Titular: " + account.getTitular().getName() +
                            (", Saldo: R$ %.2f" + account.getMoney())
            );
        }
    }
}
