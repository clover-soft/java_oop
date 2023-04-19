import '../service/vending_machine_impl.dart';

class VendingMachineController {
  final VendingMachineImpl _vendingMachineService = VendingMachineImpl();

  addProduct(String productType, Map<String, Object> productData) {
    if (_vendingMachineService.getProductTypes().contains(productType)) {
      _vendingMachineService.addProduct(productType, productData);
    }
  }

  List<String> getPpriceList() {
    return _vendingMachineService.getProductPriceList();
  }

  List<String> getProductByMatchPattern(Map<String, Object> matchPattern) {
    return _vendingMachineService.getProducts(matchPattern);
  }
}
