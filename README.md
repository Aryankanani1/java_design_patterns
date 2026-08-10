# Java Design Patterns

A hands-on collection of the classic **Gang-of-Four** design patterns implemented
in Java. Each pattern lives in its own package with a small, self-contained,
runnable example (each example class has its own `main` method).

The code is organized **by category**, and within each category **by pattern**.

## Build & Run

Package names mirror the folder layout (`design_pattern.<category>.<pattern>`),
so you can compile and run any example straight from the repo root:

```bash
# Compile a single example (and its package)
javac design_pattern/behavioural_pattern/state_pattern/*.java

# Run it (fully-qualified main class)
java design_pattern.behavioural_pattern.state_pattern.StatePattern
```

## Patterns

### Creational patterns (`design_pattern/creational_patterns/`)

```
creational_patterns/
├── singleton/            # Eager, lazy, inner-class, and other Singleton variants
├── factory_method/
│   ├── logger/           # Logger factory example
│   ├── document/         # Document/application factory example
│   └── notification/     # Email/SMS notification factory example
├── abstract_factory/     # Furniture factory example (Room client)
├── builder/              # Builder pattern (+ mini_project/)
└── prototype/            # Prototype pattern with a prototype registry
```

### Structural patterns (`design_pattern/structural_pattern/`)

```
structural_pattern/
├── adapter_pattern/      # Adapter example (+ adapter_mini_project/)
├── decorator_pattern/    # Decorator example (coffee + add-ons)
├── faced_pattern/        # Facade example (home theater)
├── composite_pattern/    # Composite example (file system tree)
└── proxy_pattern/        # Proxy example (lazy-loading image)
```

### Behavioral patterns (`design_pattern/behavioural_pattern/`)

```
behavioural_pattern/
├── command_pattern/      # Command example (remote control + light)
├── observer_pattern/     # Observer example (subject notifies observers)
├── state_pattern/        # State example (order lifecycle: new → packed → shipped)
└── mediator_pattern/     # Mediator example (chat room routes messages between users)
```

## Notes

- Each example class typically contains its own `main` method so it can be run
  independently.
- Package names follow the folder layout, using standard Java package conventions.
