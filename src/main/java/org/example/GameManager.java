package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private Hero hero;
    private List<Enemy> enemies = new ArrayList<>();

public void setupEnemies() {
    enemies.add(EnemyFactory.createCropGuard());
    //enemies.add(EnemyFactory.createBountyHunter("Rex"));
}
    public void setupHero(String classType, String subClass, String name) {
        hero = new Hero(classType, subClass, name, 100, 100, 20);
    }

    public void startGame() {
        setupHero("Fighter", "Street Samurai", "V");
        setupEnemies();
        // run game loop
    }


}
