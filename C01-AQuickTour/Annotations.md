- Annotations provide information about your program, or the elements of that program (classes, methods, fields, variables, and so forth), in a structured way that is amenable to automated processing by external tools.

- An annotation is considered a modifier (like public or static) and should appear before other modifiers, on a line of its own.

- It is indicated by an `@` character followed by the name of *annotation type* - in this case `@Reviewed`. 

- An annotation type is a special kind of interface, whose members are known as *elements*.

Here is the definition of our `Reviewed` annotation type:

`@interface Reviewed {
	String reviewer();
	int date();
}`

