package org.example;

import java.util.List;

public class Chapter {
    private int chapterNumber;
    private String title;
    private String description;        // narrative intro text
    private String location;           // e.g. "Neon District", "Underground Tunnels"
    private List<Enemy> enemies;       // enemies in this chapter
    private boolean isCompleted;
    private String reward;             // what the player gets for completing it

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Chapter(int chapterNumber, String title, String description, String location, List<Enemy> enemies, String reward) {
        this.chapterNumber = chapterNumber;
        this.title = title;
        this.description = description;
        this.location = location;
        this.enemies = enemies;
        this.isCompleted = false;
        this.reward = reward;
    }

    public void start() {
        System.out.println("Chapter " + chapterNumber + ": " + title);
        System.out.println("---------------------------------------");
        System.out.println(description);
        System.out.println("Location: " + location);
    }

    public void complete() {
        this.isCompleted = true;
        System.out.println("Chapter " + chapterNumber + " complete!");
        System.out.println("Reward: " + reward);
    }
}
