To design an immutable class in Java, we need to ensure the following:

Declare the class as final to prevent subclassing.
Mark all fields as private and final to ensure they cannot be modified after initialization.
Initialize all fields via the constructor, and do not provide setters.
Ensure any mutable fields are deeply copied during object construction and access to avoid modifications from outside the class.
Override the toString, equals, and hashCode methods for better debugging and consistency.


Key Points:
1.The Address class is also immutable.
2.The Date object is copied when passed to the constructor and when retrieved.
3.The List<Address> is copied during initialization, and an unmodifiable view is returned to prevent external modifications.