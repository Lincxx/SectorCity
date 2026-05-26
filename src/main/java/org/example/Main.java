package org.example;

import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        System.out.println("Welcome to Sector City");
        System.out.print("---------------------------------------");
        System.out.println("\n\nThis is a text-based RPG game set in a dystopian future where players take on the role of heroes in a dangerous\nand complex world.\n");
        System.out.println("The game features a variety of classes, each with their own unique abilities and playstyles, allowing players to \ncustomize their character and approach to combat.\n");
        System.out.println("Players can choose from a range of classes, including street-level fighters, tech and hacking specialists, gunners,\nbiohackers, and social manipulators, each with their own strengths and weaknesses.\n");
        System.out.println("The game is designed to be challenging and exciting, with a variety of gameplay elements and challenges to navigate.\n");
        System.out.println("Players can level up their characters by completing quests, defeating enemies, and earning experience points,\nunlocking new abilities and upgrades along the way.\n");


        //Picking a class
        System.out.print("\n\n---------------------------------------\n\n");
        String[] h = Hero.getClassTypes();
        for (int i = 0; i < h.length; i++) {
            System.out.println(i+1 +". " + h[i]);
        }
        System.out.println("\n\n---------------------------------------\n");
        System.out.println("What class would you like to play?");
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String heroChoice = h[choice-1];
        System.out.println("You chose: " + heroChoice);

        //Picking a Subclasses
        System.out.println("\n\n----------------------------------------\n");
        Map<String, String> subClass = Hero.getClassFighterDescription();
        int i = 1;
        for (Map.Entry<String, String> entry : subClass.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " - " + entry.getValue());
            i++;
        }
        System.out.println("\n\n----------------------------------------\n");
        System.out.println("Pick your subclass: ");
        System.out.print("> ");

        int pickedSubClass = sc.nextInt();
        String subClassChoice = subClass.keySet().toArray(new String[0])[pickedSubClass-1];
        System.out.println("You chose " + subClassChoice);

        //Pick you char name
        System.out.println("---------------------------------------\n");
        System.out.print("What is your name? ");
        String charName = sc.next();

        //Welcome to the game
        System.out.println("Welcome to Sector City");
        System.out.println("---------------------------------------\n");
        //System.out.println("What class would you like to play?");

        Hero hero = new Hero(heroChoice, subClassChoice,charName, 100, 100, 20);

        System.out.println(hero.toString());


        sc.close();
    }
}
