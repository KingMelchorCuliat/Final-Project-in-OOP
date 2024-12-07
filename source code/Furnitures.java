public class Furnitures extends Product {
    private String type;
    private String material;
    private String specificType;
    private String details;

    public Furnitures(String productName, String productCategory, int productID,
                      String type, String specificType, String material, String details) {
        super(productName, productCategory, productID);  
        this.type = type;
        this.specificType = specificType;
        this.material = material;
        this.details = details;
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s, made of %s. %s", specificType, type, material, details);
    }
}
