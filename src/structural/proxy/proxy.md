There are **four main types** of proxy patterns, each serving a different purpose based on the requirements of the application. These types are:

### 1\. **Virtual Proxy**

-   **Purpose**: This proxy is used to delay the creation or initialization of an object until it is actually needed.
-   **Example**: In a scenario where creating an object is costly (e.g., downloading a large file or creating a complex database connection), the virtual proxy can defer the creation of the real object until it's actually required by the client.
-   **Use Case**: Lazy initialization or memory optimization.

### 2\. **Protection Proxy**

-   **Purpose**: This proxy controls access to an object by providing different levels of access permissions. It can protect sensitive operations from unauthorized access.
-   **Example**: The protection proxy could restrict certain methods to be accessible only by specific users or groups, such as preventing certain operations in a system unless the user has the right permissions.
-   **Use Case**: Security, access control, and permission management.

### 3\. **Remote Proxy**

-   **Purpose**: This proxy represents an object in a different address space, typically used when dealing with distributed systems where objects in one machine need to be accessed by a client on a different machine.
-   **Example**: In a client-server application, a remote proxy would act as a placeholder for an object that is located on a different machine. The proxy handles the communication (like network calls) and delegates the request to the actual object.
-   **Use Case**: Distributed systems, network communication.

### 4\. **Cache Proxy**

-   **Purpose**: This proxy stores the result of a method call and returns the cached value for subsequent calls, thus improving performance by avoiding redundant calculations or expensive operations.
-   **Example**: If an object fetches data from a database or an external API, the cache proxy can store the result and return it for any subsequent requests, reducing the load on the database or network.
-   **Use Case**: Caching and performance optimization.

### 5\. **Smart Proxy**

-   **Purpose**: This proxy provides additional functionality beyond just controlling access to an object. For example, it may keep track of how many references are made to an object or implement reference counting (memory management).
-   **Example**: A smart proxy might manage the lifecycle of an object, cleaning it up when no longer in use, or could track the number of times the object has been accessed and perform specific actions based on this count.
-   **Use Case**: Resource management, memory management, and monitoring.

### Summary of Proxy Types:

1.  **Virtual Proxy** - Delays object creation.
2.  **Protection Proxy** - Controls access to the object.
3.  **Remote Proxy** - Represents an object in a different address space (distributed systems).
4.  **Cache Proxy** - Caches method results to improve performance.
5.  **Smart Proxy** - Provides additional functionality like reference counting or resource management.

Each type of proxy serves a different purpose but follows the same general pattern of controlling access to a real object.

| Proxy Type | Key Feature | Common Use Case |
| --- | --- | --- |
| **Virtual Proxy** | Lazy loading | GUI images, large files |
| **Protection Proxy** | Access control | Role-based document editing |
| **Remote Proxy** | Network communication | RPC, REST clients, cloud service stubs |
| **Smart Proxy** | Extra behavior (logging, caching, etc.) | Logging access, retrying, caching |
| **Cache Proxy** | Store and reuse previous results | API response caching |
| **Firewall Proxy** | Filters access to resources | Network proxies, reverse proxies |
| **Synchronization Proxy** | Thread-safe access | Shared resources in multi-threading |
| **Smart Reference Proxy** | Track object usage (ref counting) | COM, garbage collection systems |