package associations;

import java.util.ArrayList;

public class Order {
    private Account accountname;

    ArrayList<OrderItem> items = new ArrayList<OrderItem>();

  //  A constructor that initializes the account number and an empty collection of items
    public Order(Account accountname){
        this.accountname = accountname;
        ArrayList<OrderItem> items = new ArrayList<OrderItem>();
    }
  // getAccount() - Returns a refernece to the Account object associated with this order
    public Account getAccount(){
        return accountname;
    }

  // addItem(OrderItem item) - Adds an order item (above) to this order
    public void addItem(OrderItem item){
        items.add(item);

    }

  // getItems() - Returns an array of OrderItem object references listing all purchases
    public OrderItem[] getItems(){
        OrderItem[] itemArray = new OrderItem[items.size()];
        itemArray = items.toArray(itemArray);
        return itemArray;

    }
  // getTotal() - Returns the price of all items purchased
    public double getTotal(){
        double totalprice = 0;
        for (int i = 0; i < items.size();i = i +1) {
            totalprice = totalprice + items.get(i).getPrice();
        }
        return totalprice;

    }

}
