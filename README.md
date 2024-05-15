# Minecraft-Hack-Package
A Minecraft hack package comments explaining code

## SpeedHack Class:
This class is responsible for manipulating the player's speed within predefined limits. It randomly alters the speed slightly to make the changes less noticeable while ensuring it stays within a safe range between a defined maximum and minimum speed. It also includes functionality to toggle the speed hack on and off.

## AutoTarget Class:
This class simulates the ability to automatically target the nearest entity, such as another player or a mob, within the game. The targeting logic has been improved to find the nearest entity based on distance.

## AutoAttack Class:
The AutoAttack class enables the simulation of attacking a targeted entity. It includes a method that outputs a message indicating an attack on the entity, serving as a placeholder for more complex game logic. An attack cooldown has been added to prevent continuous attacks, and it also checks if the target is within attack range.

## Entity Class:
This utility class represents a game entity with basic attributes, such as name and position coordinates (x, y, z). It's used by the AutoTarget and AutoAttack classes to demonstrate interactions with game entities. The class also includes an attack range attribute.

## XRay Class:
The XRay class demonstrates a potential feature where players could see hidden underground resources, like minerals and chests. It includes a method to toggle the XRay hack on and off and simulates the detection of hidden resources.
