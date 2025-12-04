Explain the difference between String, StringBuilder, and StringBuffer in Java with examples.
In Java, String, StringBuilder, and StringBuffer are used to store and manipulate text (sequence of characters), 
but they differ in mutability and thread safety.
String
Immutable (cannot be changed once created)
Every modification creates a new object in memory
More memory usage and slower when doing many changes
Good for constant text like messages, headings, labels
Example:
String s = "Hello";
s = s + " World"; // Creates new object in memory
StringBuilder
Mutable (can be changed without creating new objects)
Not thread-safe → faster than StringBuffer
Best for performance when a lot of modifications are needed
Used in single-thread applications
Example:
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
StringBuffer
Mutable like StringBuilder
Thread-safe (synchronized) → safe in multi-threading
Slightly slower than StringBuilder due to synchronization
Example:
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World"); // thread-safe modification
