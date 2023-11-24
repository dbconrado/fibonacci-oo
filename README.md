# The Fibonacci sequence problem, object-oriented

As a thought experiment, I tried my best to
implement an object-oriented solution to the Fibonacci sequence problem.

I tried to think about each number in the sequence as an object.
Each `Fib` object would be able to describe itself and to tell the
next `Fib` object in the sequence.

Another domain object would be a _Fibonacci sequence_ object, which
represents a sequence of `n` `Fib` objects. For that, I used a Kotlin sequence.

This project is unnecessarily overengineered but I like the result, anyway :-).
Hope you find it useful.
