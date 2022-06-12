package ru.rvsproject.demobrowsergame.dao;

import ru.rvsproject.demobrowsergame.models.Unit;

public class UnitInteraction {

    /**
     * Игрок получает список возможных юнитов
     */
    public Unit getListOfUnits() {
        return new Unit();
    }

    /**
     * Игрок указал, какой создать юнит
     */
    public Unit createUnit() {
        return new Unit();
    }

    /**
     * Игрок указал, какой высвободить юнит
     */
    public Unit deleteUnit() {
        return new Unit();
    }
}
