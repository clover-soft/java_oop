import 'package:homework07/model/product_class.dart';

class HotDrink extends Product {
  late int _temperature;
  late double _volume;
  HotDrink(Map<String, Object> productData) : super(productData) {
    _temperature = productData["temperature"] as int;
    _volume = productData["volume"] as double;
  }

  int getTemperature() {
    return _temperature;
  }

  double getVolume() {
    return _volume;
  }

  @override
  String toString() {
    return "HotDrink => ${super.toString()} temperature: $_temperature volume: $_volume";
  }

  @override
  bool isMatch(Map<String, Object> matchPattern) {
    bool matchBySuper = super.isMatch(matchPattern);
    bool matchByVolume = !matchPattern.containsKey("volume") ||
        matchPattern.containsKey("volume") &&
            (matchPattern["volume"] is double) &&
            (matchPattern["volume"] as double) == _volume;
    bool matchByTemperature = !matchPattern.containsKey("temperature") ||
        matchPattern.containsKey("temperature") &&
            (matchPattern["temperature"] is int) &&
            (matchPattern["temperature"] as int) == _temperature;

    return matchByTemperature && matchByVolume && matchBySuper;
  }
}
