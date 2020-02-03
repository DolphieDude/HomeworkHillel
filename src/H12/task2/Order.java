package H12.task2;

public class Order {
    private int id;
    private OrderStatus orderStatus;

    Order(int id) {
        this.id = id;
        orderStatus = OrderStatus.NEW;
    }

    private int getId() {
        return id;
    }

    OrderStatus getOrderStatus() {
        return orderStatus;
    }

    void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Order) {
            Order order = (Order) obj;
            return order.getId() == this.id;
        }
        else return false;
    }
}
