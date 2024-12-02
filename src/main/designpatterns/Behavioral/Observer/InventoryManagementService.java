package main.designpatterns.Behavioral.Observer;

public class InventoryManagementService implements OrderPlacedSubscriber,OrderCancelledSubscriber{

    @Override
    public void orderCancelledSubscriber() {
        System.out.println("Inventory Increased on Order Cancelled.");
    }

    @Override
    public void orderPlacedAction() {
        System.out.println("Inventory Reduced on Order Placed.");
    }
}
