package main.designpatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    List<OrderPlacedSubscriber> orderPlacedSubscribers;
    List<OrderCancelledSubscriber> orderCancelledSubscribers;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
        this.orderCancelledSubscribers = new ArrayList<>();
    }

    public void registerForOrderPlaced(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterForOrderPlaced(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerForOrderCancelled(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void deRegisterForOrderCancelled(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlacedAction();
        }
    }

    public void orderCancelled(){
        for(OrderCancelledSubscriber orderCancelledSubscriber : orderCancelledSubscribers){
            orderCancelledSubscriber.orderCancelledSubscriber();
        }
    }

}
