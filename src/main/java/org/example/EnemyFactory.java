package org.example;

public class EnemyFactory {
//    "Corp Guard", "Basic trained soldier, works in squads, calls backup",
//            "Razor Gang Member", "Aggressive melee, cheap implants, berserker rage",
//            "Netrunner Operative", "Hangs back, hacks your gear/HUD mid-fight",
//            "Bounty Hunter", "Tracks you specifically, adapts to your playstyle",
//            "Black Market Surgeon", "Cowardly alone, buffs nearby enemies with implants"
    public static Enemy createCropGuard() {
        return new HumanEnemy("Corp Guard", "Basic trained soldier, works in squads, calls backup","Franklin",100, 20, 10);
    }

    public static Enemy createRazorGangMember() {
        return new HumanEnemy("Razor Gang Member", "Aggressive melee, cheap implants, berserker rage","DeadHead",100, 20, 10);
    }
}
