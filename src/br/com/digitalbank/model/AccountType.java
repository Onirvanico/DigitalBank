package br.com.digitalbank.model;

public enum AccountType {

    CKECKING_ACCOUNT("302"), SAVINGS_ACCOUNT("303");

    public final String value;

    AccountType(String s) {
        value = s;
    }
}
