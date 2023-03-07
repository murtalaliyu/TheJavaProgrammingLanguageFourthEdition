- An exception is an object, with type, methods, and data. Representing exceptions as objects is useful, because an exception object can include data, methods, or both to report on or recover from specific kinds of exceptions.
- All exceptions must be subclasses of the class *Throwable*, which is the superclass of *Exception*.
- The paradigm for using exceptions is the *try-catch-finally* sequence: you try something; if that something throws an exception, you *catch* the exception; and *finally* you clean up from either the normal code path or the exception code path, whichever actually happened.
- You will use *finally* clauses for cleanup code that must always be executed. You can even have a *try-finally* statement with no *catch* clauses to ensure that cleanup code will be executed even if uncaught exceptions are thrown.
- Uncaught exceptions result in the termination of the thread of execution, but before it terminates the thread's *UncaughtExceptionHandler* is given the opportunity to respond to the exception as best it can - perhaps doing nothing more than reporting that the exception occurred.

### Checked Exceptions

- Checked exceptions represent conditions that, although exceptional, can reasonably be expected to occur, and if they do occur must be dealt with in some way - such as the `IOException` that may occur reading a file.
- *Checked exceptions* manage error handling. Checked exceptions force you to consider what to do with errors where they occur in the code. 
- If a checked exception is not handled, this is noticed at compile time, not at run time when problems have been compounded because of the unchecked error.
- If a method's execution can result in checked exceptions being thrown, it must declare the types of these exceptions in a *throws* clause (in the method signature for example). 
- A method can throw only those checked exceptions it declares - this is why they are called *checked exceptions*. It may throw those exceptions directly with *throw* or indirectly by invoking a method that throws exceptions.
- Declaring the checked exceptions that a method throws allows the compiler to ensure that the method throws only those checked exceptions it declared and no others. This check prevents errors in cases in which your method should handle another method's exceptions but does not. In addition, the method that invokes your method is assured that your method will not result in unexpected checked exceptions.

### Unchecked Exceptions

- Unchecked exceptions represent conditions that, generally speaking, reflect errors in your program's logic and cannot be reasonably recovered from at runtime (e.g., the `ArrayIndexOutOfBoundsException` thrown when you access outside the bounds of an array).
- Exceptions of type `RuntimeException`, `Error`, or subclasses of these exception types are *unchecked exceptions* and can be thrown anywhere, without being declared.
- Given that you can make errors writing any statement it would be totally impractical to have to declare or catch all the exceptions that could arise from those errors - hence they are unchecked.
