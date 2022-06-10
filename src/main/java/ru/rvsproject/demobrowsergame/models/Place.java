package ru.rvsproject.demobrowsergame.models;

/** Класс Место */
public class Place {
    private Long placeId;
    private Long positionOnMap;
    private Long playerId;

    /**
     * Конструктор класса Место
     * @param placeId - id Места в БД
     * @param positionOnMap - Позиция на карте
     * @param playerId - id Игрока в БД
     */
    public Place(Long placeId, Long positionOnMap, Long playerId) {
        this.placeId = placeId;
        this.positionOnMap = positionOnMap;
        this.playerId = playerId;
    }
}
