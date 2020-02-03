package H12.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Order> orders = new LinkedList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int orderNum = 0, action;
        do {
            System.out.println("Enter number of order; Enter any negative number or 0 to quit");
            try {
                orderNum = Integer.parseInt(input.readLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Not a number");
                continue;
            }
            if(orders.contains(new Order(orderNum))) {
                int i = orders.indexOf(new Order(orderNum));
                System.out.println("Order is " + orders.get(i).getOrderStatus());
                ArrayList<OrderStatus> orderStatuses = new ArrayList<>();
                switch (orders.get(i).getOrderStatus()) {
                    case FAILED:
                        orders.remove(i);
                        continue;
                    case NEW:
                        orderStatuses.add(OrderStatus.IN_PROGRESS);
                    case IN_PROGRESS:
                        orderStatuses.add(OrderStatus.FINISHED);
                        orderStatuses.add(OrderStatus.FAILED);
                }
                if(orderStatuses.size() == 0) continue;
                System.out.println("Choose action");
                for (int j = 0; j < orderStatuses.size(); j++) System.out.println(j + 1 + ". "  + orderStatuses.get(j));
                System.out.println("Anything else to quit");
                try {
                    action = Integer.parseInt(input.readLine());
                    Order newOrder = orders.get(i);
                    newOrder.setOrderStatus(orderStatuses.get(action - 1));
                    orders.add(i, newOrder);
                    orders.remove(i + 1);
                }
                catch (Exception e) {
                    continue;
                }
                System.out.println("Done");
            }
            else if(orderNum > 0) {
                orders.add(new Order(orderNum));
                System.out.println("Added new order");
            }
        } while (orderNum > 0);
    }
}
