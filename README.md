# Groovy's `eachWithIndex` and Unexpected `return` Behavior

This example demonstrates a common pitfall in Groovy when using the `eachWithIndex` method.  The `return` statement inside the closure only exits the closure itself, not the method the `eachWithIndex` is part of.

## Bug Description:
The provided Groovy code uses `eachWithIndex` to iterate through a list. It includes a condition to stop iteration when a specific item is found ('stop'). However, due to the way `return` works within closures, the method continues to execute after the 'stop' item is encountered.

## Solution:
To correctly exit the method early, you should use a more appropriate control flow mechanism like a loop with an explicit `break`, or a conditional return outside the closure.