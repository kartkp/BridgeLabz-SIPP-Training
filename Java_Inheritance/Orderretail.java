package Java_Inheritance;

class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Orderretail {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "01-07-2025", "TRK123", "03-07-2025");
        System.out.println(d.getOrderStatus());
        System.out.println(d.orderId + " " + d.orderDate + " " + d.trackingNumber + " " + d.deliveryDate);
    }
}

