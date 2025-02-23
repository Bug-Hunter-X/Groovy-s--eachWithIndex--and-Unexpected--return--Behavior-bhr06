```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This only exits the eachWithIndex loop, not myMethod
    }
  }
  println "Exiting myMethod"
}

myMethod(["one", "two", "stop", "four"])
```