The **Composite Pattern** is a structural design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. This pattern allows clients to treat individual objects and composites (groups of objects) uniformly. It is especially useful when dealing with hierarchical collections of objects, like directories in a file system or organizations in a company.

### Components of the Composite Pattern:

1.  **Component**: An interface or abstract class that defines the common operations for both individual objects (leaf nodes) and composite objects (nodes containing children).
2.  **Leaf**: A concrete class representing individual objects that do not have children. It implements the `Component` interface and performs the specific operations.
3.  **Composite**: A concrete class that represents a composite object, i.e., an object that contains other objects (children). It also implements the `Component` interface and can store and manage its children.