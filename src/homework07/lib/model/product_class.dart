abstract class Product {
  late String _name;
  late int _cost;

  Product(Map<String, Object> productData) {
    _name = productData["name"] as String;
    _cost = productData["cost"] as int;
  }

  String getName() {
    return _name;
  }

  int getCost() {
    return _cost;
  }

  @override
  String toString() {
    return "Product name: $_name price: $_cost";
  }

  bool isMatch(Map<String, Object> matchPattern) {
    bool matchByCost = !matchPattern.containsKey("cost") ||
        matchPattern.containsKey("cost") &&
            (matchPattern["cost"] is int) &&
            (matchPattern["cost"] as int) == _cost;
    bool matchByName = !matchPattern.containsKey("name") ||
        matchPattern.containsKey("name") &&
            (matchPattern["name"] is String) &&
            (matchPattern["name"] as String) == _name;

    return matchByCost && matchByName;
  }
}
