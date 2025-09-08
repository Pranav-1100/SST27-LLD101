package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // Base + SpeedBoost + DamageBoost
        System.out.println("\n--- Base + SpeedBoost + DamageBoost ---");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();

        // Add GoldenAura (sprite change + buffs)
        System.out.println("\n--- With GoldenAura ---");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();

        // Remove GoldenAura by recomposing (rebuild chain without it)
        System.out.println("\n--- Remove GoldenAura ---");
        Character withoutAura = buffed; // removal by recomposition
        withoutAura.move();
        withoutAura.attack();
    }
}
