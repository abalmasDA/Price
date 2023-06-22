public class Price {
    private String storeName;
    private String productName;
    private Double productPrice;

    public Price(String productName, String storeName, Double productPrice) {
        this.storeName = storeName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
}
