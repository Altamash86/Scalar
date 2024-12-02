package main.designpatterns.Behavioral.Observer;

public class ObserverMain {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();
        InventoryManagementService inventoryManagementService = new InventoryManagementService();
        PaymentRefundService paymentRefundService = new PaymentRefundService();

        Amazon amazon = new Amazon();

        //Registering for Order Placed Listeners
        amazon.registerForOrderPlaced(notificationService);
        amazon.registerForOrderPlaced(invoiceGeneratorService);
        amazon.registerForOrderPlaced(inventoryManagementService);

        //Registering for Order Cancelled Listeners
        amazon.registerForOrderCancelled(notificationService);
        amazon.registerForOrderCancelled(inventoryManagementService);
        amazon.registerForOrderCancelled(paymentRefundService);

        System.out.println("---------Order Placed-------------");
        amazon.orderPlaced();
        System.out.println("---------Order Cancelled-------------");
        amazon.orderCancelled();
    }
}
