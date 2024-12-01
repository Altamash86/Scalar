package main.designpatterns.Adapter.thirdPartyBanks;

public class YESBankAPI {

    public float showBalance(String accountNumber){
        return 100f;
    }

    public boolean addAccount(BankAccountDTO bankAccountDTO){
        return true;
    }

    public char pay(String toUser, float amount){
        return 'Y';
    }
}
