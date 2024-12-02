package main.designpatterns.Structural.Adapter;

import main.designpatterns.Structural.Adapter.thirdPartyBanks.BankAccountDTO;

public interface BankAPIAdapter {

    int getBalance(String accountNumber);

    char addAccount(BankAccountDTO bankAccountDTO);

    boolean payAmount(double amount, String toUser);
}
