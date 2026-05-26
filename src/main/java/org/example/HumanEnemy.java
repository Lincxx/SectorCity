package org.example;

import java.util.Map;

public class HumanEnemy extends Enemy {
    private final String subClass;
    private final String description;
//    private static final Map<String, String> classHumanDescriptions = Map.of(
//            "Corp Guard", "Basic trained soldier, works in squads, calls backup",
//            "Razor Gang Member", "Aggressive melee, cheap implants, berserker rage",
//            "Netrunner Operative", "Hangs back, hacks your gear/HUD mid-fight",
//            "Bounty Hunter", "Tracks you specifically, adapts to your playstyle",
//            "Black Market Surgeon", "Cowardly alone, buffs nearby enemies with implants"
//    );

    //👥 Human Enemies
//
//    Corp Guard — Basic trained soldier, works in squads, calls backup
//    Razor Gang Member — Aggressive melee, cheap implants, berserker rage
//    Netrunner Operative — Hangs back, hacks your gear/HUD mid-fight
//    Bounty Hunter — Tracks you specifically, adapts to your playstyle
//    Black Market Surgeon — Cowardly alone, buffs nearby enemies with implants
//
//
    public HumanEnemy(String subClass, String description, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.subClass = subClass;
        this.description = description;
    }


}
