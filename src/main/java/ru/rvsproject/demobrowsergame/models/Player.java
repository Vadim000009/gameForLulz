package ru.rvsproject.demobrowsergame.models;

import lombok.Data;

import javax.persistence.*;

import java.sql.Date;

/** Класс Игрок */
@Entity
@Table(name = "players")
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long playerId;
    @Column(name = "name", nullable = false, length = 30)
    private String name;
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;
    @Column(name = "birthday", nullable = false)
    private Date birthday;
    @Column(name= "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;
    @Column(name = "about")
    private String about;

    public Player() {}

    /**
     * Конструктор Игрок (Регистрация)
     * @param name - Имя Игрока
     * @param surname - Фамилия Игрока
     * @param birthday - Дата рождения Игрока
     * @param password - Пароль Игрока
     * @param email - Емейл Игрока
     */
    public Player(String name, String surname, Date birthday, String password, String email) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
    }

    /**
     * Конструктор Игрок
     * @param playerId - Id Игрока в БД
     * @param name - Имя Игрока
     * @param surname - Фамилия Игрока
     * @param birthday - Дата рождения Игрока
     * @param about - Инофрмация об Игроке
     */
    public Player(Long playerId, String name, String surname, Date birthday, String about) {
        this.playerId = playerId;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.about = about;
    }
}
