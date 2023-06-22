public class Price {
    private final String storeName;
    private final String productName;
    private final Double productPrice;

    public Price(String productName, String storeName, Double productPrice) {
        /*
        тут також помилка
        Ви передаєте - new Price(productName, storeName, priceValue)
        а зберігаєте  productName --> storeName
         */
//        this.storeName = storeName;
//        this.productName = productName;
//        this.productPrice = productPrice;
        this.productName = productName;
        this.storeName = storeName;
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
