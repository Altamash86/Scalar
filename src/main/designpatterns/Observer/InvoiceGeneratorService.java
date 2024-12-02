package main.designpatterns.Observer;

public class InvoiceGeneratorService implements OrderPlacedSubscriber{

    @Override
    public void orderPlacedAction() {
        System.out.println("Invoice generated on Order Placed.");
    }
}
