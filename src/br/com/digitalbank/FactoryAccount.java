package br.com.digitalbank;

import br.com.digitalbank.model.*;

public class FactoryAccount {

    private static int SEQ_CHECKING_ACCOUNT = 0;
    private static int SEQ_SAVINGS_ACCOUNT = 0;

    public static Account createAccount(AccountType type, double value, Client client) {
        if(type.name() == AccountType.CKECKING_ACCOUNT.name())
            return new CheckingAccount(type.value, ++SEQ_CHECKING_ACCOUNT, value, client);
        else
            return new SavingsAccount(type.value, ++SEQ_SAVINGS_ACCOUNT, value, client);
    }
}
