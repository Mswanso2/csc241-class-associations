package associations;

public class Product {

    private String ProductName;
    private String ISBNnumber;
    private double unitprice;

  // A constructor method that initializes the product name, ISBN number, and unit price
    public Product(String ProductName,String ISBNnumber, double unitprice){
        this.ProductName = ProductName;
        this.ISBNnumber = ISBNnumber;
        this.unitprice = unitprice;
    }
  // getProductName() - Returns a String that is the name of the product
    public String getProductName(){
        return ProductName;
    }
  // getIsbn() - Returns a String representing the ISBN (barcode) number
    public String getIsbn(){
        return ISBNnumber;
    }
  // getUnitPrice() - Returns a possible decimal value indicating the unit price for each product
    public double getUnitPrice(){
        return unitprice;
    }
}
