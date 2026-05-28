package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main(String[] args) {
        GameManager game = new GameManager();
        game.startGame();
        System.out.println(game.getHero()  );



//        ArrayList<Room> map = new ArrayList<>();
//        Room room1 = new Room("Cyberware Dealers", "F-Ard is the owner of the house...well sort of", -1, 1, 2, -1);
//        Room room2 = new Room("Cyberware Dealers", "F-Ard is the owner of the house...well sort of", -1, -1, -1, 0);
//        Room room3 = new Room("Cyberware Dealers", "F-Ard is the owner of the house...well sort of", 0, 3, -1, -1);
//        Room room4 = new Room("Cyberware Dealers", "F-Ard is the owner of the house...well sort of", -1, -1, 2, -1);
//
//        map.add(room1);
//        map.add(room2);
//        map.add(room3);
//        map.add(room4);

    }
}
