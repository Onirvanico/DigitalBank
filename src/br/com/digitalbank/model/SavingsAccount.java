package br.com.digitalbank.model;

public class SavingsAccount extends Account {

    public static final String SAVINGS_TITLE = "****Dados Conta Poupança****";

    public SavingsAccount(String agency, int number, double balance, Client client) {
        super(agency, number, balance, client);
    }

    @Override
    public void printBankStatement() {
        System.out.println(SAVINGS_TITLE);
        super.printInfo();
    }
}
