import 'package:homework07/service/vending_machine.dart';
import '../model/bar_model.dart';
import '../model/hot_drink_model.dart';
import '../repository/vending_machine_repository.dart';

class VendingMachineImpl implements VendingMachine {
  late final List<String> _productTypes = ["HotDrink", "Bar"];

  @override
  List<String> getProductPriceList() {
    return VendingMachineRepository.productList
        .map((product) => product.toString())
        .toList();
  }

  @override
  addProduct(String productType, Map<String, Object> productData) {
    switch (productType) {
      case "HotDrink":
        VendingMachineRepository.productList.add(HotDrink(productData));
        break;
      case "Bar":
        VendingMachineRepository.productList.add(Bar(productData));
        break;
      default:
        break;
    }
  }

  @override
  List<String> getProducts(Map<String, Object> matchPattern) {
    return VendingMachineRepository.productList
        .where((product) => product.isMatch(matchPattern))
        .map((product) => product.toString())
        .toList();
  }

  @override
  List<String> getProductTypes() {
    return _productTypes;
  }
}
