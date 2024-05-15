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
    private double speed = MIN_SPEED; // Current speed of the player
    private boolean isHackEnabled = false; // Flag to enable/disable the speed hack

    /**
     * Toggles the speed hack on or off.
     */
    public void toggleHack() {
        isHackEnabled = !isHackEnabled;
        if (!isHackEnabled) {
            speed = MIN_SPEED; // Reset speed when hack is disabled
        }
    }

    /**
     * Modifies the player's speed randomly within a small range and ensures it doesn't exceed predefined boundaries.
     */
    public void applyHack() {
        if (isHackEnabled) {
            double randomNumber = random.nextDouble() * 2 - 1; // Generate a random number between -1 and 1
            speed += randomNumber * 0.01; // Modify speed by a small factor to make changes less noticeable
            speed = Math.max(MIN_SPEED, Math.min(speed, MAX_SPEED)); // Ensure speed stays within the allowed range
        }
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
     * Identifies and returns the nearest target entity from a list of entities based on distance.
     * This method assumes entities have a getPosition() method returning their coordinates.
     */
    public Entity findNearestTarget(List<Entity> entities, Entity player) {
        if (entities.isEmpty()) {
            return null;
        }
        Entity nearest = entities.get(0);
        double nearestDistance = distance(player, nearest);

        for (Entity entity : entities) {
            double currentDistance = distance(player, entity);
            if (currentDistance < nearestDistance) {
                nearest = entity;
                nearestDistance = currentDistance;
            }
        }
        return nearest;
    }

    /**
     * Calculates the distance between two entities.
     */
    private double distance(Entity e1, Entity e2) {
        double dx = e1.getX() - e2.getX();
        double dy = e1.getY() - e2.getY();
        double dz = e1.getZ() - e2.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

/**
 * This class simulates auto-attack functionality in a game, allowing the player to attack a target entity.
 */
class AutoAttack {
    private static final long ATTACK_COOLDOWN = 1000; // Cooldown time in milliseconds
    private long lastAttackTime = 0;

    /**
     * Simulates an attack on a given entity if the attack cooldown has passed.
     * This method should be integrated with actual game mechanics for real-world use.
     */
    public void attack(Entity player, Entity target) {
        long currentTime = System.currentTimeMillis();
        if (target != null && isInRange(player, target) && (currentTime - lastAttackTime >= ATTACK_COOLDOWN)) {
            System.out.println("Attacking " + target.getName());
            lastAttackTime = currentTime;
        }
    }

    /**
     * Checks if the target is within attack range.
     */
    private boolean isInRange(Entity player, Entity target) {
        double distance = Math.sqrt(Math.pow(player.getX() - target.getX(), 2) +
                                    Math.pow(player.getY() - target.getY(), 2) +
                                    Math.pow(player.getZ() - target.getZ(), 2));
        return distance <= player.getAttackRange();
    }
}

/**
 * A class representing game entities, like players or mobs.
 */
class Entity {
    private String name;
    private double x, y, z; // Position coordinates
    private double attackRange = 1.0; // Default attack range

    public Entity(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }
}

/**
 * This class simulates an XRay hack that would theoretically allow players to see hidden items or resources.
 * For educational purposes, it provides a method to visualize underground minerals and chests.
 */
class XRay {
    private boolean isXRayEnabled = false;

    /**
     * Toggles the XRay hack on or off.
     */
    public void toggleXRay() {
        isXRayEnabled = !isXRayEnabled;
    }

    /**
     * Simulates the detection of underground resources such as minerals and chests.
     * This is a placeholder method and would need actual game data to function.
     */
    public void detectResources() {
        if (isXRayEnabled) {
            System.out.println("Detecting underground resources...");
            // This method would interact with the game's world data to reveal hidden items.
            // Simulating detection of some resources.
            System.out.println("Found: Diamond at (10, 15, 20)");
            System.out.println("Found: Gold at (5, 12, 18)");
            System.out.println("Found: Chest at (8, 10, 22)");
        }
    }
}
