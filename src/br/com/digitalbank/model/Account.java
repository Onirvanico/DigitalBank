package br.com.digitalbank.model;

import br.com.digitalbank.exceptions.InsuficientBalanceException;

public abstract class Account {

    protected String agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(String agency, int number, double balance, Client client) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void transfer(double value, Account destinyAccount) {
        if(balance >= value) {
            balance -= value;
            destinyAccount.deposit(value);
        }
        else throw new InsuficientBalanceException("Não há saldo suficiente para transferência");
    }

    public void  withdraw(double value) {
        if(balance >= value) balance -= value;
        else throw new InsuficientBalanceException("Não há saldo suficiente para saque");
    }

    protected void printInfo() {

        System.out.printf("Cliente: %s%n", client.toString());
        System.out.printf("Agência: %s%n", agency);
        System.out.printf("Conta: %d%n", number);
        System.out.printf("Saldo: %.2f%n", balance);

    }

    public abstract void printBankStatement();

    public String getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
