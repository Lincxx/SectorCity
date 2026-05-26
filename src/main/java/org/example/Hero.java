package org.example;

import java.util.HashMap;
import java.util.Map;

public class Hero extends Player{

    private final String classType;
    private final String subClass;
    private static final String[] classTypes = {"Fighter", "Tech & Hacking", "Guns & Stealth", "Bio & Exotic", "Social & Shadow"};
    private static final Map<String, String> classFightersDescriptions = Map.of(
            "Street Samurai", "Augmented melee warrior, lives by a code, sells their blade to the highest bidder",
            "Razor Punk", "Scrappy brawler with improvised cyber-implants, fights dirty",
            "Chrome Monk", "Martial artist who blends ancient discipline with cybernetic enhancement"
    );

    private static Map<String, String> classTechDescriptions = new HashMap<>();
    private static Map<String, String> classGunsDescriptions = new HashMap<>();
    private static Map<String, String> classBioDescriptions = new HashMap<>();
    private static Map<String, String> classSocialDescriptions = new HashMap<>();


//    Street-Level Fighters
//
//    Street Samurai — Augmented melee warrior, lives by a code, sells their blade to the highest bidder
//    Razor Punk — Scrappy brawler with improvised cyber-implants, fights dirty
//    Chrome Monk — Martial artist who blends ancient discipline with cybernetic enhancement
//
//    Tech & Hacking
//
//    Netrunner — Dives into the digital underworld, hacks systems and minds
//    Ghost Coder — Invisible in both meat and cyberspace, leaves no trace
//    Rig Jockey — Controls drones and machines remotely from a distance
//
//
//    Guns & Stealth
//
//    Neon Wraith — Silent assassin, cloaking tech, one-shot specialist
//    Gunslinger — Fast-draw reflex implants, lives for the duel
//    Voidhunter — Bounty hunter, tracker, works both sides of the law
//
//
//    Bio & Exotic
//
//    Flesh Weaver — Uses illegal biotech to heal, poison, or mutate
//    Synth Shaman — Blends street mysticism with neural implants
//    Chimera — Heavily gene-spliced, part human part something else
//
//        Social & Shadow
//
//    Fixer — Knows everyone, brokers deals, pulls strings from the shadows
//    Siren — Manipulation, pheromone implants, social engineering master
//    Corporate Defector — Ex-exec with insider knowledge and dangerous secrets

    public Hero(String classType, String subClass, String name, int healthPoints, int damage, int defense) {
        super(name, healthPoints, damage, defense);
        this.classType = classType;
        this.subClass = subClass;
    }

    public static String[] getClassTypes() {
        return classTypes;
    }

    public static Map<String, String> getClassFighterDescription() {
        return classFightersDescriptions;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "classType='" + classType + '\'' +
                ", " +"subClassType='" + subClass + '\'' +
                "name='" + getName() + '\'' +
                ", healthPoints=" + getHealthPoints() +
                ", damage=" + getDamage() +
                '}';
    }
}
