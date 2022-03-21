package br.com.digitalbank.exceptions;

public class InsuficientBalanceException extends RuntimeException {

    public InsuficientBalanceException(String message) {
          throw new RuntimeException(message);
    }
}
