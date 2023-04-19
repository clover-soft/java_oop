abstract class VendingMachine {
  List<String> getProductPriceList();

  void addProduct(String productType, Map<String, Object> productData);

  List<String> getProducts(Map<String, Object> matchPattern);

  List<String> getProductTypes();
}
