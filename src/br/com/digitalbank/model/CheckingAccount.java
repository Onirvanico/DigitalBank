package br.com.digitalbank.model;

public class CheckingAccount extends Account{

    public static final String CHECKING_TITLE = "****Dados Conta Corrente****";

    public CheckingAccount(String agency, int number, double balance, Client client) {
        super(agency, number, balance, client);
    }

    @Override
    public void printBankStatement() {
        System.out.println(CHECKING_TITLE);
        super.printInfo();
    }
}
