package main.parlkingLot.models;

import main.parlkingLot.models.constant.PaymentMode;
import main.parlkingLot.models.constant.PaymentStatus;

public class Payment extends BaseModels {
    private Bill bill;
    private int amount;
    private PaymentMode paymentMode;
    private String transactionNumber;
    private PaymentStatus paymentStatus;

    public Payment() {
        super(1);
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
