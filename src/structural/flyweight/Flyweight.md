🧠 Flyweight Pattern -- Key Concepts
-----------------------------------

-   **Intrinsic state**: Shared, immutable data stored inside the flyweight.

-   **Extrinsic state**: Passed in from the outside and can vary for each use of the flyweight.

### ✅ **Intrinsic State** (Shared):

-   **Stored inside the Flyweight object**

-   **Doesn't change**  from one use to another

-   Can be **shared across many contexts**

-   Should be **immutable**

### ✅ **Extrinsic State** (Contextual):

-   **Not stored inside the Flyweight**

-   Passed in by the **client at runtime**

-   **Varies**  between uses

-   Can't be shared; it's **context-specific**

* * * * *

🎯 How to Identify Intrinsic vs Extrinsic State
-----------------------------------------------

| Question to Ask | If "Yes", it's likely... | Example (Circle) |
| --- | --- | --- |
| Is this data **shared**  across all instances? | ✅ Intrinsic | Color (shared circles) |
| Does this data **change per use**  or user? | ✅ Extrinsic | x, y position |
| Is this data **immutable**  after creation? | ✅ Intrinsic | Radius (fixed size) |
| Is this data **calculated or injected at runtime**? | ✅ Extrinsic | Coordinates, labels |

💡 Rule of Thumb:
-----------------

-   **Intrinsic**: Shared, fixed, reused (store it in the flyweight).

-   **Extrinsic**: Contextual, variable (pass it in when needed).



When we say that **intrinsic values should be immutable**  in the **Flyweight pattern**, it means:

* * * * *

🧩 **Immutable = Cannot Be Changed After Creation**
---------------------------------------------------

In other words, once you create a flyweight object with its **intrinsic state**, that state **must not change**.

* * * * *

### ✅ Why Intrinsic State Should Be Immutable

1.  **Shared safely across multiple contexts or users**

    -   Multiple objects can use the same flyweight without worrying about interference.

2.  **Avoid data corruption or bugs**

    -   If one user modifies a shared object, it could unintentionally affect all other users.

3.  **Thread-safe (in many cases)**

    -   If the object never changes, it's inherently safe for concurrent use.