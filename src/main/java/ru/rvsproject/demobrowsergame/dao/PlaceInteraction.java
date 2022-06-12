package ru.rvsproject.demobrowsergame.dao;

import ru.rvsproject.demobrowsergame.models.Building;

import java.util.ArrayList;

public class PlaceInteraction {

    /**
     * Игрок выбирает здание, которое хочет посмотреть
     * (Нажимает на иконку здания, открывается меню здания)
     */
    public Building getBuildingMenu() {
        return new Building();
    }

    /**
     * Игрок выбрал здание для улучшения
     */
    public Building upgradeBuilding() {
        return new Building();
    }

    /**
     * Игрок получает список строений
     */
    public ArrayList getListOfBuildings() {
        return new ArrayList();
    }
}
