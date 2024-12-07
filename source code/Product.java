public abstract  class Product {
    private String productName;
    private String productCategory;
    private int productID;

    public Product(String productName, String productCategory, int productID) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductID() {
        return productID;
    }

    public abstract String getDescription();
}


