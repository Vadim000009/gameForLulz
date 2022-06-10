package ru.rvsproject.demobrowsergame.models;

/** Класс Юнит */
public class Unit {
    private Integer unitId;
    private String name;
    private Byte damagePoints;
    private Byte defensePoints;
    private Byte healthPoints;

    /**
     * Конструктор Юнит
     * @param unitId - Id Юнита в БД
     * @param name - имя Юнита
     * @param damagePoints - Очки урона Юнита
     * @param defensePoints - Очки защиты Юнита
     * @param healthPoints - Очки здоровья Юнита
     */
    public Unit(Integer unitId, String name, Byte damagePoints, Byte defensePoints, Byte healthPoints) {
        this.unitId = unitId;
        this.name = name;
        this.damagePoints = damagePoints;
        this.defensePoints = defensePoints;
        this.healthPoints = healthPoints;
    }
}
