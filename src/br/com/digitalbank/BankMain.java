package br.com.digitalbank;

import br.com.digitalbank.model.Account;
import br.com.digitalbank.model.AccountType;
import br.com.digitalbank.model.Client;

public class BankMain {

    public static void main(String[] args) {
        Client client = new Client("Cristiano", "3245657869");
        Account ca = FactoryAccount.createAccount(AccountType.CKECKING_ACCOUNT, 150, client);
        Client client2 = new Client("May", "2345678");
        Account ca2 = FactoryAccount.createAccount(AccountType.CKECKING_ACCOUNT, 300, client2);
        Account sa = FactoryAccount.createAccount(AccountType.SAVINGS_ACCOUNT, 400, client);

        ca.printBankStatement();
        ca2.printBankStatement();
        sa.printBankStatement();

        System.out.println("____________________________");
        ca.deposit(1500);
        ca2.deposit(300);
        ca.printBankStatement();
        ca2.printBankStatement();


    }
}
