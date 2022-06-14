package ru.rvsproject.demobrowsergame.models;

import lombok.Data;

import javax.persistence.*;

/** Класс Место */
@Entity
@Table(name = "places")
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long placeId;
    @Column(name = "position")
    private Long positionOnMap;
    @Column(name = "playerId")
    private Long playerId;

    public Place() {}

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
