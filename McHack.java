import java.util.List;
import java.util.Random;

/**
 * This class provides a simulation of speed modification in a game for educational purposes.
 * The methods include applying a random increment/decrement to the player's speed,
 * and setting or getting the current speed ensuring it remains within defined limits.
 */
public class SpeedHack {
    private static final Random random = new Random();
    private static final double MAX_SPEED = 0.4; // Upper limit of player's speed
    private static final double MIN_SPEED = 0.1; // Lower limit of player's speed
    private double speed; // Current speed of the player

    /**
     * Modifies the player's speed randomly within a small range and ensures it doesn't exceed predefined boundaries.
     */
    public void applyHack() {
        double randomNumber = random.nextDouble() * 2 - 1; // Generate a random number between -1 and 1
        speed += randomNumber * 0.01; // Modify speed by a small factor to make changes less noticeable
        speed = Math.max(MIN_SPEED, Math.min(speed, MAX_SPEED)); // Ensure speed stays within the allowed range
    }

    /**
     * Returns the current speed of the player.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets the player's speed to a specified value, ensuring it remains within the legal boundaries.
     */
    public void setSpeed(double speed) {
        this.speed = Math.max(MIN_SPEED, Math.min(speed, MAX_SPEED));
    }
}

/**
 * This class simulates auto-targeting functionality in a game, focusing on identifying the nearest entity.
 */
class AutoTarget {
    /**
     * Identifies and returns the nearest target entity from a list of entities.
     * This is a placeholder method and should be integrated with actual game logic.
     */
    public Entity findNearestTarget(List<Entity> entities) {
        return entities.isEmpty() ? null : entities.get(0); // Simplistic targeting: chooses the first entity
    }
}

/**
 * This class simulates auto-attack functionality in a game, allowing the player to attack a target entity.
 */
class AutoAttack {
    /**
     * Simulates an attack on a given entity.
     * This method should be integrated with actual game mechanics for real-world use.
     */
    public void attack(Entity target) {
        if (target != null) {
            System.out.println("Attacking " + target.getName());
        }
    }
}

/**
 * A class representing game entities, like players or mobs.
 */
class Entity {
    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/**
 * This class simulates an XRay hack that would theoretically allow players to see hidden items or resources.
 * For educational purposes, it provides a method to visualize underground minerals and chests.
 */
class XRay {
    /**
     * Simulates the detection of underground resources such as minerals and chests.
     * This is a placeholder method and would need actual game data to function.
     */
    public void detectResources() {
        System.out.println("Detecting underground resources...");
        // This method would interact with the game's world data to reveal hidden items.
    }
}
