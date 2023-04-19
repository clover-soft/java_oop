import 'package:homework07/model/product_class.dart';

class Bar extends Product {
  late double _weight;

  Bar(Map<String, Object> productData) : super(productData) {
    _weight = productData["weight"] as double;
  }

  double getWeight() {
    return _weight;
  }

  @override
  String toString() {
    return "Bar => ${super.toString()} weight: $_weight";
  }

  @override
  bool isMatch(Map<String, Object> matchPattern) {
    bool matchBySuper = super.isMatch(matchPattern);
    bool matchByWeight = !matchPattern.containsKey("weight") ||
        matchPattern.containsKey("weight") &&
            (matchPattern["weight"] is double) &&
            (matchPattern["weight"] as double) == _weight;
    return matchBySuper && matchByWeight;
  }
}
