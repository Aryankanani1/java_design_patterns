# Hungry Coders Java Repo

A hands-on collection of Java examples covering core language features, the
collections framework, concurrency, Java 8+ features, I/O, and the classic
Gang-of-Four design patterns. Each topic lives in its own package with small,
self-contained, runnable examples.

## Prerequisites

- **JDK 21** (the project targets `--source/--target 18`, built and tested on JDK 21)
- **Maven 3.x**

## Build & Run

```bash
# Compile everything
mvn clean compile

# Run a specific example (each example has its own main method)
java -cp target/classes design_pattern.creational_patterns.abstract_factory.Room
```

## Project Structure

All sources live under `src/main/java/`:

| Package | What it covers |
|---|---|
| `CoreJava` | OOP, Java features, and pattern write-ups (architectural, behavioral, creational, structural) |
| `Collections` | Lists, Maps, Sets, Queues, Stacks, HashTables, Iterators |
| `Multithreading` | Basic thread ops, synchronization & communication, concurrency utilities |
| `ThreadPoolAndExecutors` | Executor service and thread-pool examples |
| `CallableAndFuture` | `Callable`, `Future`, and `FutureTask` |
| `Java8Features` | Lambdas, functional interfaces, Streams, Optional, Date/Time, default methods |
| `Generics` | Generic classes/methods, bounded types, wildcards, type inference |
| `IO` | File handling, serialization & deserialization |
| `NIO` | Channels, buffers, paths, files, watch service |
| `reflextion` | Reflection basics |
| `design_pattern` | GoF design patterns (see below) |

## Design Patterns

The `design_pattern` package is organized **by pattern category**, and within
each category **by pattern**.

### Creational patterns (`design_pattern/creational_patterns/`)

```
creational_patterns/
├── singleton/            # Eager, lazy, inner-class, and other Singleton variants
├── factory_method/
│   ├── logger/           # Logger factory example
│   ├── document/         # Document/application factory example
│   └── notification/     # Email/SMS notification factory example
├── abstract_factory/     # Furniture factory example
│   ├── Room.java              # Client
│   ├── factory/               # FurnitureFactory (abstract factory)
│   ├── abstract_products/     # Chair, Sofa, CoffeeTable
│   ├── concrete_factories/    # ModernFurniture, VictorianFurniture
│   └── concrete_products/     # modern_furniture/, victorian_furniture/
├── builder/              # Builder pattern (+ mini_project/)
└── prototype/            # Prototype pattern with a prototype registry
```

### Structural patterns (`design_pattern/structural_pattern/`)

```
structural_pattern/
└── adapter_pattern/      # Adapter example (+ adapter_mini_project/)
```

## Notes

- Each example class typically contains its own `main` method so it can be run
  independently.
- Package names mirror the folder layout, following standard Maven conventions.
