```groovy
def myMethod(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    String item = list[i]
    println "Item $i: $item"
    if (item == "stop") {
      break
    }
  }
  println "Exiting myMethod"
}

myMethod(["one", "two", "stop", "four"])
```
```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return false //Return false to stop the iteration
    }
  }
  println "Exiting myMethod"
}

myMethod(["one", "two", "stop", "four"])
```