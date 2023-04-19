import 'package:homework07/controller/vending_machine_controller.dart';

class View {
  static final VendingMachineController _vMachineController =
      VendingMachineController();
  static execute() {
    _vMachineController
        .addProduct("Bar", {"name": "snikers", "cost": 50, "weight": 0.08});
    _vMachineController
        .addProduct("Bar", {"name": "bounty", "cost": 55, "weight": 0.06});
    _vMachineController
        .addProduct("Bar", {"name": "mars", "cost": 45, "weight": 0.08});
    _vMachineController
        .addProduct("Bar", {"name": "twix", "cost": 40, "weight": 0.05});
    _vMachineController
        .addProduct("Bar", {"name": "kit-cat", "cost": 35, "weight": 0.04});
    _vMachineController
        .addProduct("Bar", {"name": "nuts", "cost": 50, "weight": 0.07});
    _vMachineController.addProduct("HotDrink",
        {"name": "Green tea", "cost": 90, "volume": 0.22, "temperature": 70});
    _vMachineController.addProduct("HotDrink",
        {"name": "Black tea", "cost": 90, "volume": 0.22, "temperature": 80});

    for (String priceItem in _vMachineController.getPpriceList()) {
      print(priceItem);
    }

    print(_vMachineController.getProductByMatchPattern({"cost": 50}));
  }
}



//  public static void main(String[] args) {
//         VendingMachineController vMachineController = new VendingMachineController();
//         vMachineController.addProduct("Bar", Map.of("name", "snikers", "cost", 50, "weight", 0.08));
//         vMachineController.addProduct("Bar", Map.of("name", "bounty", "cost", 55, "weight", 0.06));
//         vMachineController.addProduct("Bar", Map.of("name", "mars", "cost", 45, "weight", 0.08));
//         vMachineController.addProduct("Bar", Map.of("name", "twix", "cost", 40, "weight", 0.05));
//         vMachineController.addProduct("Bar", Map.of("name", "kit-cat", "cost", 35, "weight", 0.04));
//         vMachineController.addProduct("Bar", Map.of("name", "nuts", "cost", 50, "weight", 0.07));
//         vMachineController.addProduct("HotDrink",
//                 Map.of("name", "Green tea", "cost", 90, "volume", 0.22, "temperature", 70));
//         vMachineController.addProduct("HotDrink",
//                 Map.of("name", "Black tea", "cost", 90, "volume", 0.22, "temperature", 80));

//         for (String priceItem : vMachineController.getPpriceList()) {
//             System.out.println(priceItem);

//         }
//         System.out.println(vMachineController.getProductByMatchPattern(Map.of("cost", 50)));