package com.example.demo;

public class Player {
    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    String name;
    String nickname;

    @Override
    public String toString() {
        return "Player: " + name;
    }
}
