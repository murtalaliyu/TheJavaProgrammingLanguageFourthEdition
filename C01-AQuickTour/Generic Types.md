- Classes and interfaces can be declared to be *generic types*. A generic class or interface represents a family of related types

`interface List<T> {
	// ... methods of List ...
}`

- Where `?` on its own is the *unbounded wildcard*, that can represent any type, "`? extends X`" is the *bounded wildcard*: It can only represent the type *X* or any type that extends or implements *X* (depending on whether *X* is a class or interface). In *processValues( )* we know that, at worst, *table.find( )* will return a *Number*, so we can store that return value in a variable of type *Number*.
