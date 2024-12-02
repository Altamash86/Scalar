package main.designpatterns.Behavioral.Observer;

public class NotificationService implements OrderPlacedSubscriber,OrderCancelledSubscriber{

    @Override
    public void orderCancelledSubscriber() {
        System.out.println("Notification Send on Order Cancelled.");
    }

    @Override
    public void orderPlacedAction() {
        System.out.println("Notification Send on Order Placed.");
    }
}
