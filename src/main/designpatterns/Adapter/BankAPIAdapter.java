package main.designpatterns.Adapter;

import main.designpatterns.Adapter.thirdPartyBanks.BankAccountDTO;

public interface BankAPIAdapter {

    int getBalance(String accountNumber);

    char addAccount(BankAccountDTO bankAccountDTO);

    boolean payAmount(double amount, String toUser);
}
