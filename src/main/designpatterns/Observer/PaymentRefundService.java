package main.designpatterns.Observer;

public class PaymentRefundService implements OrderCancelledSubscriber{

    @Override
    public void orderCancelledSubscriber() {
        System.out.println("Amount Refunded on Order Cancelled.");
    }
}
