package main.designpatterns.Structural.Adapter;

import main.designpatterns.Structural.Adapter.thirdPartyBanks.BankAccountDTO;
import main.designpatterns.Structural.Adapter.thirdPartyBanks.YESBankAPI;

public class YESBankAdapter implements BankAPIAdapter{

    private final YESBankAPI yesBankAPI;

    public YESBankAdapter() {
        this.yesBankAPI = new YESBankAPI();
    }

    @Override
    public int getBalance(String accountNumber) {
        return (int) yesBankAPI.showBalance(accountNumber);
    }

    @Override
    public char addAccount(BankAccountDTO bankAccountDTO) {
        boolean addAccount = yesBankAPI.addAccount(bankAccountDTO);
        return addAccount ?'Y':'N';
    }

    @Override
    public boolean payAmount(double amount, String toUser) {
        char y = yesBankAPI.pay(toUser,(float) amount);
        return y == 'Y';
    }
}
