package ru.rvsproject.demobrowsergame.models;

/** Класс Строение */
public class Building {
    private Integer buildingId;
    private String title;
    private Integer level;
    private Integer people;

    public Building(){}

    /**
     * Конструктор класса building
     * @param buildingId - id Строения в БД
     * @param title - Название Строения
     * @param level - Уровень Строения
     * @param people - Количество людей, работающих в строении
    */
    public Building(Integer buildingId, String title, Integer level, Integer people) {
        this.buildingId = buildingId;
        this.title = title;
        this.level = level;
        this.people = people;
    }
}
