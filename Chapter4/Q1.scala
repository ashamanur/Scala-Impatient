//Set up a map of prices for a number of gizmos that you covet. Then produce
//a second map with the same keys and the prices at a 10 percent discount.

val myGizmos = Map(("iPhone 6S",700),("iPhone 5",400),("Kindle",140))
val newPrices = for((k,v) <- myGizmos) yield (k, 0.9 * v)
print(newPrices)