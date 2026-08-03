package CoreJava.BehavioralPattern;

// Abstract class with template method
abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

// Concrete class 1
class Cricket extends Game {
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

// Concrete class 2
class Football extends Game {
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

// Client
public class TemplatePatternExample {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        // Output: Cricket Game Initialized! Start playing.
        // Output: Cricket Game Started. Enjoy the game!
        // Output: Cricket Game Finished!

        game = new Football();
        game.play();
        // Output: Football Game Initialized! Start playing.
        // Output: Football Game Started. Enjoy the game!
        // Output: Football Game Finished!
    }
}