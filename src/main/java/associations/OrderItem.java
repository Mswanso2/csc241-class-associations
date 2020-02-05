package associations;

public class OrderItem {
    private Product ProductName;
    private double Quantity;

  // A constructor that initializes the product and quantity
    public OrderItem(Product ProductName,double Quantity){
        this.ProductName = ProductName;
        this.Quantity = Quantity;
    }

  // getProduct() - Returns a reference to the Product object purchased
    public Product getProduct(){
        return ProductName;
  }
  // getQuantity() - Returns an integer indicating how many products were purchased
    public double getQuantity(){
        return Quantity;
    }
  // getPrice() - Returns the price of this item, based on the unit price of the product and the quantity
    public double getPrice(){
        return (ProductName.getUnitPrice() * Quantity);
    }

}
