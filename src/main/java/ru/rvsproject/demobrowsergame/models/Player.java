package ru.rvsproject.demobrowsergame.models;

import java.sql.Date;

/** Класс Игрок */
public class Player {
    private Long playerId;
    private String Name;
    private String Surname;
    private Long placeId;

    /**
     * Конструктор Игрок
     * @param playerId - Id Игрока в БД
     * @param name - Имя Игрока
     * @param surname - Фамилия Игрока
     * @param placeId - Id Места Игрока в БД
     */
    public Player(Long playerId, String name, String surname, Long placeId) {
        this.playerId = playerId;
        Name = name;
        Surname = surname;
        this.placeId = placeId;
    }
}
