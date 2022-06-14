package ru.rvsproject.demobrowsergame.dao;

import org.junit.jupiter.api.Test;
import ru.rvsproject.demobrowsergame.models.Player;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInteractionTest {

    @Test
    void checkRegistration() {
        UserInteraction userInteraction = new UserInteraction();
        String name = "Вася";
        String surname = "Жмышенко";
        Date birthday = new java.sql.Date(System.currentTimeMillis());
        String email = "lol@kek.kek";
        String password = "12345";
        Player player = new Player(name, surname, birthday, password, email);
        assertTrue(userInteraction.registration(player));
    }
}
