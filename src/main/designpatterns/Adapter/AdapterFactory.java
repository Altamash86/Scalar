package main.designpatterns.Adapter;

import java.util.Objects;

public class AdapterFactory {
    public static BankAPIAdapter getBankAPIAdapter(String bankName) {
        if(Objects.equals(bankName, "YES")){
            return new YESBankAdapter();
        }
        return null;
    }
}
