# Zoo Animals — Strategy Pattern (Java)

Short Java project demonstrating the **Strategy pattern** for animals in a zoo.
Each animal *composes* three interchangeable behaviors:

- **eat** (`eat` + `carnivoreEat`, `herbivoreEat`, `omnivoreEat`)
- **move** (`move` + `walkingMove`, `swimmingMove`, `flyingMove`, `slitherMove`)
- **sound** (`sound` + `growlSound`, `squeakSound`, `silentSound`)

The abstract base class `animal` holds these behaviors and exposes:
`performEat()`, `performMove()`, `performSound()` plus setters to swap strategies at runtime.

## Files (grouped)
- **Core / base**
  - `animal.java`, `eat.java`, `move.java`, `sound.java`
- **Eat strategies**
  - `carnivoreEat.java`, `herbivoreEat.java`, `omnivoreEat.java`
- **Move strategies**
  - `walkingMove.java`, `swimmingMove.java`, `flyingMove.java`, `slitherMove.java`
- **Sound strategies**
  - `growlSound.java`, `squeakSound.java`, `silentSound.java`
- **Animals (examples)**
  - `tiger.java`, `rhino.java`, `gorilla.java`, `giraffe.java`, `gator.java`, `hare.java`, `pig.java`, `raven.java`, `snake.java`, `unicorn.java`
- **Demos**
  - `Main.java` — tiny console demo (creates a `gator` and prints behaviors)
  - `test.java` — simple Swing UI with buttons to open small info windows

_All files use package `zoo`._

## How to run (CLI)
Compile everything from the folder that contains the `zoo` sources (or from project root):

```bash
# Compile
javac zoo/*.java

# Run console demo
java zoo.Main

# Run Swing demo (GUI)
java zoo.test
```

> Requires Java 8+ (or any recent JDK).

## Extend it (quick guide)
1. Create a new strategy by implementing `eat`, `move`, or `sound` and return a string.
2. Make a new animal class that `extends animal` and pass the strategies via the constructor.
3. (Optional) Swap behaviors at runtime with `setEatBehavior(...)`, `setMoveBehavior(...)`, `setSoundBehavior(...)`.

## Example (from `Main.java`)
```java
gator g = new gator(new carnivoreEat(), new swimmingMove(), new growlSound());
System.out.println(g.performEat());   // "I am a carnivore"
System.out.println(g.performMove());  // "I swim in water"
System.out.println(g.performSound()); // "I growl"
```
