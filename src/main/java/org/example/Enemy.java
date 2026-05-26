package org.example;

public class Enemy extends Player{
//here will setup the overall enemy class


//    🤖 Mechanical / Synthetic
//
//    Security Drone — Fast, low HP, travels in swarms, alerts nearby enemies
//    Enforcer Bot — Heavy armor, slow, devastating melee slam
//    Sentry Turret — Stationary, high damage, weak to hacking
//    Spider Crawler — Small, climbs walls/ceilings, plant explosives
//    Decommissioned Unit — Glitching, unpredictable behavior, erratic attacks
//
//
//'
    //👥 Human Enemies
//
//    Corp Guard — Basic trained soldier, works in squads, calls backup
//    Razor Gang Member — Aggressive melee, cheap implants, berserker rage
//    Netrunner Operative — Hangs back, hacks your gear/HUD mid-fight
//    Bounty Hunter — Tracks you specifically, adapts to your playstyle
//    Black Market Surgeon — Cowardly alone, buffs nearby enemies with implants
//
//

//🧬 Augmented / Mutant
//
//    Juicer — Overdosed on combat stims, massive strength, can't feel pain
//    Chimera Brute — Gene-spliced monster, unpredictable mix of abilities
//    Necrospiced — Corpse reanimated by illegal biotech implants
//    Spliced Assassin — Chameleon skin, retractable blades, ambush predator
//
//
//💻 Digital / Cyber Threats
//
//    Ghost Program — AI entity that jumps between machines and drones
//    ICE Guardian — Defensive program that attacks Netrunners in cyberspace
//    Viral Agent — Infects your implants, drains abilities over time
//    Rogue AI — Boss-tier, controls entire building systems against you
//
//
//🏢 Corporate Elites
//
//    Executive Asset — Cowardly, summons endless waves of guards
//    Corporate Assassin — Stealth, precision, premium implants, very dangerous
//    Black Division Agent — Government black ops, full military grade gear
//    Fixer Turncoat — Former ally, knows your tactics, fights smart
//
//
//👑 Boss Tier
//
//    The Architect — Rogue AI that has taken a physical form
//    Ironclad — Former hero turned full chrome cyborg enforcer
//    The Surgeon — Harvests player implants mid-fight to power himself up
//    Ghost — Netrunner who exists simultaneously in digital and physical space
//    The Overseer — Corporate executive in a full military mech suit

    public Enemy(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }
}
